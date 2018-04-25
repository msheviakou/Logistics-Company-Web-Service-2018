package edu.bsuir.repository;

import edu.bsuir.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    Orders findFirstByOrderByIdDesc();
}
