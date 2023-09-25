/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22myhometasks;
import tasks.NumberParser;
import java.util.Scanner;
import tasks.TemperatureConverter;
/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;
    
    public App(){
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat=true;
        do{
           System.out.println("выберите задачу: ");
           System.out.println("0-закончить программу");
           System.out.println("1-конвертер температуры");
           System.out.println("2-парсер числа");
           int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("у тебя прога кончилась брат");
                    repeat=false;
                    break;
                case 1:
                    System.out.println("ты выбрал конвертер температуры");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("ты выбрал папсер числел");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                default:
                    System.out.println("у меня нет такой цифры брат выбери ту которая есть");
            }
        }while(repeat);
        System.out.println("свободен");
    }


}
