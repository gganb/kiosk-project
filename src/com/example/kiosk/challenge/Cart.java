package com.example.kiosk.challenge;

import java.util.List;

public class Cart {
    private final List<MenuItem> cartList;
    private int cnt;     // 수량

    public Cart(List<MenuItem> cartList) {
        this.cartList = cartList;
    }

    public List<MenuItem> getCartList() {
        return cartList;
    }

    public void printCartList() {
        for (int i = 0; i < cartList.size(); i++) {
            MenuItem cartItem = cartList.get(i);
            System.out.printf("%-10s | W %-2s | %s\n", cartItem.getItemName(), cartItem.getItemPrice(), cartItem.getItemInfo());
        }
    }

    /**
     * 장바구니에 추가
     *
     * @param menuChoice
     */
    public void addCartList(Menu menu, int menuChoice) {
        MenuItem selectItem = menu.getMenuItem(menuChoice); //menu == null
        cartList.add(selectItem);
        System.out.println(selectItem.getItemName() + " 가(이) 장바구니에 추가되었습니다.");
        cnt++;
    }
    public void clearCartList(){
        cartList.clear();
    }
}
