package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;



    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();


    }

   //  method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);

    }

    public JobPost getJob(int postId){
        return repo.getJob(postId);
    }


    public void updateJob(JobPost jobPost) {
        repo.update(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
