/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task3romankukalev;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JPTV21Task3RomanKukalev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите вашу фамилию: ");
        String lastname = scanner.nextLine();
        System.out.print("Введите ваш личный код: ");
        String id = scanner.nextLine();
        String year = (id.substring(1,3));
        String day = (id.substring(5,7));
        String month = (id.substring(3,5));
        
        System.out.print("\t"+name);
        System.out.print("\t"+lastname);
        System.out.println(" родился " + day +" числа " + year + " года " + month + " месяца ");
        // TODO code application logic here
    }
    
}
