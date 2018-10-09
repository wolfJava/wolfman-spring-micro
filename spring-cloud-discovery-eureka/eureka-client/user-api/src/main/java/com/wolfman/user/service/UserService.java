package com.wolfman.user.service;

import com.wolfman.user.domain.User;

import java.util.Collection;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 保存用户
     *
     * @param user
     * @return 如果保存成功的话，返回<code>true</code>，
     * 否则返回<code>false</code>
     */
    public boolean save(User user);

    /**
     * 查询所有的用户对象
     *
     * @return 不会返回<code>null</code>
     */
    public Collection<User> findAll();


}
