package com.example.kiosk.lv4;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {
    // 메뉴 리스트를 담은 리스트 ㅋㅋ
    MenuItem menuItem;
    private final List<Menu> menuList;

    //위의 리스트로 키오스크를 초기화함 그래야지 각 카테고리에 맞는 음식을 엥 근데 키오스크 하나에
    // 여러 카테고리가 있어야 하는거 아닌가? 아~ 메뉴 리스트는 메뉴 여러개 ㅇㅋ
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 키오스크 시작 함수
    public void start() {
        // 스캐너 선언
        Scanner scan = new Scanner(System.in);
        // 반복문 시작
        while (true) {
            try {
                // 메인 메뉴 리스트 출력 함수
                System.out.println("[ MAIN MENU ]");
                for (int i = 0; i < menuList.size(); i++) {
                    System.out.println((i + 1) + ". " + menuList.get(i).category);
                }
                System.out.println("0. 종료      | 종료");

                // 메인 메뉴 선택 번호 입력받기
                int choice = scan.nextInt();

                // 메뉴 항목과 메뉴 리스트 연결함
                choiceNumber(choice, menuList);
                int menuChoice = scan.nextInt();
                if(menuChoice == 1){

                }
                // 0 입력시 종료
                if (choice == 0)
                    break;
            } catch (ArrayIndexOutOfBoundsException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
            }
        }
    }

    // 메인 메뉴 출력 -선택된 숫자에 따른 로직
    public void choiceNumber(int num, List<Menu> menuList) {
        switch (num) {
            case 1:  // 햄버거
                System.out.println("[ BURGERS MENU ]");
                menuList.get(0).printMenu();
                break;
            case 2: // 음료수
                System.out.println("[ DRINKS MENU ]");
                menuList.get(1).printMenu();
                break;
            case 3: // 사이드
                System.out.println("[ SIDES MENU ]");
                menuList.get(2).printMenu();
//                break;
//            case 4:
//                menuList.get(3).printMenu();
//                break;
            case 0:
                System.out.println("종료합니다.");
                break;
            default:
                throw new ArrayIndexOutOfBoundsException("존재하지 않는 번호입니다.");
        }

        // 선택된 메뉴 출력
        //사용자가 햄버거 메뉴에서 번호를 입력해 골랐을 때 출력되는 포맷
        public void printInfo(MenuItem menuItem) {
            System.out.println("이름 : " + menuItem.itemName);
            System.out.println("가격 : " + menuItem.itemPrice);
            System.out.println("설명 : " + menuItem.itemInfo);
        }
    }


}
