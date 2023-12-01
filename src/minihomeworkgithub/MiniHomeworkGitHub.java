/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomeworkgithub;

import java.util.Scanner;

/**
 *
 * @author peuvi
 */
public class MiniHomeworkGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter the details of the car you want to rent:");
        
        System.out.println("Enter car model:");
        String Model = sc.nextLine();
        
        System.out.println("Enter car make:");
        String Make = sc.nextLine();
        
        System.out.println("Enter car color: ");
        String Color = sc.nextLine();
        
        System.out.println("Enter number of wheels:");
        int NumWheels = sc.nextInt();
        
        Data data = new Data(Model, Make, Color , NumWheels);
        
        sc.close();
        
        System.out.println("Car make: " + data.Make + ", Car Model: " + data.Model + ", Car Color: " + data.Color + ", Number of Wheels: " + data.NumWheels);

        
    }
    
}
