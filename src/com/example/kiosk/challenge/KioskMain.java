package com.example.kiosk.challenge;

import java.util.ArrayList;
import java.util.List;

import static com.example.kiosk.challenge.DataBuild.dataBuild;

// 시작 지점
public class KioskMain {
    public static void main(String[] args) {
        List<MenuItem> cartList = new ArrayList<>();
        Cart cart = new Cart(cartList); //무관
        //키오스크에 메뉴 리스트를 넘김
        Kiosk kiosk = new Kiosk(dataBuild(),cartList);
        // 키오스크 시작하기
        kiosk.start();
    }

}
