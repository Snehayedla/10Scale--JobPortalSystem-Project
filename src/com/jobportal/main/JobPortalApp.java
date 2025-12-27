package com.jobportal.main;

import com.jobportal.service.JobService;
import java.util.Scanner;

public class JobPortalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JobService service = new JobService();

        while (true) {
            System.out.println("\n=== Job Portal System ===");
            System.out.println("1. Admin");
            System.out.println("2. Company");
            System.out.println("3. Candidate");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.viewJobs();
                    service.viewApplicants();
                    break;

                case 2:
                    System.out.print("Company Name: ");
                    sc.nextLine();
                    String cname = sc.nextLine();
                    service.addJob(cname);
                    service.closeJob();
                    break;

                case 3:
                    System.out.print("Candidate ID: ");
                    int cid = sc.nextInt();
                    service.viewJobs();
                    service.applyJob(cid);
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
