package com.project.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * CustomerDTO
 */
@Data @Component @Lazy
public class CustomerDTO {

    private String customerId;
    private String passWord;
    private String passwordConfirm;
    private String customerName;
    private String dateofBirth;
    private String emailAddress;
    private String phoneNumers;
   
    
}