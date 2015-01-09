package com.meki.test.model;

/**
 * User: jinchao.xu
 * Date: 14-12-1
 * Time: 下午3:04
 */
public class Resume {

    private int id;//对应protobuf uid
    private PersonalInfo personalInfo;
    private HisData hisData;
    private String overview;
    private String speciality;//技能特长
    private String tag;
    private String ftag;
    private String headline;
    private String origUid;
    private String updateDate;
    private int headhunterId;//guess 哪个猎头上传的简历
    private String origText;

    //-------------------------//
    private String calling;//称呼语：先生、女士
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public HisData getHisData() {
        return hisData;
    }

    public void setHisData(HisData hisData) {
        this.hisData = hisData;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getFtag() {
        return ftag;
    }

    public void setFtag(String ftag) {
        this.ftag = ftag;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getOrigUid() {
        return origUid;
    }

    public void setOrigUid(String origUid) {
        this.origUid = origUid;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public int getHeadhunterId() {
        return headhunterId;
    }

    public void setHeadhunterId(int headhunterId) {
        this.headhunterId = headhunterId;
    }

    public String getOrigText() {
        return origText;
    }

    public void setOrigText(String origText) {
        this.origText = origText;
    }

    public String getCalling() {
        return calling;
    }

    public void setCalling(String calling) {
        this.calling = calling;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
