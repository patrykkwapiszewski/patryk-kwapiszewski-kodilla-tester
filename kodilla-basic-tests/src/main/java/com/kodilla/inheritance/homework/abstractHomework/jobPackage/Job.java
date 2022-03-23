package com.kodilla.inheritance.homework.abstractHomework.jobPackage;

public abstract class Job {

    private int salary;
    private String jobResponsibilities;

    public Job (int salary, String jobResponsibilities){
        this.salary = salary;
        this.jobResponsibilities = jobResponsibilities;
    }

    public String getJobResponsibilities() {
        return jobResponsibilities;
    }

    public abstract void showResponsibilities();
}
