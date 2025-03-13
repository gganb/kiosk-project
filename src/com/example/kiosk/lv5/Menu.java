package com.example.kiosk.lv5;

import java.util.List;


// menuItem 클래스 관리
public class Menu {
    private final List<MenuItem> menuItemList;    // 메뉴 아이템 리스트
    private final String category;                // 카테고리 이름 필드

    public Menu(String category, List<MenuItem> menuItemList) {
        this.category = category;
        this.menuItemList = menuItemList;
    }

    /**
     * 메뉴 아이템 리스트를 가져오는 getter
     *
     * @return
     */
    public List<MenuItem> getMenuItems() {
        return menuItemList;
    }

    public String getCategory() {
        return category;
    }

    /**
     * 리스트에 메뉴 아이템 추가 메서드
     *
     * @param menuItem
     */
    public void addMenuItem(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }

    /**
     * 메뉴 출력
     * printInfo : 선택한 메뉴 상세정보
     * printMenu : 메뉴 정보 출력 (이름 / 가격 / 설명)
     */
    public void printInfo(int i) {
        MenuItem selectItem = menuItemList.get(i);
        System.out.print("선택한 메뉴: ");
        System.out.printf("%-10s | W %-2s | %s\n", selectItem.getItemName(), selectItem.getItemPrice(), selectItem.getItemInfo());
        System.out.println();

    }

    public void printMenu() {
        System.out.println("[ " + getCategory().toUpperCase() + " MENU ]");
        for (int i = 0; i < menuItemList.size(); i++) {
            MenuItem item = menuItemList.get(i);
            System.out.printf("%s. %-15s | %-5sW | %s\n", (i + 1), item.getItemName(), item.getItemPrice(), item.getItemInfo());
        }
        System.out.println("0. 뒤로가기          | ");
    }
}
