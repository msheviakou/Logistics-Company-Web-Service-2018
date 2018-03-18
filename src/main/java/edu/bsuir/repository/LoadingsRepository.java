package edu.bsuir.repository;

import edu.bsuir.model.Loadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadingsRepository extends JpaRepository<Loadings, Integer> {
}
