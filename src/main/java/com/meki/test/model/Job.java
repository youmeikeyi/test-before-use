package com.meki.test.model;


/**
 * User: jinchao.xu
 * Date: 14-12-1
 * Time: 下午5:53
 */
public class Job {
    private int id;
    private String name;
    private int status;

    // --- more
    private String statusStr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

}
