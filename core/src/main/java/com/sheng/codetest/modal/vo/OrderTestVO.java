package com.sheng.codetest.modal.vo;

import com.sheng.codetest.modal.entity.OrderUserTestDO;

import java.util.Map;

/**
 * Created by shengxingyue on 2017/9/13.
 */
public class OrderTestVO {
    private Long id;
    private String carType;
    private String model;
    private Map<String, Object> data;
    private OrderUserTestDO orderUserTestDO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public OrderUserTestDO getOrderUserTestDO() {
        return orderUserTestDO;
    }

    public void setOrderUserTestDO(OrderUserTestDO orderUserTestDO) {
        this.orderUserTestDO = orderUserTestDO;
    }

    @Override
    public String toString() {
        return "OrderTestVO{" +
                "id=" + id +
                ", carType='" + carType + '\'' +
                ", model='" + model + '\'' +
                ", data=" + data +
                ", orderUserTestDO=" + orderUserTestDO +
                '}';
    }
}
