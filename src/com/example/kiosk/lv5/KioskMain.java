package com.example.kiosk.lv5;

import static com.example.kiosk.lv5.DataBuild.dataBuild;


// 시작 지점
public class KioskMain {
    public static void main(String[] args) {

        //키오스크에 메뉴 리스트를 넘김
        Kiosk kiosk = new Kiosk(dataBuild());

        // 키오스크 시작하기
        kiosk.start();
    }

}
