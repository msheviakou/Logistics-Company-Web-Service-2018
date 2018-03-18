package edu.bsuir.repository;

import edu.bsuir.model.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriversRepository extends JpaRepository<Drivers, Integer> {
}
