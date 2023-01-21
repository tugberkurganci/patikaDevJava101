package ConditionalStatements;

import java.util.Scanner;

public class CoursePass {
    public  void grade(){

        Scanner scanner=new Scanner(System.in);

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

        int coursecount=0;
        int totalGrade=0;
        int [] grade=new int[]{math,pyhsics,chemical,turkish,history,music};

        for (int i = 0; i < grade.length ; i++) {
            if (grade[i]<=100 && grade[i]>=0)
            {
                coursecount++;
                totalGrade+=grade[i];
            }
        }

        double coursesAverage=totalGrade/coursecount*1.0;
        System.out.println(coursesAverage>=60? "Pass":"Failed");
    }



}
