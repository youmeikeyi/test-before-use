package com.meki.test.dao;

import com.meki.test.model.User;
import org.springframework.context.annotation.Scope;

/**
 * User: jinchao.xu
 * Date: 14-10-31
 * Time: 上午11:46
 */
public interface UserDAO {

    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
