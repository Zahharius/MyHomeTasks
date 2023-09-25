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
public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }
        public void doParse() {
        System.out.print("Введите трёхзначное число:");
        int number = scanner.nextInt(); scanner.nextLine();
    }
    
    
}
