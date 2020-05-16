package com.hwmall.pojo;

import lombok.Data;

/**
 * 商品
 */
@Data
public class Good {

    private Integer good_id;
    private String good_name;
    private double good_price;
    private String good_color;
    private String good_versions;
    private String good_rongliang;
    private String good_taocan;
    private String good_baozhangfuwu;
    private String good_fenqimianxi;
    private String good_image;

}
