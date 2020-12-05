/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12;
import Section12.Car;
/**
 *
 * @author MRZR
 */
public class argsorvarargs {

    public static void main(String[] args) {
        String[] Names = new String[4];
        Names[0] = "mohamamd";
        Names[1] = "rezvan";
        Names[2] = "rezvan";
        Names[3] = "rezvan";

        
        GetArray(Names);
        GetArray("hi");
        GetArray("hi","hi","hi");
        GetArray();
        
        Car c1=new Car();
        c1.door=4;
        getclass(c1);

    }

    public static void GetArray(String... args) {
        for (String item : args) {
            System.out.println(item);
        }
    }
    
    public static void getclass(Car c) {
        System.out.println(c.getClass());
    }

}
