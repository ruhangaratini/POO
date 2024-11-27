package Pizzaria.model;

import Pizzaria.repository.DAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkDay extends DAO<Order> {
    final private LocalDate date;

    public WorkDay() {
        this.date = LocalDate.now();
    }

    public String getDate() {
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
