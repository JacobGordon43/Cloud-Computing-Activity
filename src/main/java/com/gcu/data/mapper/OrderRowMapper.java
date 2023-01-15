package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcu.data.entity.OrderEntity;

import org.springframework.jdbc.core.RowMapper;

/**
 * What is RowMapper?
 * Interface is used by Jdbc Template for mapping rows of a ResultSet
 * on a per-row basis. Implementations of this interface perform the actual
 * work of mapping each row to the result object.
 */
public class OrderRowMapper implements RowMapper<OrderEntity>{

    //Implementations must implement this method to map each row of data in the results set
    //This method should not call next() on the ResultSet, it is only supposed to
    //map values of the current row only.
    public OrderEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        return new OrderEntity(rs.getLong("id"), rs.getString("order_no"), rs.getString("product_name"), rs.getFloat("price"), rs.getInt("quantity"));
    }


    
}
