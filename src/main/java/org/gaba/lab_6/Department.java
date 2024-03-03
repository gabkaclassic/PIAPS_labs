package org.gaba.lab_6;

public class Department implements Observer {

    private String title;

    public Department(String title) {
        this.title = title;
    }

    @Override
    public void update(String subjectView, boolean status) {
        if(!status) {
            System.out.printf("%s: %s didn't post tracking info%n", this, subjectView);
        }
    }

    @Override
    public String toString() {
        return String.format("Department %s", title);
    }
}
