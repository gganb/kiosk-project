package com.example.kiosk.challenge;

import java.util.Map;

public class Cart {
    private final Map<MenuItem, Integer> cartList;

    public Cart(Map<MenuItem, Integer> cartList) {
        this.cartList = cartList;
    }

    public Map<MenuItem, Integer> getCartList() {
        return cartList;
    }

    public void printCartList() {
        if (cartList.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
        } else {
            for (MenuItem menuItem : cartList.keySet()) {
                System.out.printf("%-10s | W %-2s | %s   수량 : %d\n", menuItem.getItemName(), menuItem.getItemPrice(), menuItem.getItemInfo(), cartList.get(menuItem));
            }

        }
    }

    /**
     * 장바구니 추가
     *
     * @param menu
     * @param menuChoice
     */
    public void addCartList(Menu menu, int menuChoice) {
        MenuItem selectItem = menu.getMenuItem(menuChoice);
        cartList.put(selectItem, cartList.getOrDefault(selectItem, 0) + 1);
        System.out.println(selectItem.getItemName() + " 가(이) 장바구니에 추가되었습니다.");

    }

    public void clearCartList() {
        cartList.clear();
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem menuItem : cartList.keySet()) {
            total += menuItem.getItemPrice() * cartList.get(menuItem);
        }
        return total;
    }


}

