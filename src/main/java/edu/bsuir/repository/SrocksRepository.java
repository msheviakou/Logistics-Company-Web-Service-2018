package edu.bsuir.repository;

import edu.bsuir.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SrocksRepository extends JpaRepository<Stocks, Integer> {
}
