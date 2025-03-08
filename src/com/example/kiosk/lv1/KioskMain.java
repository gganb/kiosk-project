package com.example.kiosk.lv1;

import java.util.Scanner;

// 시작 지점
public class KioskMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "";
        printMenu();

        while (!msg.equals("0")) {
            String choice = sc.nextLine();
            choiceNumber(choice);
        }

    }
    static void printMenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");
    }
    static void choiceNumber(String num){
        switch (num) {
            case "1":
                System.out.println("ShackBurger");
                System.out.println("토마토, 양상추, 쉑소스가 토핑된 치즈버거입니다.");
                break;
            case "2":
                System.out.println("SmokeShack");
                System.out.println("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거입니다.");
                break;
            case "3":
                System.out.println("Cheeseburger");
                System.out.println("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거입니다.");
                break;
            case "4":
                System.out.println("Hamburger");
                System.out.println("비프패티를 기반으로 야채가 들어간 기본버거");
                break;
            case "0":
                System.out.println("프로그램을 종료합니다");
                break;
            default:
                System.out.println("존재하지 않는 메뉴입니다.");
                break;
        }
    }
}
