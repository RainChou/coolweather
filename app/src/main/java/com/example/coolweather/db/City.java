package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by RainChou on 2017/1/13.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceCode;

    public int getId() {
        return id;
    }
    public void setId() {
        this.id=id;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName () {
        this.cityName=cityName;
    }

    public int getCityCode () {
        return cityCode;
    }
    public void setCityCode () {
        this.cityCode=cityCode;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode () {
        this.provinceCode=provinceCode;
    }
}
