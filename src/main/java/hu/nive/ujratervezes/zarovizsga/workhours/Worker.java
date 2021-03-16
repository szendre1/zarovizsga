package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class Worker {
    private String name;
    private int workHours;
    private String workDay;

    public Worker(String name, int workHours, String workDay) {
        this.name = name;
        this.workHours = workHours;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getWorkDay() {
        return workDay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workHours=" + workHours +
                ", workDay='" + workDay + '\'' +
                '}';
    }
}
