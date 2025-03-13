package com.example.kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class KioskMain {
    public static void main(String[] args) {
        // 메뉴 아이템 리스트 선언
        List<MenuItem> menuItemList = new ArrayList<>();
        // 메뉴 항목 리스트 선언
        List<Menu> MenuList = new ArrayList<>();

        // 햄버거 카테고리 추가
        Menu burger = new Menu("burger", menuItemList);

        //버거메뉴의 리스트에 버거 종류들을 넣어 햄버거 객체를 생성해 넣음
        burger.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거 \uD83C\uDF54"));
        burger.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거 \uD83C\uDF54"));
        burger.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거 \uD83C\uDF54"));
        burger.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거 \uD83C\uDF54"));

        MenuList.add(burger);   // 메뉴 항목 리스트에 버거 메뉴 추가

        //음료수 카테고리
        List<MenuItem> DrinkList = new ArrayList<>();
        Menu drink = new Menu("drink", DrinkList);

        drink.addMenuItem(new MenuItem("Coca-Cola", 2.5, "톡 쏘는 탄산과 달콤한 맛이 특징인 제로콜라! \uD83E\uDD64"));
        drink.addMenuItem(new MenuItem("Lemonade", 3.2, "상큼한 레몬과 달콤한 시럽이 어우러진 시원한 레모네이드"));
        drink.addMenuItem(new MenuItem("Americano", 3.8, "깊고 진한 에스프레소의 맛있는 아메리카노"));

        MenuList.add(drink);   // 음료 메뉴 추가

        //사이드 카테고리
        List<MenuItem> SideList = new ArrayList<>();
        Menu side = new Menu("Sides", SideList);
        side.addMenuItem(new MenuItem("French Fries", 3.0, "바삭 바삭 맛있는 감자튀김 \uD83C\uDF5F"));
        side.addMenuItem(new MenuItem("Cheese Fries", 3.8, "[BEST] 진한 치즈 소스를 듬뿍 올린 감자튀김"));
        side.addMenuItem(new MenuItem("Onion Fries", 3.5, "얇은 튀김옷을 입은 달콤한 양파링"));

        MenuList.add(side); // 사이드 메뉴 추가

        Kiosk kiosk = new Kiosk(MenuList);

        // 키오스크 시작하기
        kiosk.start();
    }
}
