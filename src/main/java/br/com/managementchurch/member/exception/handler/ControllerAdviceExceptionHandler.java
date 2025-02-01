package br.com.managementchurch.member.exception.handler;

import br.com.managementchurch.member.exception.MemberNotFoundException;
import br.com.managementchurch.member.exception.VerificationCpfAndWhatsAppException;
import br.com.managementchurch.member.exception.error.ErrorException;
import br.com.managementchurch.member.ultis.MessagesException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {


    @ExceptionHandler(VerificationCpfAndWhatsAppException.class)
    public ResponseEntity<ErrorException> verificationCpfAndWhatsApp(){
        ErrorException error = new ErrorException(HttpStatus.CONFLICT.value(),MessagesException.VERIFICATION_CPF_AND_WHATSAPP);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<ErrorException> memberNotFound(){
        ErrorException error = new ErrorException(HttpStatus.NOT_FOUND.value(),MessagesException.MEMBER_NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
