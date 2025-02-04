package br.com.managementchurch.member.exception.handler;

import br.com.managementchurch.member.exception.EmailInvalidException;
import br.com.managementchurch.member.exception.EmailIsAlreadyRegisteredException;
import br.com.managementchurch.member.exception.MemberNotFoundException;
import br.com.managementchurch.member.exception.error.ErrorException;
import br.com.managementchurch.member.ultis.MessagesException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {


    @ExceptionHandler(EmailIsAlreadyRegisteredException.class)
    public ResponseEntity<ErrorException> emailIsRegistered(){
        ErrorException error = new ErrorException(HttpStatus.CONFLICT.value(),MessagesException.EMAIL_IS_REGISTERED);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<ErrorException> memberNotFound(){
        ErrorException error = new ErrorException(HttpStatus.NOT_FOUND.value(),MessagesException.MEMBER_NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(EmailInvalidException.class)
    public ResponseEntity<ErrorException> emailInvalid(){
        ErrorException error = new ErrorException(HttpStatus.BAD_REQUEST.value(),MessagesException.EMAIL_INVALIDSTRING);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
