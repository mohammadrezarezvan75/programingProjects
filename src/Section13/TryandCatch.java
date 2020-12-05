/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section13;

/**
 *
 * @author MRZR
 */
public class TryandCatch {

    public static void main(String[] args) {
        try {
            Test();
            Test2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    public static void Test() throws Exception {

        int[] Array = new int[4];
        Array[2] = 2;
        System.out.println("Test Error");

    }

    public static void Test2() throws Exception {

        int number = 10 + 5;
        System.out.println(number);

    }
}
