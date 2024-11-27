package Pizzaria.repository;

import Pizzaria.model.Pizza;

public class PizzaRepository extends DAO<Pizza> {
    private static PizzaRepository instance;
    
    public static PizzaRepository getInstance() {
        if(instance == null)
            instance = new PizzaRepository();
        
        return instance;
    }
    
}
