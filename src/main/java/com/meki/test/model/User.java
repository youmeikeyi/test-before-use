package com.meki.test.model;

import java.util.Date;

/**
 * User: jinchao.xu
 * Date: 14-10-31
 * Time: 上午11:46
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
