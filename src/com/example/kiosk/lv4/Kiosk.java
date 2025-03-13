package com.example.kiosk.lv4;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {
    private final List<Menu> menuList;  // 메뉴 카테고리 리스트
    private Scanner scan;

    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
        scan = new Scanner(System.in);
    }

    // 키오스크 시작 함수
    public void start() {
        // 반복문 시작
        while (true) {
            try {
                // 메인 메뉴 리스트 출력
                printMainMenu();

                // 메인 메뉴 선택 번호 입력받기
                int choice = Integer.parseInt(scan.nextLine());
                if (choice == 0) {
                    System.out.println();
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                boolean back = choiceNumber(choice, menuList);
                // 뒤로가기
                if (!back) {
                    System.out.println();
                    continue;
                }
            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }

    /**
     * 번호 선택에 따른 로직 메뉴 아이템 리스트 >
     *
     * @param choice
     * @param menuList
     */
    public boolean choiceNumber(int choice, List<Menu> menuList) {
        // 메뉴 리스트 범위 밖의 숫자 예외처리
        if (choice < 1 || choice > menuList.size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        Menu selectMenu = menuList.get(choice - 1);
        // 메뉴아이템 리스트 출력
        System.out.println();
        selectMenu.printMenu();

        // 리스트가 비어있을 경우
        if (selectMenu.getMenuItems().isEmpty()) {
            throw new NullPointerException("[ERROR] 선택한 메뉴에 항목이 없습니다.");
        }

        // 메뉴 선택하는 번호 입력받기
        int menuChoice = Integer.parseInt(scan.nextLine());

        // 뒤로가기
        if (menuChoice == 0) {
            return false;
        }
        // 메뉴 리스트 범위 밖의 숫자 예외처리
        if (menuChoice < 1 || menuChoice > selectMenu.getMenuItems().size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }
        selectMenu.printInfo(menuChoice - 1);

        return true;
    }

    // 메인 메뉴 출력
    public void printMainMenu() {
        System.out.println("[ ✨MAIN MENU  ]");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
        }
        System.out.println("0. 종료      | 종료");
    }
}



