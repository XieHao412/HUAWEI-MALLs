package com.hwmall.pojo;

import lombok.Data;

@Data
public class Good_CXimg {

    //Cimg
    private int cid;
    private String cname;
    private String ctname;
    private String csmall_img;
    private int stock;
    //Good
    private int good_id;
    private String good_name;
    private double good_price;
    private String good_color;
    private String good_versions;
    private String good_rongliang;
    private String good_taocan;
    private String good_fenqimianxi;
    private String good_image;
    //Ximg
    private int x_id;
    private String x_images;

}
