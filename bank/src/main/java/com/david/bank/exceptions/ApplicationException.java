package com.david.bank.exceptions;

public class ApplicationException extends RuntimeException{
    public ApplicationException(String msg){
        super(msg);
    }
}
