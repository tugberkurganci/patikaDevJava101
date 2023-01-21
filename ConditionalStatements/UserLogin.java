package ConditionalStatements;

import java.util.Scanner;

public class UserLogin {


    public void login() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter username:");
        String userName = scanner.nextLine();
        System.out.print("enter password:");
        String password = scanner.nextLine();
        String realPassword = "123";

        if (userName.equals("tugberk") && password.equals(realPassword)) {

            System.out.println("acsess sucsessful");
        } else {
            System.out.println("acsess failed");
            System.out.println("do you want create new password 1-yes ,2 -no");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.print("enter your new password:");
                String newPassword = scanner.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Could not create password, please enter another password");
                    String newpassword2 = scanner.nextLine();
                    if (!newpassword2.equals(password)) {
                        realPassword = newpassword2;
                        System.out.println("Password created");
                    } else System.out.println("could not create password");
                } else {
                    realPassword = newPassword;
                    System.out.println("Password created");
                }


            }
        }

    }
}

