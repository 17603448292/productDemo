package com.kaida.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Bill implements Serializable {
    private static final long serialVersionUID = 7614273521728764863L;
    private String billCode;
    private String productName;
    private String providerName;
    private BigDecimal totalPrice;
    private Integer isPayment;
    private String creationDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }


    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billCode='" + billCode + '\'' +
                ", productName='" + productName + '\'' +
                ", providerName='" + providerName + '\'' +
                ", totaoPrice=" + totalPrice +
                ", isPayment=" + isPayment +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}
