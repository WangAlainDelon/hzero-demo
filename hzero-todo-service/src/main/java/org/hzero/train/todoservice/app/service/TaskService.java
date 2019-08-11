package org.hzero.train.todoservice.app.service;


import org.hzero.train.todoservice.domain.entity.Task;

/**
 * 任务应用服务
 */
public interface TaskService {

    /**
     * 创建任务
     *
     * @param task 任务
     * @return Task
     */
    Task create(Task task);

    /**
     * 更新任务
     *
     * @param task 任务
     * @return Task
     */
    Task update(Task task);

    /**
     * 根据任务编号删除
     *
     * @param taskNumber 任务编号
     */
    void deleteByTaskNumber(String taskNumber);
}