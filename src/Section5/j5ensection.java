/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5;

import Section5.j5ensection;
import java.util.Scanner;

/**
 *
 * @author MRZR
 */
public class j5ensection {

    public static void main(String[] args) {

//        String str="Gholi";
//        str.replace("li", "lam");
//        System.out.println(str);
//
//        String str = "Gholi";
//        String replaced = str.replace("li", "lam");;
//        System.out.println(replaced);
        // برنامه بخش پذیری در فصل  پنجم
        System.out.println("Please Enter Number :");
        Scanner input = new Scanner(System.in);
        int Number = 0;
        Number = input.nextInt();
        int div5 = 0; //Number % 5;
        if (Number > 50) {
            if (div5 == Number % 5 || Number == 0) {
                System.out.println("b b");
            } else {
                System.out.println("E K");
            }
        } else if (Number < 50) {
            System.out.println(Number * 2);
        }
    }
}
