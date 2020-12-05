/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12;

/**
 *
 * @author MRZR
 */
public class Expetion {

    public static void main(String[] args) {

        try {
            //  int [] number=new int[4];
//        number[6]=4;

            int number = 4 / 0;

        } catch (ArithmeticException Divzero) {
            System.out.println(Divzero.getMessage());
            System.out.println("مجاز نیست");
        }

    }
}
