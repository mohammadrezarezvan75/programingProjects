/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5;

import Section5.J5;

/**
 *
 * @author MRZR
 */
public class J5 {

    public static void main(String[] args) {

        // break , Continue
//        for (int i = 0; i < 5; i++) {
//            if (i == 4)break; {
//                System.out.println(i);
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue;
//            } else if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }
        // جدول ضرب
//        int Result = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                Result = i * j;
//                System.out.println(i + "*" + j + "=" + Result);
//            }
//        }
//        outer:
//        for (int i = 0; i < 10; i++) {
//            inner:
//            for (int j = 0; j < 10; j++) {
//                if (j == 2) {
//                    break outer;
//                } else {
//                    System.out.println(i);
//                }
//                System.out.println(j);
//            }
//        }
        // for بی نهایت
        for (;;) {
            System.out.println("loop");
        }

    }
}
