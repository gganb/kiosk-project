package com.example.kiosk.challenge;


public class CartManage {
    private final Cart cart;

    public CartManage(Cart cart) {
        this.cart = cart;
    }


    public void selectOrderMenu() {
        int selectOrder = Input.getInputNum();
        if (selectOrder == 4) {
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println("[ Orders ]");
            cart.printCartList();
            totalPrice();
        } else if (selectOrder == 5) {
            System.out.println("주문을 취소합니다.");
            cart.clearCartList();

        }
    }

    public boolean cartIsEmpty() {
        if (cart.getCartList().isEmpty())
            return true;
        return false;
    }

    public void addCartListManege(Menu menu, int menuChoice) {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.printf("%d. %s      %d. %s\n", 1, "확인", 2, "취소");
        int makeCart = Input.getInputNum();
        switch (makeCart) {
            case 1:
                cart.addCartList(menu, menuChoice);
                break;
            case 2:
                break;
            default:
                System.out.println("[ERROR] 존재하지 않는 번호입니다!");
        }
    }

    public void totalPrice() {
        System.out.println("[ Total ]");
        System.out.println("W " + cart.getTotalPrice());
    }


}


