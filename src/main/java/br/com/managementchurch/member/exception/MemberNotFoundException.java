package br.com.managementchurch.member.exception;

public class MemberNotFoundException extends RuntimeException {

    public MemberNotFoundException(String message){
        super(message);
    }

    public MemberNotFoundException(){}

}
