/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TemperatureConverter {
    private Scanner scanner;
    public TemperatureConverter(Scanner scanner){
        this.scanner=scanner;
    }
    public void doConvert() {
        boolean repeat = true;
        do{
            System.out.println("выбери способ конвертации брат");
            System.out.println("0-ненадо я передумал");
            System.out.println("1-из цельсия в фаренгейты");
            System.out.println("2-из фаренгейтов в цельсии");
            System.out.print("Задача №: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("хорошо я тебя понял");
                    repeat=false;
                    break;
                case 1:
                    System.out.println("конвертирую цельсии в фаренгейты");
                    celsiusToFahrenheit();
                    break;
                case 2:
                    System.out.println("конвертирую фаренгейты в цельсии");
                    FahrenheitToCelsius();
                    break;
                default:
                    System.out.println("нету у меня такой цифры выбери которую есть");;
            }
            System.out.println("------------");
        }while(repeat);
    }

    private void celsiusToFahrenheit() {
        System.out.print("введите температуру (Celsius): ");
        double tCelsius = scanner.nextDouble(); scanner.nextLine();
        double tFahrenheit = (tCelsius*9/5)+32;
        System.out.printf("результат (Fahrenheit): %.1f%n",tFahrenheit);
    }
    private void FahrenheitToCelsius(){
        System.out.print("введите температуру (фахренхаит): ");
        double tFahrenheit = scanner.nextDouble(); scanner.nextLine();
        double tCelsius = (tFahrenheit-32)*5/9;
        System.out.printf("результат (Celsius): %.1f%n",tCelsius);
    }
    
}
