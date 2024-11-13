package pizzaria.repository;

import java.util.ArrayList;

public class DAO<T> {
    private final ArrayList<T> data;
    
    public DAO() {
        this.data = new ArrayList();
    }
    
    public void add(T item) {
        this.data.add(item);
    }
    
    public void remove(T item) {
        this.data.remove(item);
    }
    
    public boolean exists(T item) {
        return this.data.contains(item);
    }
}
