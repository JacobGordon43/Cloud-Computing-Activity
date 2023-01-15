package com.gcu.data;

import java.util.List;

//<T> where T is just a place holder for the model (paramater data type)4
//t is the placeolder for the paramater name
public interface DataAccessInterface <T>{
    /**
     * 
     * @return Finds all data being searched for by a sql statement
     */
    public List<T> findAll();
    /**
     * 
     * @param id The id of the order
     * @return A list of what was returned
     */
    public T findById(int id);
    /**
     * 
     * @param t the object being looked at 
     * @return A paticular object
     */
    public boolean create(T t);  
    /**
     * 
     * @param t the object being looked at 
     * @return a boolean on the  success of what was done
     */
    public boolean update(T t);
    /**
     * 
     * @param t the object being looked at 
     * @return a boolean on the success of what was done
     */
    public boolean delete(T t);
}


