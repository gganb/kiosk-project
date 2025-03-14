package com.example.kiosk.challenge;

import java.util.List;
import java.util.NoSuchElementException;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {

    private final List<Menu> menuList;
    private final CartManage cartManage; //..

    public Kiosk(List<Menu> menuList, Cart cart) {
        this.menuList = menuList;
        this.cartManage = new CartManage(cart);
    }

    // 키오스크 시작 함수
    public void start() {

        // 반복문 시작
        while (true) {
            try {
                // 메인 메뉴 출력
                printMainMenu();

                // 메인 메뉴 선택 번호 입력받기 choice = 메인 메뉴에서 선택
                int choice = Input.getInputNum();

                switch (choice) {
                    case 0:    // 메인 메뉴 종료
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    case 4, 5:
                        if (cartManage.cartIsEmpty()) {
                            System.out.println("잘못된 접근입니다");
                            continue;
                        } else {
                            cartManage.selectOrderMenu(choice);
                            return;
                        }
                }
                String back = choiceNumber(choice);
                if ("BACK".equals(back)) {
                    System.out.println();
                    continue;
                }
            } catch (ArrayIndexOutOfBoundsException | NoSuchElementException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
            }
        }
    }

    // 메뉴 선택 함수
    public String choiceNumber(int choice) {
        // 메뉴 리스트 범위 밖의 숫자면 예외처리
        if (choice < 1 || choice > menuList.size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        Menu selectMenu = menuList.get(choice - 1);
        // 메뉴 아이템 리스트 출력
        System.out.println();
        selectMenu.printMenuItemList();

        // 리스트가 비어있을 경우
        if (selectMenu.getMenuItemList().isEmpty()) {
            throw new NoSuchElementException("[ERROR] 존재하지 않는 항목입니다.");
        }
        // 메뉴 선택 번호 입력
        int menuItemChoice = Input.getInputNum();

        // BACK 뒤로가기
        if (menuItemChoice == 0) {
            return "BACK";
        }
        // 범위 외 입력
        if (menuItemChoice < 1 || menuItemChoice > selectMenu.getMenuItemList().size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        // 메뉴 상세 정보 출력 menuChoice 가 입력한 번호 . ...
        selectMenu.printMenuItemInfo(menuItemChoice - 1);
        cartManage.addCartListManage(selectMenu, menuItemChoice - 1);
        return "OK";
    }

    // 메뉴 카테고리 출력
    public void printMainMenu() {
        System.out.println("[ ✨MAIN MENU  ]");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
        }
        System.out.println("0. 종료      | 종료");

        // 장바구니가 비어있지 않을 경우
        if (!cartManage.cartIsEmpty()) {
            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
        }


    }

}

