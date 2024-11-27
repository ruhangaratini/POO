package Pizzaria.repository;

import Pizzaria.model.Entity;

import java.util.ArrayList;

public class DAO<T extends Entity> {
    private final ArrayList<T> data;
    
    public DAO() {
        this.data = new ArrayList<T>();
    }
    
    public void add(T item) {
        this.data.add(item);
    }
    
    public void remove(T item) {
        this.data.remove(item);
    }
    
    public Object[] getAll() {
        return this.data.toArray();
    }

    public T getByID(int id) {
        for(final T item : this.data) {
            if(item.getID() == id)
                return item;
        }

        return null;
    }
    
    public int generateID() {
        return this.data.size() + 1;
    }
    
}
