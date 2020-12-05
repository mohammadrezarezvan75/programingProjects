/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section3;

/**
 *
 * @author MRZR
 */
import javax.swing.JOptionPane;
import Section3.j3;

public class j3 {

    public static void main(String[] args) {

//        String str = JOptionPane.showInputDialog("Hello World...");
//        JOptionPane.showMessageDialog(null, str);
        //کامنت تک خطی
        /*
        کامنت چند خطی
         */
        //این بخش داده ها ناسازگار نیستند  
//        int i = 10;
//        float f = 22;
//        f = i;
//
//        //به این بخش 
//         // casting 
//         // گویند
//        i = (int) f;
//        String Num = JOptionPane.showInputDialog("Please Enter Number :");
//        int Number = Integer.parseInt(Num);
//        if (Number <= 10) {
//            JOptionPane.showMessageDialog(null, "کودک");
//        } else {
//            JOptionPane.showMessageDialog(null, "بزرگ سال");
//        }
        // عملگر سه عملوندی شرطی
        int Number = 11;
        Number = Number <= 10 ? 1 : 0;
        JOptionPane.showMessageDialog(null, Number);
    }

}
