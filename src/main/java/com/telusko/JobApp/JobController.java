package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.services.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("addJob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobpost, Model model) {

        service.addJob(jobpost);

        model.addAttribute("jobPost", jobpost);

        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs = service.getAllJob();
        m.addAttribute("jobPosts" , jobs);

        return "viewalljobs";
    }
}