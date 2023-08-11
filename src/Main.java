/*  bmi = weight / height^2
    if bmi <= 18.5 напечатать "недовес"
    if bmi <= 25.0 напечатать "все в норме"
    if bmi <= 30.0 напечатать "лишний вес"
    if bmi > 30 напечатать "ожирение"
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите вес в килограммах: ");
        double weight = s.nextDouble();
        System.out.println();
        System.out.print("Введите рост в метрах: ");
        double height = s.nextDouble();
        System.out.println();
        double bmi = weight / (height * height);
        System.out.println(bmi);

        if(bmi <= 18.5) System.out.println("недовес");
        else if(bmi <= 25.0) System.out.println("все в норме");
        else if(bmi <= 30.0) System.out.println("лишний вес");
        else System.out.println("ожирение");
    }
}