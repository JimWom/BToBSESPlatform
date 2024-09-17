package com.seisoul.btob_ses.entity;

public class Job {
    private String title;
    private String location;
    private String salary;
    private String tags;

    // 构造函数
    public Job(String title, String location, String salary, String tags) {
        this.title = title;
        this.location = location;
        this.salary = salary;
        this.tags = tags;
    }

    // Getter 和 Setter 方法
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
