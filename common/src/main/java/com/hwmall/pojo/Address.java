package com.hwmall.pojo;

import lombok.Data;

@Data
public class Address {

    public int address_id;
    public int user_id;
    public String user_name;
    public String user_phone;
    public String address_province;     //省
    public String address_city;         //市
    public String address_district;     //区/街
    public String address_address;      //详细地址
    public int address_default;         //默认地址  1:0 是:否

}
