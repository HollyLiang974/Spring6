package com.hzaucoi.spring6.iocxml.bean;

import java.util.Arrays;
import java.util.Map;

//在学生的属性中添加班级信息
//为数组类型属性赋值,添加数组类型属性
//添加Map类型属性
public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;
    private Clazz clazz;
    private String[] hobbies;
    private Map<String, Teacher> teacherMap;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", clazz=" + clazz +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
