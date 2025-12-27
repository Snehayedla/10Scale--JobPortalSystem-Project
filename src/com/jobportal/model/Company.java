package com.jobportal.model;

public class Company extends User {

    public Company(int id, String name) {
        super(id, name);
    }

    @Override
    public void showMenu() {
        System.out.println("Company Menu");
    }
}
