package org.example;

public class Worker {
    String name;
    String jobClass;
    String email;
    String phoneNumber;
    int payment;
    int age;

    public Worker(String name, String jobClass, String email, String phoneNumber, int payment, int age) {
        this.name = name;
        this.jobClass = jobClass;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println(this);
    }
    public void info() {
        System.out.println(name + " " + jobClass + " " + email + " " + phoneNumber + " " + payment + " " + age + " ");
    }
}
