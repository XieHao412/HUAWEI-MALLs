package com.hwmall.pojo;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {

    private Integer user_id;
    private String user_name;
    private String user_password;
    private String user_phone;
    private String user_birth;
    private String user_email;

}
