package Employee;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee() {
    }


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax() {

        if (this.salary > 1000) {
            return this.salary / 100 * 3;
        } else return 0;
    }

    public int bonus() {

        if (this.workHours > 40) {
            return (workHours - 40) * 30;
        } else return 0;

    }

    public int raiseSalary() {

        int date = 2021;

        if (date - this.hireYear < 10) {

            return this.salary * 5 / 100;
        } else if (date - this.hireYear > 9 && date - this.hireYear < 20) {

            return this.salary * 10 / 100;
        } else if (date - this.hireYear > 19) {
            return this.salary * 15 / 100;
        }

        return 0;
    }
     public void tooString(){


         System.out.println("name :"+this.name);
         System.out.println("salary : "+this.salary);
         System.out.println("hire year :"+this.hireYear);
         System.out.println("vergi :"+tax() );
         System.out.println("bonus :"+ bonus());
         System.out.println("raise salary :"+raiseSalary());
         System.out.println("total salary :"+(this.salary+bonus()+raiseSalary()-tax()));
     }
}
