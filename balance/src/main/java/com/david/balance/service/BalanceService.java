package com.david.balance.service;

import com.david.balance.exceptions.ApplicationException;
import com.david.balance.entities.Balance;
import com.david.balance.repositories.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BalanceService {
    private final BalanceRepository balanceRepository;

    private final UserService userService;

     public Balance create(Balance balance,long userId){
         balance.setUser(userService.get(userId));
         return balanceRepository.save(balance);
     }

     public Balance update(Balance balance){
         return balanceRepository.save(balance);
     }

     public Balance get(long userId) throws ApplicationException{
         Optional<Balance> balance = balanceRepository.findByUserId(userId);
         if(balance.isPresent()){
             return balance.get();
         }else{
             throw new ApplicationException("User not found");
         }

     }
}
