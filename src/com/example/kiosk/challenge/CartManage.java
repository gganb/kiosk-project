package com.example.kiosk.challenge;


public class CartManage {
    private final Cart cart;

    public CartManage(Cart cart) {
        this.cart = cart;
    }


    public void selectOrderMenu(int selectOrder) {
        switch (selectOrder) {
            case 4:
                System.out.println("아래와 같이 주문하시겠습니까?");
                System.out.println("[ Orders ]");
                cart.printCartList();
                totalPrice();
                pay();
                return;
            case 5:
                System.out.println("주문을 취소합니다.");
                cart.clearCartList();
                break;
        }
    }

    public boolean cartIsEmpty() {
        return cart.getCartList().isEmpty();
    }

    public void addCartListManage(Menu menu, int menuChoice) {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.printf("%d. %s      %d. %s\n", 1, "확인", 2, "취소");
        int makeCart = Input.getInputNum();
        switch (makeCart) {
            case 1:
                cart.addCartList(menu, menuChoice);
                return;
            case 2:
                return;
            default:
                System.out.println("[ERROR] 존재하지 않는 번호입니다!");
        }
    }

    public void totalPrice() {
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + cart.getTotalPrice());
    }
//TODO 메뉴판 선택시 메인 메뉴로 돌아가도록 해결하기
    public void pay() {
        System.out.printf("%d. %s      %d. %s\n", 1, "주문", 2, "메뉴판");
        int payNum = Input.getInputNum();
        switch (payNum) {
            case 1:
                System.out.printf("주문이 완료되었습니다. 금액은 W %.1f 입니다.\n", cart.getTotalPrice());
                cart.clearCartList();
                return;
            case 2:
                return;
            default:
                System.out.println("[ERROR] 존재하지 않는 번호입니다!");

        }

    }

}


