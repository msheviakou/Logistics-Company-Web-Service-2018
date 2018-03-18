package edu.bsuir.repository;

import edu.bsuir.model.Unloadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnloadingsRepository extends JpaRepository<Unloadings, Integer> {
}
