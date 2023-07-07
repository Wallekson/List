package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, increaseId;

        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();

        Employee[] employee = new Employee[n];

        for (int i = 0; i < n; i++){
            System.out.printf("\nEmplyoee #%d\n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employee[i] = new Employee(id, name, salary);
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        increaseId = sc.nextInt();
        System.out.printf("Enter the percentage: %.1f:" );
        double percentage = sc.nextDouble();



    }
}
