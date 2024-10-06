package com.seisoul.btob_ses.controller;

import com.seisoul.btob_ses.entity.Job;
import com.seisoul.btob_ses.entity.JobForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private List<Job> jobList = new ArrayList<>();

    public Controller() {
        jobList.add(new Job(1L, "【Java(Spring Boot)】大手飲食予約サービスのリプレイ", "東京", "60-70万円/月", "Java, Spring, SpringBoot, JUnit", "案件の詳細内容1..."));
        jobList.add(new Job(2L, "【Java(Spring Boot)】小売業配送プラットフォーム開発", "鎌田", "55-65万円/月", "Java, Spring, SpringBoot, JUnit", "案件の詳細内容2..."));
    }

    @GetMapping("/jobs")
    public String getJobs(Model model) {
        model.addAttribute("jobs", jobList);
        return "jobs";  // 返回 jobs.html 视图
    }

    @GetMapping("/input-jobs")
    public String inputJobs(Model model) {
        model.addAttribute("jobs", jobList);
        return "input-jobs";  // 返回 input-job 视图
    }

    @PostMapping("/submit-job")
    public String submitJob(JobForm form, Model model) {
        // Logic to handle the form data
        // For now, simply printing out the form data
        System.out.println("Job Title: " + form.getTitle());
        System.out.println("Location: " + form.getLocation());
        System.out.println("Coding Languages: " + form.getCodingLanguages());
        System.out.println("unitPrice: " + form.getUnitPrice());
        System.out.println("Description: " + form.getDescription());
        //id 自动增番号 且是主键，唯一
        //title
        //location表
        //codingLanguage表

        // Add attributes to the model if necessary
        model.addAttribute("message", "Job submitted successfully!");

        // Return the name of the view (e.g., a confirmation page)
        return "confirmation";
    }
}
