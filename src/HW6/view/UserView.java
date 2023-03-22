package HW6.view;

import java.util.Scanner;

public class UserView {
    public String chooseProductName(){
        System.out.println("enter product name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

}
