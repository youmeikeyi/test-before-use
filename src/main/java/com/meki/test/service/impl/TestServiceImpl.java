package com.meki.test.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.meki.play.util.HttpClientUtil;
import com.meki.test.model.*;
import com.meki.test.service.TestService;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * User: jinchao.xu
 * Date: 14-10-31
 * Time: 上午11:24
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getTestInfo() {
        return "test info";
    }

    public static void main(String[] args){
        String result = HttpClientUtil.doGet("http://115.28.212.39:12345?cmd=people_match&uid=1273211514987413858");
        System.out.println(result);
//        JSONArray jsonArray = new JSONArray(5);
//        jsonArray.add(222222);
//        jsonArray.add(333333);
//        jsonArray.add(444444);
//        System.out.println(jsonArray);
//        String test = "[1271817909139967410, 1155463437317885673, 1165713108558942829]";
//        List<Long> similarRidList = getJavaCollection(1273211514987413858L, test);
//        for (Long rid: similarRidList){
//            System.out.println(rid);
//        }

    }

 /*   public static String toStringUtf8(ByteString byteString) {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }*/

    private static  <T> List<T> getJavaCollection(T clazz, String jsonArray){
        List<T> result = new ArrayList<T>();
        JSONArray array = JSON.parseArray(jsonArray);
        if (array != null) {
            Iterator<Object> iterator = array.iterator();
            while (iterator.hasNext()){
                result.add((T) iterator.next());
            }
            return result;
        }
        return result;
    }

    private static void getAvailableCount(){
        JSONObject jsonObject = new JSONObject();
        JSONObject left =new JSONObject();
        left.put("left", 12);
        jsonObject.put("code", 0);
        jsonObject.put("msg","");
        jsonObject.put("data", left);
        System.out.println(jsonObject);
    }

    private static void getRelatedJob(){
        JSONObject belongs = new JSONObject();
        JSONObject ini = new JSONObject();
        List<Job> jobList = new ArrayList<Job>();
        Job job = new Job();
        job.setId(1);
        job.setName("Java工程师");
        job.setStatus(0);
        job.setStatusStr("已联系");
        jobList.add(job);
        ini.put("jobList", jobList);
        belongs.put("code", 0);
        belongs.put("data", ini);
        belongs.put("msg", "");
        System.out.println(belongs);
    }

    private static void sort(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }

    private static void getResumeJson(){
        JSONObject resumeJson = new JSONObject();
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setBirthday("1988");
//        personalInfo.setContact("13333333333");
        personalInfo.setGender(0);
//        personalInfo.setEmail("example@renren.com");
        personalInfo.setGivenName("jinchao");
        personalInfo.setFamilyName("xu");
        personalInfo.setImg("http://head.com");
        personalInfo.setPosition("最近工作岗位");
        personalInfo.setCompany("最近工作公司");
        personalInfo.setWorkYear(5);
        personalInfo.setShowContact(false);
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setEmail("example@renren.com");
        contactInfo.setTelephone("13333333333");
        contactInfo.setCreateDate(DateTime.now().toString("yyyy/MM/dd hh:mm:ss"));
        //if showContact is true, add it to PersonalInfo

        Education education = new Education();
        education.setDegree("硕士");
        education.setName("北京大学");
        education.setDescription("Desc");
        education.setStartYear(2011);
        education.setEndYear(2014);
        education.setMajor("软件工程");
//        System.out.println("eduJson:" + educationArray);
        //TODO 计算工作年限 从最早一次工作开始时间到本年的差值
        Company company = new Company();
        company.setName("华为技术有限公司");
        company.setPosition("软件工程师/项目经理");
        company.setStartYear(2001);
        company.setEndYear(2005);
        company.setDepartment("通信/电信/网络设备");
        company.setDescription("在数据通信领域从事高端路由器产品NetEngine80的开发工作三年，总工办" +
                " 公室工作一年，曾获得2003年度金牌开发团队奖；集中工作在vxworks+powerpc环境" +
                " 下，对系统架构、TCP/IP体系下的多种协议与组网有深入了解。");
        List<Company> companies = new ArrayList<Company>(5);
        companies.add(company);
//        companies.add(company);

        List<Education> educations = new ArrayList<Education>(3);
        educations.add(education);
//        educations.add(education);

        HisData hisData =  new HisData();
        hisData.setCompanyList(companies);
        hisData.setEducationList(educations);

//        System.out.println("hisData:"+JSON.toJSON(hisData));
        Resume resume = new Resume();
        resume.setId(1111);
        resume.setAge(20);
        resume.setHisData(hisData);
        resume.setSpeciality("\n" +
                "\n" +
                "嵌入式  java netscreen    操作系统   j2me vxworks\n");
        resume.setPersonalInfo(personalInfo);
        resume.setOverview("精通嵌入式操作系统，阅读过Vxworks，Java虚拟机(J2ME)");
//        System.out.println();
        resumeJson.put("data", JSON.toJSON(resume));
//        System.out.println("resumeJson:" + JSON.toJSON(resume));
        System.out.println();
        resumeJson.put("code", 0);
        resumeJson.put("msg", "");
        System.out.println(resumeJson);
    }

    private static void getContact(){
        //返回0代表成功，显示联系方式；否则弹层,1代表获取数量达到上限，2代表今日推荐未处理完，3代表已到上限可先匹配职位
        JSONObject contact = new JSONObject();
        contact.put("code", 0);
        JSONObject inner = new JSONObject();
//        inner.put("status", 1); //code = 1
//        inner.put("reason","获取数量达到上限");
//        inner.put("status", 2); // code = 1
//        inner.put("reason","今日推荐未处理完");
//        inner.put("status", 3);   //code = 1
//        inner.put("reason", "已到上限可先匹配职位");
        inner.put("resumeId", 2);
        inner.put("email", "example@renren.com");
        inner.put("telephone", "13333333333");
        inner.put("status", 0 );
        inner.put("reason", "");
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setResumeId(2);
        contactInfo.setEmail("example@renren.com");
        contactInfo.setTelephone("1333333333");
        contact.put("msg","failed");
        contact.put("data", inner);
        System.out.println("contact: "+contact);
    }

    private static void getCommentList(){
        JSONObject jsonObject = new JSONObject();
        List<Tag> tagList = new ArrayList<Tag>();
        Tag tag = new Tag();
        tag.setId(1);
        tag.setName("电话未接听");

        tagList.add(tag);
        Comment comment = new Comment();
        comment.setId(2);
        comment.setJobId(1);
        comment.setJobName("Java 工程师");
        comment.setTagList(tagList);
        comment.setComment("some comment");
        DateTime dateTime = new DateTime();
//        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
//        //时间解析
//        DateTime dateTime2 = DateTime.parse("2012-12-21 23:22:45", format);
        comment.setCreateDate(dateTime.toString("yyyy/MM/dd HH:mm:ss"));

        jsonObject.put("code", 0);
        jsonObject.put("data", JSON.toJSON(comment));
        jsonObject.put("msg", "");
        System.out.println(jsonObject);
    }

    private static void getSimilarResumeList(){
        JSONObject jsonObject = new JSONObject();
        List<PersonalInfo> similarList = new ArrayList<PersonalInfo>();
        PersonalInfo similar = new PersonalInfo();
        similar.setImg("http://head.com");
        similar.setCompany("所在公司");
        similar.setPosition("Java 工程师");
        similar.setLocation("北京");
        similar.setWorkYear(3);

        similarList.add(similar);
        JSONObject inner = new JSONObject();
        inner.put("similarList", similarList);
        jsonObject.put("code", 0);
        jsonObject.put("data",inner);
        jsonObject.put("msg", "");
        System.out.println(jsonObject);
    }
}
