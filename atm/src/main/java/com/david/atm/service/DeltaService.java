package com.david.atm.service;

import com.david.atm.constants.Action;
import com.david.atm.entities.Balance;
import com.david.atm.entities.BankUser;
import com.david.atm.entities.Delta;
import com.david.atm.feignclients.BalanceClient;
import com.david.atm.repositories.DeltaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeltaService {

    private final DeltaRepository deltaRepository;
    private final UserService userService;

    private final BalanceClient balanceClient;
    public Delta delta(Delta delta,long userId){
        delta.setUser(userService.get(userId));

        Balance balance = balanceClient.getBalance(userId);
        BankUser user = userService.get(userId);
        balance.setUser(user);
        if(delta.getAction().equals(Action.DEPOSIT)){
            balance.setBalance(balance.getBalance() + delta.getDelta());
        }else if(delta.getAction().equals(Action.WITHDRAW)){
            balance.setBalance(balance.getBalance() - delta.getDelta());
        }
        balanceClient.updateBalance(balance);
        return deltaRepository.save(delta);
    }
}
