package com.kuranado.decorator.decorator2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xinling Jing
 * @Date: 2019-02-02 15:53
 */
public class TempDB {

    private static Map<String, Double> monthSaleMoneyMap = new HashMap<>();

    static {
        monthSaleMoneyMap.put("张三", 10000.0);
        monthSaleMoneyMap.put("李四", 20000.0);
        monthSaleMoneyMap.put("王五", 30000.0);
    }

    public static Map<String, Double> getMonthSaleMoneyMap() {
        return monthSaleMoneyMap;
    }

    public static void setMonthSaleMoneyMap(Map<String, Double> monthSaleMoneyMap) {
        TempDB.monthSaleMoneyMap = monthSaleMoneyMap;
    }
}
