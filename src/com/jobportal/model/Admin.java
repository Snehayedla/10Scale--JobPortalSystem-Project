package com.jobportal.model;

public class Admin extends User {

    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public void showMenu() {
        System.out.println("Admin Menu");
    }
}

