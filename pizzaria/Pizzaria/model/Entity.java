package Pizzaria.model;

import Pizzaria.repository.DAO;

public interface Entity {
    int getID();
    void setID(DAO repository);
}
