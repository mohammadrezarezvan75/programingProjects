/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9;

import sun.management.resources.agent;

/**
 *
 * @author MRZR
 */
public class Techear {


    public String getEycolor() {
        return Eycolor;
    }

 
    public void setEycolor(String Eycolor) {
        this.Eycolor = Eycolor;
    }

  

    public int ID;
    public String Name;
    public String LastName;
    private int age;
    private String Eycolor;

    public Techear() {
        //Defualt Canstructor

    }

    public Techear(String message, int Counter) {
        //Canstructor
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void Tach() {
//        System.out.println("Section9.Techear.Tach()");
//    }
//
//    public void Exam() {
//        System.out.println("Section9.Techear.Exam()");
//    }
}
