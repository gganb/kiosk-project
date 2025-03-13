package com.example.kiosk.lv1;

import java.util.Scanner;

// 시작 지점
public class KioskMain {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            printMenu();

            // 값 입력받기
            int choiceNum = Integer.parseInt(sc.nextLine());
            if (choiceNum == 0) {
                System.out.println();
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            choiceNumber(choiceNum);

        }
    }

    private static void printMenu() {   // 메뉴 출력 메서드
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료           | 종료");
    }

    private static void choiceNumber(int num) {
        switch (num) {
            case 1:
                System.out.println("ShackBurger");
                System.out.println("토마토, 양상추, 쉑소스가 토핑된 치즈버거입니다.");
                break;
            case 2:
                System.out.println("SmokeShack");
                System.out.println("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거입니다.");
                break;
            case 3:
                System.out.println("Cheeseburger");
                System.out.println("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거입니다.");
                break;
            case 4:
                System.out.println("Hamburger");
                System.out.println("비프패티를 기반으로 야채가 들어간 기본버거입니다.");
                break;
            case 0:
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
                break;
        }
    }
}
