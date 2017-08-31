package com.sheng.codetest.dao;

import com.sheng.codetest.modal.entity.OrderTestDO;

public interface OrderTestDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderTestDO record);

    int insertSelective(OrderTestDO record);

    OrderTestDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderTestDO record);

    int updateByPrimaryKey(OrderTestDO record);
}