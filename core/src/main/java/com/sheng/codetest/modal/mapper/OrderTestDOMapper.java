package com.sheng.codetest.modal.mapper;

import com.sheng.codetest.modal.entity.OrderTestDO;
import com.sheng.codetest.modal.vo.OrderTestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by shengxingyue on 2017/9/13.
 * mapstruct 使用
 */
@Mapper
public interface OrderTestDOMapper {
    OrderTestDOMapper INSTANCE = Mappers.getMapper(OrderTestDOMapper.class);

    @Mapping(source = "modelCode", target = "model")
    OrderTestVO orderTestDOToOrderTestVO(OrderTestDO orderTestDO);
}
