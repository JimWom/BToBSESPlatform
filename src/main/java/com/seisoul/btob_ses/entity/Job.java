package com.seisoul.btob_ses.entity;

public class Job {
    private Long id;
    private String title;
    private String location;
    private String salary;
    private String tags;
    private String description;  // 新增描述字段

    // 构造函数
    public Job(Long id, String title, String location, String salary, String tags, String description) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.salary = salary;
        this.tags = tags;
        this.description = description;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
