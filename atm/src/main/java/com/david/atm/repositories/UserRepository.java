package com.david.atm.repositories;

import com.david.atm.entities.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BankUser,Long> {
}
