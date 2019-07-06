package com.jk.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/5 9:17
 * @Created by ${jmh}
 */
public class OrderInfo implements Serializable {


                private   Integer     orderId;

                private   String      orderInfo;

                private   BigDecimal  orderPrice;

                private   String      orderDate;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
