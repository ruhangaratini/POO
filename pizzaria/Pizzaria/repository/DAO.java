package Pizzaria.repository;

import Pizzaria.model.Entity;

import java.util.ArrayList;

public class DAO<T extends Entity> {
    private final ArrayList<T> data;
    private int lastID;
    
    public DAO() {
        this.data = new ArrayList<>();
        this.lastID = 0;
    }
    
    public void add(T item) {
        if(item.getID() == 0)
            item.setID(this.generateID());
        this.data.add(item);
    }
    
    public void remove(T item) {
        this.data.remove(item);
    }
    
    public ArrayList<T> getAll() {
        return this.data;
    }

    public T getByID(int id) {
        for(final T item : this.data) {
            if(item.getID() == id)
                return item;
        }

        return null;
    }
    
    public int generateID() {
        return ++this.lastID;
    }
    
}
