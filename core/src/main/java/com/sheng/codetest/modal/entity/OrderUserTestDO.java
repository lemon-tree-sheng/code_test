package com.sheng.codetest.modal.entity;

import java.util.Date;

public class OrderUserTestDO {
    private Long id;

    private String orderTestId;

    private String userName;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    public OrderUserTestDO(Long id, String orderTestId, String userName, Date dateCreate, Date dateUpdate, Date dateDelete) {
        this.id = id;
        this.orderTestId = orderTestId;
        this.userName = userName;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
        this.dateDelete = dateDelete;
    }

    public OrderUserTestDO() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderTestId() {
        return orderTestId;
    }

    public void setOrderTestId(String orderTestId) {
        this.orderTestId = orderTestId == null ? null : orderTestId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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
}