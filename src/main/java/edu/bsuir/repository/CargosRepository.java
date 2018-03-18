package edu.bsuir.repository;

import edu.bsuir.model.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargosRepository extends JpaRepository<Cargos, Integer> {
}
