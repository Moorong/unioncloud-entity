package com.vcread.unioncloud.console.entity.enu;

import java.util.jar.JarEntry;

/**
 * @author :  renhuan
 * @email : blentle.huan.ren@gmail.com
 * @time :  2017/9/1
 * @description : 运营商类型，只有电信，联通，移动
 * @since : 1.0
 */
public enum OperatorType {
    //中国移动
    cmcc(3),
    //中国电信
    ctcc(1),
    //中国联通
    cucc(2),;
    private int code;

    OperatorType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OperatorType get(int code) {
        for (OperatorType type : values()) {
            if (type.code == code)
                return type;
        }
        return null;
    }

    /**
     * @Description: 返回对应的中文名称
     * @param: code 枚举值数据
     * @return: 对应的中文名称
     * @Date: 2017/10/18 11:55
     * @Author: panliyong
     */
    public static String getName(int code) {
        switch (code) {
            case 1:
                return "中国电信";
            case 2:
                return "中国联通";
            case 3:
                return "中国移动";
                default:
                    return "";
        }
    }
}
