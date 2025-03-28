package com.example.kiosk.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 시작 지점
public class KioskMain {
    public static void main(String[] args) {
        // 메뉴 관리 리스트 선언 및 초기화
        List<MenuItem> menuItemList = new ArrayList<>();

        menuItemList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        // Scanner 선언
        Scanner sc = new Scanner(System.in);


        // 반복문 시작
        while (true) {
            // 메뉴 출력
            printMenu(menuItemList);
            // 숫자 입력 받기
            int choice = Integer.parseInt(sc.nextLine());

            choiceNumber(choice, menuItemList);
            // 프로그램 종료
            if (choice == 0)
                break;
        }

    }

    // 입력된 숫자에 따른 처리
    private static void choiceNumber(int num, List<MenuItem> menuItemList) {
        switch (num) {
            case 1:
                printInfo(menuItemList.get(0));
                break;
            case 2:
                printInfo(menuItemList.get(1));
                break;
            case 3:
                printInfo(menuItemList.get(2));
                break;
            case 4:
                printInfo(menuItemList.get(3));
                break;
            case 0:
                System.out.println("종료합니다.");
                break;
            default:
                System.out.println("존재하지 않는 메뉴입니다.");
                break;
        }
    }

    private static void printInfo(MenuItem menuItem) {
        System.out.print("선택한 메뉴: ");
        System.out.printf("%-10s | W %-2s | %s\n", menuItem.burgerName, menuItem.burgerPrice, menuItem.burgerInfo);
        System.out.println();
    }

    // 반복문으로 List 안에 있는 menuItemList을 하니씩 출력
    private static void printMenu(List<MenuItem> menuItemList) {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItemList.size(); i++) {
            MenuItem getmenuItem = menuItemList.get(i);
            System.out.printf("%s. %-15s | %-5s | %s\n", i + 1, getmenuItem.burgerName, getmenuItem.burgerPrice, getmenuItem.burgerInfo);
        }
        System.out.println("0. 종료           | 종료");

    }
}
