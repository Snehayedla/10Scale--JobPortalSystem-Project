package com.jobportal.model;

import java.util.HashSet;
import java.util.Set;

public class Job {
    private int jobId;
    private String title;
    private String companyName;
    private int requiredExperience;
    private String status; // OPEN or CLOSED
    private Set<Integer> applicants = new HashSet<>();

    public Job(int jobId, String title, String companyName, int requiredExperience) {
        this.jobId = jobId;
        this.title = title;
        this.companyName = companyName;
        this.requiredExperience = requiredExperience;
        this.status = "OPEN";
    }

    public int getJobId() {
        return jobId;
    }

    public String getStatus() {
        return status;
    }

    public void closeJob() {
        status = "CLOSED";
    }

    public Set<Integer> getApplicants() {
        return applicants;
    }

    public void display() {
        System.out.println(jobId + " | " + title + " | " + companyName +
                " | Exp: " + requiredExperience + " | " + status);
    }
}
