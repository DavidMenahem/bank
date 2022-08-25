package com.david.atm.exceptions;

public class ApplicationException extends RuntimeException{
    public ApplicationException(String msg){
        super(msg);
    }
}
