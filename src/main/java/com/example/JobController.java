package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.JobPost;

@Controller
public class JobController {

    @GetMapping({ "/", "home"})
    public String home() {
        return "home";
    }
    
    @GetMapping("addjob")
	public String addJob() {
		return "addjob";
	}
    
    @GetMapping({"test"})
    public String test() {
    	return "test";
    }
    
    @PostMapping("handleform")
    public String handleForm(JobPost jobPost) {
    	return "success";
    }
}


