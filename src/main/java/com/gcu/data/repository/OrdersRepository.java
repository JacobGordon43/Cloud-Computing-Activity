package com.gcu.data.repository;

import java.util.List;

import com.gcu.data.entity.OrderEntity;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long>{
    @Override
    @Query(value = "SELECT * FROM z0ywbqofzrrf5e2y.order")
    public List<OrderEntity> findAll();
}
