import java.util.Scanner;

public class BodyMassIndex {

    public void bmi(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your kilogram:");
        double kilogram=scanner.nextInt();
        System.out.println("enter your height cm:");
        double height=scanner.nextInt();

        double bmi=kilogram/( height*height);
        System.out.println("Your body mass index :"+(bmi));


    }
}
