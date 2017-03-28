package com.ngc.entity;

import java.util.Date;

public class Student {
    private Long id;

    private Long userId;

    private String avatar;

    private String grade;

    private String isTrain;

    private String trainSubject;

    private String isMatch;

    private String classRanks;

    private String matchSubject;

    private Long eSchoolId;

    private String realName;

    private String sex;

    private String studentNum;

    private String classNum;

    private Byte isDelete;

    private Date createdAt;

    private String createdBy;

    private Date changedAt;

    private String changedBy;

    private String nickName;

    private Long experience;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getIsTrain() {
        return isTrain;
    }

    public void setIsTrain(String isTrain) {
        this.isTrain = isTrain == null ? null : isTrain.trim();
    }

    public String getTrainSubject() {
        return trainSubject;
    }

    public void setTrainSubject(String trainSubject) {
        this.trainSubject = trainSubject == null ? null : trainSubject.trim();
    }

    public String getIsMatch() {
        return isMatch;
    }

    public void setIsMatch(String isMatch) {
        this.isMatch = isMatch == null ? null : isMatch.trim();
    }

    public String getClassRanks() {
        return classRanks;
    }

    public void setClassRanks(String classRanks) {
        this.classRanks = classRanks == null ? null : classRanks.trim();
    }

    public String getMatchSubject() {
        return matchSubject;
    }

    public void setMatchSubject(String matchSubject) {
        this.matchSubject = matchSubject == null ? null : matchSubject.trim();
    }

    public Long geteSchoolId() {
        return eSchoolId;
    }

    public void seteSchoolId(Long eSchoolId) {
        this.eSchoolId = eSchoolId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum == null ? null : classNum.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Date changedAt) {
        this.changedAt = changedAt;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy == null ? null : changedBy.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}