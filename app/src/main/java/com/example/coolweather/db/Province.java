package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by RainChou on 2017/1/13.
 */

public class Province extends DataSupport {
    private String provinceName;
    private int id;
    private int provinceCode;

    public  int getId() {
        return id;
    }

    public void setId() {
        this.id=id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName () {
        this.provinceName=provinceName;
    }

    public void setProvinceCode () {
        this.provinceCode=provinceCode;
    }

    public int  getProvinceCode() {
        return provinceCode;
    }
}
