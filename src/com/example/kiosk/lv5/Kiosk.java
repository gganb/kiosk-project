package com.example.kiosk.lv5;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {

    private final List<Menu> menuList;
    private Scanner scan;

    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
        this.scan = new Scanner(System.in); // 필요할때
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

                // 메인 메뉴 종료
                if (choice == 0) {
                    System.out.println();
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                boolean back = choiceNumber(choice, menuList);
                if (!back) {
                    System.out.println();
                    continue;
                }

            } catch (ArrayIndexOutOfBoundsException | IllegalCallerException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
                System.out.println();
            } catch (IllegalArgumentException i) {
                System.out.println("[ERROR] 숫자를 입력해주세요.");
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

        // 메뉴 리스트 범위 밖의 숫자면 예외처리
        if (choice < 1 || choice > menuList.size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        Menu selectMenu = menuList.get(choice - 1);
        // 메뉴 아이템 리스트 출력
        System.out.println();
        selectMenu.printMenu();

        // 리스트가 비어있을 경우
        if (selectMenu.getMenuItems().isEmpty()) {
            throw new IllegalCallerException("[ERROR] 존재하지 않는 항목 입니다.");
        }
        // 메뉴 선택 번호 입력
        int menuChoice = Integer.parseInt(scan.nextLine());

        // BACK 뒤로가기
        if (menuChoice == 0) {
            return false;
        }
        // 범위 외 입력
        if (menuChoice < 1 || menuChoice > selectMenu.getMenuItems().size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        // 메뉴 상세 정보 출력
        selectMenu.printInfo(menuChoice - 1);
        return true;
    }

    // 메뉴 카테고리 출력
    public void printMainMenu() {
        System.out.println("[ ✨MAIN MENU  ]");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
        }
        System.out.println("0. 종료      | 종료");
    }
}



