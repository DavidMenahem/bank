package com.david.atm.service;

import com.david.atm.entities.BankUser;
import com.david.atm.exceptions.ApplicationException;
import com.david.atm.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public BankUser get(long userId){
        Optional<BankUser> user = userRepository.findById(userId);

        if(user.isPresent()){
            return user.get();
        }else{
            throw new ApplicationException("User not found");
        }
    }
}
