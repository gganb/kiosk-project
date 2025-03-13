package com.example.kiosk.lv4;

import java.util.List;

// menuItem 클래스 관리
public class Menu {
    List<MenuItem> menuItemList;    // 메뉴 아이템 리스트
    String category;                // 카테고리 이름 필드

    // 생성자. 카테고리 이름과 아이템 리스트로 초기화
    public Menu(String category, List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
        this.category = category;
    }

    // getter
    public List<MenuItem> getMenuItems() {
        return menuItemList;
    }

    public String getCategory() {
        return category;
    }

    /**
     * 메뉴 아이템 추가
     * @param menuItem
     */
    public void addMenuItem(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }

    /**
     * 선택한 메뉴 출력
     *
     * @param menuChoice
     */
    public void printInfo(int menuChoice) {
        System.out.println();
        MenuItem selectItem = menuItemList.get(menuChoice);
        System.out.print("선택한 메뉴: ");
        System.out.printf("%-10s | W %-2s | %s\n", selectItem.itemName, selectItem.itemPrice, selectItem.itemInfo);
        System.out.println();
    }

    //메뉴 리스트 출력
    public void printMenu() {
        System.out.println("[ " + getCategory().toUpperCase() + " MENU ]");
        for (int i = 0; i < menuItemList.size(); i++) {
            MenuItem item = menuItemList.get(i);
            System.out.printf("%s. %-15s | %-5sW | %s\n", (i + 1), item.itemName, item.itemPrice, item.itemInfo);
        }
        System.out.println("0. 뒤로가기          | ");
    }
}
