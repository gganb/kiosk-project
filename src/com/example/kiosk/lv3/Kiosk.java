package com.example.kiosk.lv3;


import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {
    private final List<MenuItem> menuItemArray;

    private Scanner scan;

    public Kiosk(List<MenuItem> menuItemList) {
        this.menuItemArray = menuItemList;
        scan = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            try {
                printMenu();
                // 번호 입력받기
                int choice = Integer.parseInt(scan.nextLine());

                choiceNumber(choice, menuItemArray);
                if (choice == 0)
                    break;
            } catch (ArrayIndexOutOfBoundsException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }

    // 선택된 숫자에 따른 로직
    public void choiceNumber(int num, List<MenuItem> menuItemList) {
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
                throw new ArrayIndexOutOfBoundsException("존재하지 않는 번호입니다.");
        }
    }

    // 선택된 메뉴 출력
    public void printInfo(MenuItem menuItem) {
        System.out.print("선택한 메뉴: ");
        System.out.printf("%-10s | W %-2s | %s\n", menuItem.burgerName, menuItem.burgerPrice, menuItem.burgerInfo);
        System.out.println();
    }

    // 반복문으로 List 안에 있는 menuItemList 하니씩 출력
    public void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItemArray.size(); i++) {
            MenuItem getmenuItem = menuItemArray.get(i);
            System.out.printf("%s. %-15s | %-5sW | %s\n", (i + 1), getmenuItem.burgerName, getmenuItem.burgerPrice, getmenuItem.burgerInfo);
        }
        System.out.println("0. 종료하기          | ");
    }

}
