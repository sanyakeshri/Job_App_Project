package com.telusko.JobApp.repo;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer",
                    "Must have good experience in core java",
                    3,
                    Arrays.asList("Core Java", "Spring")),

            new JobPost(2, "Frontend Developer",
                    "Must have good experience in HTML, CSS, JS",
                    2,
                    Arrays.asList("HTML", "CSS", "JavaScript")),

            new JobPost(3, "Data Scientist",
                    "Must have good experience in Databases",
                    4,
                    Arrays.asList("Python", "SQL")),

            new JobPost(4, "Network Engineer",
                    "Must have good experience in IT",
                    2,
                    Arrays.asList("Networking", "Linux")),

            new JobPost(5, "Mobile App Developer",
                    "Must have good experience in Development",
                    3,
                    Arrays.asList("Android", "Java"))

    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }
    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}