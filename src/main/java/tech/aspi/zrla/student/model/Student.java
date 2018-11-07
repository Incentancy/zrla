package tech.aspi.zrla.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Student {

    @Id
    private String stu_id;

    private int lab_id;

    private String stu_name;

    private String stu_sex;

    private Date stu_birth;

    private String stu_nation;      //学生民族

    private String stu_phone;

    private String stu_room;        //学生宿舍

    private String stu_img;         //存储的是图片地址

    private String stu_college;    //学生所属院系

    private String stu_major;       //学生专业

    private String stu_email;

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public int getLab_id() {
        return lab_id;
    }

    public void setLab_id(int lab_id) {
        this.lab_id = lab_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }

    public Date getStu_birth() {
        return stu_birth;
    }

    public void setStu_birth(Date stu_birth) {
        this.stu_birth = stu_birth;
    }

    public String getStu_nation() {
        return stu_nation;
    }

    public void setStu_nation(String stu_nation) {
        this.stu_nation = stu_nation;
    }

    public String getStu_phone() {
        return stu_phone;
    }

    public void setStu_phone(String stu_phone) {
        this.stu_phone = stu_phone;
    }

    public String getStu_room() {
        return stu_room;
    }

    public void setStu_room(String stu_room) {
        this.stu_room = stu_room;
    }

    public String getStu_img() {
        return stu_img;
    }

    public void setStu_img(String stu_img) {
        this.stu_img = stu_img;
    }

    public String getStu_college() {
        return stu_college;
    }

    public void setStu_college(String stu_college) {
        this.stu_college = stu_college;
    }

    public String getStu_major() {
        return stu_major;
    }

    public void setStu_major(String stu_major) {
        this.stu_major = stu_major;
    }

    public String getStu_email() {
        return stu_email;
    }

    public void setStu_email(String stu_email) {
        this.stu_email = stu_email;
    }
}
