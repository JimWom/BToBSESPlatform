package com.seisoul.btob_ses.controller;

import com.seisoul.btob_ses.entity.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<Job> jobList = new ArrayList<>();

    public HomeController() {
        jobList.add(new Job(1L, "【Java(Spring Boot)】大手飲食予約サービスのリプレイ", "東京", "60-70万円/月", "Java, Spring, SpringBoot, JUnit", "案件の詳細内容1..."));
        jobList.add(new Job(2L, "【Java(Spring Boot)】小売業配送プラットフォーム開発", "鎌田", "55-65万円/月", "Java, Spring, SpringBoot, JUnit", "案件の詳細内容2..."));
    }

    @GetMapping("/jobs")
    public String getJobs(Model model) {
        model.addAttribute("jobs", jobList);
        return "jobs";  // 返回 jobs.html 视图
    }
}
