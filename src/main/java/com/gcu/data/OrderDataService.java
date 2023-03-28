package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class OrderDataService implements DataAccessInterface<OrderEntity>{
    @Autowired
    OrdersRepository ordersRepository;
    Logger logger = LoggerFactory.getLogger(OrderDataService.class);
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public OrderDataService(OrdersRepository ordersRepository, DataSource dataSource){
        this.ordersRepository = ordersRepository;
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public List<OrderEntity> findAll() {
        List<OrderEntity> orders = new ArrayList<OrderEntity>();
        try{
            Iterable<OrderEntity> orderIterable = ordersRepository.findAll();
            orderIterable.forEach(orders::add);
            logger.info("Getting all orders");
            return orders;
        }catch(Exception e){
            logger.info("There was an issue getting the orders");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OrderEntity findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean create(OrderEntity order) {
        String sql = "INSERT INTO orders(order_no, product_name, price, quantity) VALUES(?, ?, ?, ?)";
        try{
            jdbcTemplateObject.update(sql, order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity());
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(OrderEntity t) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean delete(OrderEntity t) {
        // TODO Auto-generated method stub
        return true;
    }
}
