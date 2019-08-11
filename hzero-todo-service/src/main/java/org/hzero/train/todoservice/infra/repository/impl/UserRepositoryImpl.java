package org.hzero.train.todoservice.infra.repository.impl;

import org.hzero.train.todoservice.domain.entity.User;
import org.hzero.train.todoservice.domain.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;


/**
 * 用户资源库实现
 */
@Component
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {

}