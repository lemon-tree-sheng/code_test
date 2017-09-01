package com.sheng.codetest.dao;

import com.sheng.codetest.modal.entity.OrderUserTestDO;

public interface OrderUserTestDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderUserTestDO record);

    int insertSelective(OrderUserTestDO record);

    OrderUserTestDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderUserTestDO record);

    int updateByPrimaryKey(OrderUserTestDO record);
}