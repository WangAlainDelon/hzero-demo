package org.hzero.train.todoservice.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import org.hzero.train.todoservice.domain.entity.Task;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wangxiang
 * Date: 2019/8/11
 * To change this template use File | Settings | File Templates.
 */
public interface TaskMapper extends BaseMapper<Task> {
    /**
     * 查询任务
     *
     * @param params 任务查询参数
     * @return Task
     */
    List<Task> selectTask(Task params);
}
