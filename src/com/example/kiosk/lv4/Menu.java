package com.example.kiosk.lv3;

import java.util.ArrayList;
import java.util.List;

// menuItem 클래스 관리
public class Menu {
    List<Menu> menuItemList = new ArrayList<>();
    MenuItem menuItem;
    //
    public Menu(String smokeShack, double v, String s) {
    }

    public void initBurgerMenu(){
        menuItemList.add(new Menu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new Menu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new Menu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new Menu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

    }
}
