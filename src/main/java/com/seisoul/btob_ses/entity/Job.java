package com.seisoul.btob_ses.entity;

import lombok.Data;

@Data
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
}
