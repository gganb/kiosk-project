package com.example.kiosk.lv4;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {
    // 메뉴 리스트를 담은 리스트 ㅋㅋ
    private final List<Menu> menuList;  // 메뉴 카테고리 리스트

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
                // 메인 메뉴 리스트 출력
                printMainMenu();

                // 메인 메뉴 선택 번호 입력받기
                int choice = scan.nextInt();
                if (choice == 0)
                    break;
                // 메뉴 항목과 메뉴 리스트 연결함
                choiceNumber(choice, menuList);


            } catch (ArrayIndexOutOfBoundsException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
            }
        }
    }

    // 메인 메뉴 출력 -선택된 숫자에 따른 로직 이거는 출력 됨
    public void choiceNumber(int choice, List<Menu> menuList) {
        Scanner scan = new Scanner(System.in);  // 스캐너 다시
       // if(choice ==0){    //입력된 숫자가 0이면 반환
        //    return;
        //}
       if(choice < 1 || choice > menuList.size()){    // 메뉴 리스트 범위 밖의 숫자면 예외처리
           throw new ArrayIndexOutOfBoundsException("존재하지 않는 번호입니다!");
       }
       Menu selectMenu = menuList.get(choice-1);   // 인덱스 번호로 입력되어야함.  selectMenu : 메뉴 카테고리 하나. == 메뉴 리스트 하나
        System.out.println("[ " + selectMenu.getCategory().toUpperCase() + " MENU ]");   // 표지 출력
        selectMenu.printMenu();

        if(selectMenu.getMenuItems().isEmpty()){    // 리스트가 비어있을 경우
            System.out.println("선택한 메뉴에 항목이 없습니다.");
            return;
        }

        int menuChoice = scan.nextInt();    // 메뉴 선택하는 번호 입력받기
        if(menuChoice == 0){    // 번호가 0 이면 . .. .  start() 호출
            start();
        }
        if(menuChoice < 1 || menuChoice > selectMenu.getMenuItems().size()){ // 메인메뉴 > 메뉴 선택 > 뒤로가기 > 메인메뉴 > 0 입력하면 왜 여기로 한번 더 넘어가지?
            throw new ArrayIndexOutOfBoundsException("존재하지 않는 번호입니다!");
        }
        selectMenu.printInfo(menuChoice-1); // 입력값 -1 = 인덱스 번호. 입력해서 해당 리스트 내의 아이템 정보 출력하기


        }
        public void printMainMenu(){
            System.out.println("[ ✨MAIN MENU  ]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getCategory()); // 카테고리 출력.
            }
            System.out.println("0. 종료      | 종료");
        }
    }



