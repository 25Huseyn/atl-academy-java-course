package az.atlacademy.eolympArray;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        System.out.println(a * b * c);
    }
}
