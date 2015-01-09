package com.meki.test.model;

import java.util.List;

/**
 * User: jinchao.xu
 * Date: 14-12-1
 * Time: 下午4:09
 */
public class HisData {

    private List<Education> educationList;
    private List<Company> companyList;
    private List<Project> projectList;

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
