package com.hwmall.pojo;

import lombok.Data;

@Data
public class Order {

    private int order_id;
    private int user_id;
    private String order_no;
    private int order_status;//¶©µ¥×´Ì¬
    private int good_id;
    private String good_color;
    private String good_versions;
    private String good_rongliang;
    private String good_taocan;
    private int good_num;
    private int cid;
    private int by_status;

}
