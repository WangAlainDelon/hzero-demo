package org.hzero.train.todoservice.app.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.hzero.train.todoservice.app.service.UserService;
import org.hzero.train.todoservice.domain.entity.Task;
import org.hzero.train.todoservice.domain.entity.User;
import org.hzero.train.todoservice.domain.repository.TaskRepository;
import org.hzero.train.todoservice.domain.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import io.choerodon.core.exception.CommonException;

/**
 * 用户应用服务实现
 */
@Service
public class UserServiceImpl implements UserService {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public UserServiceImpl(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User create(User user) {
        userRepository.insert(user);
        return user;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long userId) {
        User exist = userRepository.selectByPrimaryKey(userId);
        if (exist == null) {
            throw new CommonException("htdo.warn.user.notFound");
        }
        // 删除用户
        userRepository.deleteByPrimaryKey(userId);
        // 删除与用户关联的任务
        List<Task> tasks = taskRepository.selectByEmployeeId(userId);
        if (CollectionUtils.isNotEmpty(tasks)) {
            taskRepository.batchDelete(tasks);
        }
    }
}