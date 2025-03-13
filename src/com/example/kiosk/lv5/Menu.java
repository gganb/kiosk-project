package com.example.kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

/*
* - MenuItem 클래스 관리하는 클래스로 버거메뉴, 음료메뉴 등 각 카테고리 내에 여러 Item을 포함
- List<MenuItem>은 Kiosk 클래스가 관리하기에 부적절하므로 Menu 클래스가 관리하도록 변경
- 카테고리 이름 필드
- 메뉴 카테고리 이름을 반환하는 메서드 구현*/
// menuItem 클래스 관리
public class Menu {
    List<MenuItem> menuItemList;    // 메뉴 아이템 리스트
    String category;                // 카테고리 이름 필드

    // 생성자. 카테고리 이름과 아이템 리스트로 초기화
    public Menu(String category, List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
        this.category = category;
    }

    // 리스트 반환
    public List<MenuItem> getMenuItems(){
        return menuItemList;
    }
    public String getCategory(){
        return category;
    }
    // 리스트에 메뉴 아이템 추가 메서드
    public void addMenuItem(MenuItem menuItem){
        menuItemList.add(menuItem);
    }

    // 선택된 메뉴 출력
    //사용자가 햄버거 메뉴에서 번호를 입력해 골랐을 때 출력되는 포맷
    public void printInfo(int i) {
        MenuItem selectItem = menuItemList.get(i);
        System.out.print("선택한 메뉴: ");
        System.out.printf("%-10s | W %-2s | %s\n", selectItem.itemName, selectItem.itemPrice, selectItem.itemInfo);
        System.out.println();
        // 선택한 메뉴: SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
    }

    public void printMenu() {
        for (int i = 0; i < menuItemList.size(); i++) {
            MenuItem item = menuItemList.get(i);
            System.out.printf("%s. %-15s | %-5sW | %s\n", (i + 1),item.itemName, item.itemPrice, item.itemInfo);
        }
        System.out.println("0. 뒤로가기          | ");
    }
}
