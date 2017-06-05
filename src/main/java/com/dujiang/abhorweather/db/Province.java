package com.dujiang.abhorweather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名：  OwnProject
 * 包名：    com.dujiang.abhorweather.db
 * 创建者：  Dujiang0311
 * 创建时间：2017/6/5 19:09
 * 描述：    省份表
 */

public class Province extends DataSupport {

    private int id ;
    private String provinceName;
    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
