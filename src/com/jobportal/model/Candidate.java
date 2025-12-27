package com.jobportal.model;

public class Candidate extends User {

    public Candidate(int id, String name) {
        super(id, name);
    }

    @Override
    public void showMenu() {
        System.out.println("Candidate Menu");
    }
}
