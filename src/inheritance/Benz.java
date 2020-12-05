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
public class Benz extends Car {

    public static void main(String[] args) {
        Benz bb = new Benz();
        bb.door = 2;
        bb.Start();
        bb.Moved();
        bb.Stoped();
    }
}
