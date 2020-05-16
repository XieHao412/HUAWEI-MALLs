package com.hwmall.pojo;

import lombok.Data;

/**
 * 含有用户名的订单表
 */
@Data
public class Order_bms {

    private String user_name;
    private double price_sum;
    private int user_id;
    private int cid;
    private String good_color;
    private int good_id;
    private int good_num;
    private String good_rongliang;
    private String good_taocan;
    private String good_versions;
    private int order_id;
    private String order_no;
    private int order_status;
    private int by_status;

}
