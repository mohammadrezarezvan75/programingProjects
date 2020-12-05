/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5;

/**
 *
 * @author MRZR
 */
public class stringMethod {

    public static void main(String[] args) {
        String Test = "This Is A Test For Test";

        char character = Test.charAt(0);

        System.out.println(character);
        /////////////////////////////
        int index = Test.indexOf("test");

        System.out.println(index);
        //////////////////////////////
        int LastIndex = Test.lastIndexOf("test");

        System.out.println(LastIndex);
        /////////////////////////////////////////
        String ReplacedTest = Test.replace("test", "sample");

        System.out.println(ReplacedTest);
        ////////////////////////////////////////
        String subStr = Test.substring(10, 14);

        System.out.println(subStr);
        /////////////////////////////////////
        String NewTest = ReplacedTest + " = " + index + " " + LastIndex;

        System.out.println(NewTest.toUpperCase());
        System.out.println(NewTest.toLowerCase());
        String NewStr = NewTest.concat("hi");

        System.out.println(NewStr);
        /////////////////////////////////
        int length = Test.length();

        System.out.println(length);
        /////////////////////////////////
        boolean IsTest = Test.contains("sample");

        System.out.println(IsTest);
        ////////////////////////////////
        boolean IsStart = Test.startsWith("this");
        boolean IsEnd = Test.endsWith("sample");

        System.out.println(IsStart
                + " " + IsEnd);

        boolean isTest = false;

        if (Test.equalsIgnoreCase(
                "this is a test for test")) {
            isTest = true;
        }

        System.out.print(isTest);

    }
}
