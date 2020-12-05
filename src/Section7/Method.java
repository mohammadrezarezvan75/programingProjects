package Section7;

public class Method {

    public static void main(String[] args) {
//        int sum = Add(3, 4);
//        System.out.println("sum = " + sum);

        //روش دوم
//        System.out.println(Add(4, 5));
//        print();
//        int Result = Add(4, 3);
//        print("sum =" + Result);
//        for (int i = 0; i < 10; i++) {
//            print(String.valueOf(i));
//        }
//        print(String.valueOf(456));

// for (int i = 0; i < 10; i++) {
//            print(i);
//        }
//        print(567);
           System.out.println(Cheak(4));
    }

    public static int Add(int FirstNumber, int SecoundNumber) {

//        int sum = FirstNumber + SecoundNumber;
//        return sum;
        return FirstNumber + SecoundNumber;
    }

    public static int Min(int FirstNumber, int SecoundNumber) {
        return FirstNumber - SecoundNumber;
    }

    public static int Multiy(int FirstNumber, int SecoundNumber) {
        return FirstNumber + SecoundNumber;
    }

    public static int Dvid(int FirstNumber, int SecoundNumber) {
        return FirstNumber + SecoundNumber;
    }

    public static void print(int Name) {
        System.out.println();
    }

    public static String Cheak(int Number) {
        if (Number % 2 == 0) {
            Number = Add(Number, 5);
            print(Number);
            return "زوج";
        } else {
            return "فرد";
        }
    }
    
//    int method()
//    {
//       return 0;
//    }
//    
//    void method()
//    {
//        
//    }
    
    int method=0;
    int method()
    {
        return 0;
    }
    
    void hi()
    {
        System.out.println("salam");
    }

}
