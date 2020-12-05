package Section6;

import java.util.ArrayList;

public class AList {

    public static void main(String[] args) {

//        ArrayList List = new ArrayList();
//        List.add("mohammad");
//        List.add(34);
//        List.get(1);
//        List.remove(1);
//        List.size();
        ArrayList<String> List = new ArrayList();
        List.add("mohammad");
        List.add("jh");
        List.get(1);
        List.remove(1);
        List.size();

        for (String name : List) {
            System.out.println(name);
        }
    }
}
