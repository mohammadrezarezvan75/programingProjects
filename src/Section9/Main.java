/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9;

import Section9.Techear;

/**
 *
 * @author MRZR
 */
public class Main {

    public static void main(String[] args) {
        Techear person = new Techear("salam", 5);
        person.Name = "mohammad";
        person.setAge(23);
        person.setEycolor("brown");
        System.out.println("Name : " + person.Name + "\n" + " Age : " + person.getAge() + "\n" + "Ey color : " + person.getEycolor());

    }
}
