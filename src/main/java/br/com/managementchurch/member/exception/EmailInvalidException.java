package br.com.managementchurch.member.exception;

public class EmailInvalidException extends RuntimeException{

    public EmailInvalidException(String message){
        super(message);
    }
    public EmailInvalidException(){
    }
}
