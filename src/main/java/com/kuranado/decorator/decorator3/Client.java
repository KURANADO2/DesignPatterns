package com.kuranado.decorator.decorator3;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 16:26
 */
public class Client {

    public static void main(String[] args) {

        // 小明家很穷，出门只能穿得起一条内裤
        PantsDecorator decorator = new PantsDecorator(new ConcretPerson("小明"));
        System.out.println(decorator.show());

        // 康康不仅穿了内裤，还穿了裤子和 T 恤
        TShirtDecorator decorator2 = new TShirtDecorator(new TrousersDecorator(new PantsDecorator(new ConcretPerson(
            "康康"))));
        System.out.println(decorator2.show());

        // 西瓜个头比较小，只需要穿条内裤，然后梳理下发型就可以了
        HairstyleDecorator decorator3 = new HairstyleDecorator(new PantsDecorator(new ConcretPerson("西瓜")));
        System.out.println(decorator3.show());
    }
}