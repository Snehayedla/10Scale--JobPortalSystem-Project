package com.jobportal.service;

import com.jobportal.model.Job;
import java.util.*;

public class JobService {

    private Map<Integer, Job> jobs = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void addJob(String companyName) {
        System.out.print("Enter Job ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (jobs.containsKey(id)) {
            System.out.println("Job ID already exists!");
            return;
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Required Experience: ");
        int exp = sc.nextInt();

        jobs.put(id, new Job(id, title, companyName, exp));
        System.out.println("Job Posted Successfully!");
    }

    public void viewJobs() {
        if (jobs.isEmpty()) {
            System.out.println("No jobs available.");
            return;
        }
        for (Job j : jobs.values()) {
            j.display();
        }
    }

    public void closeJob() {
        System.out.print("Enter Job ID to close: ");
        int id = sc.nextInt();
        Job job = jobs.get(id);

        if (job == null) {
            System.out.println("Job not found.");
            return;
        }

        job.closeJob();
        System.out.println("Job Closed.");
    }

    public void applyJob(int candidateId) {
        System.out.print("Enter Job ID: ");
        int id = sc.nextInt();
        Job job = jobs.get(id);

        if (job == null) {
            System.out.println("Job not found.");
            return;
        }

        if (job.getStatus().equals("CLOSED")) {
            System.out.println("Cannot apply. Job is CLOSED.");
            return;
        }

        if (job.getApplicants().contains(candidateId)) {
            System.out.println("Already applied!");
            return;
        }

        job.getApplicants().add(candidateId);
        System.out.println("Applied Successfully!");
    }

    public void viewApplicants() {
        for (Job j : jobs.values()) {
            System.out.println("Job ID: " + j.getJobId() +
                    " Applicants: " + j.getApplicants());
        }
    }
}
