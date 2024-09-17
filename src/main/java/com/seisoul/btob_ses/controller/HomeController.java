package com.seisoul.btob_ses.controller;

import com.seisoul.btob_ses.entity.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/jobs")
    public String getJobs(Model model) {
        // 创建职位数据
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("【Java(Spring Boot)】大手飲食予約サービスのリプレイ", "東京", "60-70万円/月", "Java, Spring, SpringBoot, JUnit"));
        jobList.add(new Job("【Java(Spring Boot)】小売業配送プラットフォーム開発", "鎌田", "55-65万円/月", "Java, Spring, SpringBoot, JUnit"));

        // 将职位数据添加到模型中，传递给视图
        model.addAttribute("jobs", jobList);
        return "jobs";  // 返回 jobs.html 视图
    }
}

