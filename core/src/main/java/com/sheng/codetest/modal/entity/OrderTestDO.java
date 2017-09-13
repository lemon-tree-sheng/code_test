package com.sheng.codetest.modal.entity;

import java.util.Date;
import java.util.Map;

public class OrderTestDO {
    private Long id; // todo lombok

    private String carId;

    private String modelCode;

    private Map<String, Object> data;

    private OrderUserTestDO orderUserTestDO;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    public OrderTestDO(Long id, String carId, String modelCode, Date dateCreate, Date dateUpdate, Date dateDelete) {
        this.id = id;
        this.carId = carId;
        this.modelCode = modelCode;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
        this.dateDelete = dateDelete;
    }

    public OrderTestDO() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode == null ? null : modelCode.trim();
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
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
}