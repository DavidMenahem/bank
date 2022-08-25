package com.david.atm.repositories;

import com.david.atm.entities.Delta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeltaRepository extends JpaRepository<Delta,Long> {
}
