package com.kuranado.strategy;

import lombok.Getter;

/**
 * 计算价格类
 *
 * @author Xinling Jing
 * @version 1.0.0
 * @date 2021-01-28 16:28
 */
public class Price {

    /**
     * 根据用户类型计算商品折扣后的价格
     *
     * @param originalPrice 商品原价
     * @param customType    用户类型
     * @return 折扣后的价格
     */
    public double calcDiscountPrice(double originalPrice, CustomType customType) {

        if (CustomType.NORMAL.equals(customType)) {
            // 普通客户原价
            return originalPrice;
        } else if (CustomType.POOR_MONTH_VIP.equals(customType)) {
            // 活动送的月度会员打 95 折
            return originalPrice * 0.95;
        } else if (CustomType.MONTH_VIP.equals(customType)) {
            // 月度会员打 9 折
            return originalPrice * 0.9;
        } else if (CustomType.YEAR_VIP.equals(customType)) {
            // 年度会员打 8 折
            return originalPrice * 0.8;
        }
        // 其它类型客户原价
        return originalPrice;
    }

    @Getter
    enum CustomType {

        /**
         * 普通客户
         */
        NORMAL("普通用户"),
        /**
         * 活动送的会员
         */
        POOR_MONTH_VIP("活动送的月度会员"),
        /**
         * 月度会员
         */
        MONTH_VIP("月度会员"),
        /**
         * 年度会员
         */
        YEAR_VIP("年度会员");

        private final String type;

        CustomType(String type) {
            this.type = type;
        }
    }

    public static void main(String[] args) {
        double originalPrice = 100;
        Price price = new Price();
        double result = price.calcDiscountPrice(originalPrice, CustomType.NORMAL);
        System.out.println("普通用户折扣后价格：" + result);

        result = price.calcDiscountPrice(originalPrice, CustomType.POOR_MONTH_VIP);
        System.out.println("活动送的月度会员折扣后价格：" + result);

        result = price.calcDiscountPrice(originalPrice, CustomType.MONTH_VIP);
        System.out.println("月度会员折扣后价格：" + result);

        result = price.calcDiscountPrice(originalPrice, CustomType.YEAR_VIP);
        System.out.println("年度会员折扣后价格：" + result);
    }
}
