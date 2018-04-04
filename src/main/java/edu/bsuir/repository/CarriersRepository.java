package edu.bsuir.repository;

import edu.bsuir.model.Carriers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarriersRepository extends JpaRepository<Carriers, Integer>{
}
