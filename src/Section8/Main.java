package Section8;
import Section8.Techear;


public class Main {

    public static void main(String[] args) {
        Techear Person = new Techear("f");
        Person.Id=1;
        Person.Name="Mohammad Reza";
        Person.LastName="Rezvan";
        Person.TakeExam();
        Person.Teach();
        System.out.println(Person + " " +Person.Name);

    }

}
