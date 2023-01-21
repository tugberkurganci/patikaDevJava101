package Basic;

import java.util.Scanner;

public class GradeAverage {

    public  void grade(){

        Scanner scanner=new Scanner(System.in);


        String passOrNoPass="";
        System.out.println("Math grade");
        int math=scanner.nextInt();
        System.out.println("Pyhsics grade");
        int pyhsics=scanner.nextInt();
        System.out.println("Chemical grade");
        int chemical=scanner.nextInt();
        System.out.println("Turkish grade");
        int turkish=scanner.nextInt();
        System.out.println("History grade");
        int history=scanner.nextInt();
        System.out.println("Music grade");
        int music=scanner.nextInt();

        int coursecount=6;
        int totalGrade=math+pyhsics+chemical+turkish+history+music;
        double coursesAverage=totalGrade/coursecount*1.0;

        System.out.println(coursesAverage>=60? "Pass":"Failed");
    }
}
