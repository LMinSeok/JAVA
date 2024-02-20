package ex01;

import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += 
before
;
            month++;
        }
        while (
after
 < 100) {
            
money += after
;
            month++;
        }

        System.out.println(month);
    }
}