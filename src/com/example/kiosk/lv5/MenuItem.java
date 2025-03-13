package com.example.kiosk.lv5;

//메뉴 세부 속성
public class MenuItem {

    private final String itemName;    // 이름
    private final double itemPrice;   // 가격
    private final String itemInfo;    // 메뉴 설명

    public MenuItem(String itemName, double itemPrice, String itemInfo) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemInfo = itemInfo;
    }

    // getter
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemInfo() {
        return itemInfo;
    }
}
