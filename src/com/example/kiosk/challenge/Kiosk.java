package com.example.kiosk.challenge;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어 담당
public class Kiosk {

    private final List<Menu> menuList;
    private Scanner scan;
    private Cart cart; //..

    public Kiosk(List<Menu> menuList,List<MenuItem> cartList) {
        this.menuList = menuList;
        this.scan = new Scanner(System.in); // 필요할때
        this.cart = new Cart(cartList);

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
                if (choice == 0)
                    break;

                String back = choiceNumber(choice, menuList);
                if ("BACK".equals(back)) {
                    System.out.println();
                    continue;
                }
                if(!cart.getCartList().isEmpty()){
                    System.out.println("[ ORDER MENU ]");
                    System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                    System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");

                    int selectOrder = Integer.parseInt(scan.nextLine());
                    if(selectOrder == 4){

                        System.out.println("아래와 같이 주문하시겠습니까?");
                        System.out.println("[ Orders ]");
                        cart.printCartList();
                    }else if(selectOrder ==5){
                        System.out.println("주문을 취소합니다.");
                        cart.clearCartList();

                    }
                }

            } catch (ArrayIndexOutOfBoundsException | IllegalCallerException e) {    // 지정된 범위 외의 번호 입력시 예외 처리
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException i) {
                System.out.println("[ERROR] 숫자를 입력해주세요.");
            }
        }
    }

    // 메뉴 선택 함수
    public String choiceNumber(int choice, List<Menu> menuList) {

        // 메뉴 리스트 범위 밖의 숫자면 예외처리
        if (choice < 1 || choice > menuList.size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        Menu selectMenu = menuList.get(choice - 1);
        // 메뉴 아이템 리스트 출력
        System.out.println();
        selectMenu.printMenu();

        // 리스트가 비어있을 경우
        if (selectMenu.getMenuItemList().isEmpty()) {
            throw new IllegalCallerException("[ERROR] 존재하지 않는 항목 입니다.");
        }
        // 메뉴 선택 번호 입력
        int menuChoice = Integer.parseInt(scan.nextLine());

        // BACK 뒤로가기
        if (menuChoice == 0) {
            return "BACK";
        }
        // 범위 외 입력
        if (menuChoice < 1 || menuChoice > selectMenu.getMenuItemList().size()) {
            throw new ArrayIndexOutOfBoundsException("[ERROR] 존재하지 않는 번호입니다!");
        }

        // 메뉴 상세 정보 출력 menuChoice 가 입력한 번호 . ...
        selectMenu.printInfo(menuChoice - 1);

        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.printf("%d. %s      %d. %s\n",1,"확인",2,"취소");
        int makeCart = Integer.parseInt(scan.nextLine());
        switch (makeCart){
            case 1 :
                cart.addCartList(selectMenu,menuChoice-1);
                break;
            case 2 :
                return "BACK";
            default :
                System.out.println("다시 입력해주세요.");
        }

        return "OK";
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



