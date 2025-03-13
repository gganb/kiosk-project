package com.example.kiosk.lv0.menu;

import com.example.kiosk.lv0.MenuItem;

import java.util.List;

// menuItem 클래스 관리
public class Menu {
    // 메뉴 아이템 카테고리 설정 필드
    String category;
    // 메뉴 아이템 리스트 가져옴 근데 이거 가져와서 머하지? 일단 메뉴에 아이템 리스트 필드 선언
    List<MenuItem> menuItemList;

    // 카테고리 이름과 메뉴 아이템 리스트로 메뉴를 설정함
    // "햄버거" 카테고리 이름과 쉑쉑버거 외3 종으로 구성된 리스트라고 치자
    public Menu(String category, List<MenuItem> menuItemList) {
        this.category = category;
        this.menuItemList = menuItemList;
    }


    // 반복문으로 List 안에 있는 menuItemList 하니씩 출력
    //햄버거 메뉴가 뭐가있는지 출력해주는 반복문 만약 0 입력하면 메뉴 항목 리스트로 돌아가도록
    // choiceNumber와 연결된 함수
    public void printMenu() {
        for (int i = 0; i < menuItemList.size(); i++) {
            System.out.printf("%s. %-15s | %-5sW | %s\n", (i + 1), menuItemList.get(i).itemName, menuItemList.get(i).itemPrice, menuItemList.get(i).itemInfo);
        }
        System.out.println("0. 뒤로가기          | ");
    }

    public List<MenuItem> getMenuItemList() {
        return this.menuItemList;
    }


}
