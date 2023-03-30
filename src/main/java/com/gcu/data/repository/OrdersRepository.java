package com.gcu.data.repository;

import java.util.List;

import com.gcu.data.entity.OrderEntity;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long>{
    @Override
    @Query(value = "SELECT * FROM qzwos0kkw06oew76.order")
    public List<OrderEntity> findAll();
}
