package com.example.kiosk.lv2;

//메뉴 세부 속성
public class MenuItem {

    String burgerName;    // 이름
    double burgerPrice;   // 가격
    String burgerInfo;   // 메뉴 설명

    public MenuItem(String burgerName, double burgerPrice, String burgerInfo) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerInfo = burgerInfo;
    }

}
