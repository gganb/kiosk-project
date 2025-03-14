package com.example.kiosk.challenge;

import java.util.Scanner;

// 입력 처리
public class Input {

    private static Scanner scan = new Scanner(System.in);

    private Input() {
    }

    public static int getInputNum() {
        while (true) {
            try {
                return Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자를 입력해주세요.");
            }
        }
    }
}
