package com.telusko.JobApp.controller;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobController {

    @GetMapping({ "/", "home" })
    public String home() {
    	System.out.println("Inside home");
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
    	System.out.println("Inside addJob");
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
//        service.addJob(jobPost);
        return "success";
    }  
}    
