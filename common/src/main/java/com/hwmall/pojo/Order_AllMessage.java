package com.hwmall.pojo;

import lombok.Data;

/**
 * 查询所有订单信息
 * 连表查询
 */
@Data
public class Order_AllMessage {

    private String order_no;

    private String good_id;
    private String good_name;
    private String good_color;
    private double good_price;
    private int good_num;

    private int user_id;
    private String csmall_img;
    private int cid;
    private int order_status;
    private int by_status;

}
