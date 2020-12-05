/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2;

import java.util.Scanner;

/**
 *
 * @author MRZR
 */
public class J2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       
//        System.out.println("Please Enter Number :");
//        Scanner scan=new Scanner(System.in);
//        int Number = scan.nextInt();
//        System.out.println("Result :" + Number * 2);
//            System.out.println("Hello world...");
//            System.out.println("*************************");
//            Scanner scan = new Scanner(System.in);
//            int Number = scan.nextInt();
//            if (Number == 1 || Number == 2 || Number == 3) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
            
            System.out.println("Hello world...");
            System.out.println("*************************");
            Scanner scan=new Scanner(System.in);
            int Number = scan.nextInt();
            switch (Number) {
                case 1: {
                    System.out.println("A");
                    break;
                }

                case 2: {
                    System.out.println("B");
                    break;
                }

                case 3: {
                    System.out.println("C");
                    break;
                }

                default: {
                    System.out.println("Invalid...");
                    break;
                }
        }
    }
    
}
