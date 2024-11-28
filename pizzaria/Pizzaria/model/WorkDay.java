package Pizzaria.model;

import Pizzaria.repository.DAO;

public class WorkDay extends DAO<Order> {
    private final int day;
    private static int lastDay = 0;

    public WorkDay() {
        this.day = ++lastDay;
    }

    public int getDay() {
        return this.day;
    }
}
