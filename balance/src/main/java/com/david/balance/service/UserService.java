package com.david.balance.service;

import com.david.balance.exceptions.ApplicationException;
import com.david.balance.entities.BankUser;
import com.david.balance.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public BankUser get(long id){
       Optional<BankUser> user = userRepository.findById(id);
       if(user.isPresent()){
           return user.get();
       }else{
           throw new ApplicationException("User not found");
       }
    }
}
