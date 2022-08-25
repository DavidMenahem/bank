package com.david.balance.repositories;

import com.david.balance.entities.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BankUser,Long> {

}
