/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MRZR
 */
public class BMW extends Car {

    public static void main(String[] args) {
        BMW iii = new BMW();
        iii.door = 2;
        iii.Start();
        iii.Moved();
        iii.Stoped();

    }

    @Override
    void Moved() {
        System.out.println("Bmw is faster moving...");
    }
}
