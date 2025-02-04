package br.com.managementchurch.member.exception;

public class EmailIsAlreadyRegisteredException extends RuntimeException{

    public EmailIsAlreadyRegisteredException(String message){
        super(message);
    }
    public EmailIsAlreadyRegisteredException(){

    }
}
