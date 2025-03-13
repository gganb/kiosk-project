package com.example.kiosk.lv4;

//메뉴 세부 속성
public class MenuItem {

    String itemName;    // 이름
    double itemPrice;   // 가격
    String itemInfo;   // 메뉴 설명

    public MenuItem(String itemName, double itemPrice, String itemInfo) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemInfo = itemInfo;
    }

}
