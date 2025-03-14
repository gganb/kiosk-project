package com.example.kiosk.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.kiosk.challenge.DataBuild.dataBuild;

// 시작 지점
public class KioskMain {
    public static void main(String[] args) {
        Map<MenuItem,Integer> cartList= new HashMap<>();
        Cart cart = new Cart(cartList);
        //키오스크에 메뉴 리스트를 넘김
        Kiosk kiosk = new Kiosk(dataBuild(),cart);
        // 키오스크 시작하기
        kiosk.start();
    }

}
