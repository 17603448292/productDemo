package com.kaida.entity;

public class Provider {
    private  String proCode;
    private  String ProName;

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "proCode='" + proCode + '\'' +
                ", ProName='" + ProName + '\'' +
                '}';
    }
}
