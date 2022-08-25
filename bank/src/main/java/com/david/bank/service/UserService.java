package com.david.bank.service;

import com.david.bank.entities.BankUser;
import com.david.bank.exceptions.ApplicationException;
import com.david.bank.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public BankUser create(BankUser user){
        user.setPassword(String.valueOf(user.getPassword()).hashCode());
        return userRepository.save(user);
    }

    public BankUser update(BankUser user){
        user.setPassword(String.valueOf(user.getPassword()).hashCode());
        return userRepository.save(user);
    }

    public BankUser get(long id) throws ApplicationException{
        Optional<BankUser> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            throw new ApplicationException("User not found");
        }
    }
}
