package com.vcread.unioncloud.convert;

import com.vcread.unioncloud.console.entity.enu.OperatorType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author :  renhuan
 * @email : blentle.huan.ren@gmail.com
 * @time :  2017/9/1
 * @description :
 * @since : 1.0
 */
@Converter
public class OperatorTypeConvert implements AttributeConverter<OperatorType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(OperatorType type) {
        if(type != null)
            return type.getCode();
        return null;
    }

    @Override
    public OperatorType convertToEntityAttribute(Integer code) {
        if(code != null)
            return OperatorType.get(code);
        return null;
    }
}
