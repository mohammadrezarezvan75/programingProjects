package Section6;

import Section6.j6;
import java.util.Arrays;
import java.util.ArrayList;

public class j6 {

    public static void main(String[] args) {

//        Array
//        int[] Arrayint = new int[5];//برون خطی
//
//        Arrayint[0] = 1;
//        Arrayint[1] = 2;
//        Arrayint[2] = 3;
//        Arrayint[3] = 4;
//        Arrayint[4] = 5;
//        for (int i = 0; i < Arrayint.length; i++) { //   
//            System.out.println(Arrayint[i]);
//        }
        int[] Array = {1, 2, 3, 4, 5};//درون خطی

        Array[0] = 30;
        Array[1] = 60;
        Array[2] = 90;
        Array[3] = 10;
        Array[4] = 38;

        Arrays.sort(Array);

        // حالت اول 
        // این حالت برای دسترسی به تعداد محدودی است  
        //        int length = Array.length;
        //        for (int i = 0; i < length; i++) {
        //            System.out.println("index :" + i + "\\" + Array[i]);
        //        }
        //        
        
        //حالت دوم
        // برای دسترسی به تمام ایندکس ها این حالت مناسب تر است 
        for (int i : Array) {
            System.out.println("index Array :" + i);
        }
    }
}
