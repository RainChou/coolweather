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

    public void setId(int id) {
        this.id=id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName (String provinceName) {
        this.provinceName=provinceName;
    }

    public void setProvinceCode (int provinceCode) {
        this.provinceCode=provinceCode;
    }

    public int  getProvinceCode() {
        return provinceCode;
    }
}
