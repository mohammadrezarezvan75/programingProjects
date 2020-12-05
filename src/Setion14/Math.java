/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Setion14;

import javax.swing.JOptionPane;

/**
 *
 * @author MRZR
 */
public class Math {

    public static class MathCalculation {

        public static int Power(int FirstNumber, int SecoundNumber) {
            int ThreeNumber = 1;
            if (SecoundNumber > 10) {
                JOptionPane.showInputDialog("لطفا عدد را وارد کنید  ");
            } else {
                for (int i = 0; i < SecoundNumber; i++) {
                    ThreeNumber = ThreeNumber * FirstNumber;
                    JOptionPane.showMessageDialog(null, ThreeNumber);
                }
            }
            return ThreeNumber;
        }
    }
}
