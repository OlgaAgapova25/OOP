package HW5.view;

import HW5.service.VendingMachine;
import HW5.service.VendingMachineImpl;

import java.util.Scanner;

public class UserView {
    public String chooseProductName(){
        System.out.println("enter product name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

}
