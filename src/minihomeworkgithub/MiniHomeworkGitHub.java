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
        
        System.out.println("Please enter your parsona details and the details of the car you want to rent:");
        
        System.out.println("Enter your name:");
        String Name = sc.nextLine();
        
        System.out.println("Enter your nationality:");
        String Nationality = sc.nextLine();
        
        System.out.println("Enter your date of birthday: ");
        int Birthday = sc.nextInt();
        
        System.out.println("Enter your credit card number:");
        int CreditCard = sc.nextInt();
        
        System.out.println("Enter car model:");
        String Model = sc.nextLine();
        
        System.out.println("Enter car make:");
        String Make = sc.nextLine();
        
        System.out.println("Enter car color:");
        String Color = sc.nextLine();
        
        System.out.println("Enter number of wheels:");
        int NumWheels = sc.nextInt();
        
        
        
        PersonalData personal = new PersonalData(Name, Nationality, Birthday, CreditCard);
        Data data = new Data(Model, Make, Color , NumWheels);
        
        sc.close();
        System.out.println("Name: " + personal.Name + ", Nationality: " + personal.Nacionality + ", Birthday: " + personal.Birthday + ", Credit card: " + personal.CreditCard);

        System.out.println("Car Make: " + data.Make + ", Car Model: " + data.Model + ", Car Color: " + data.Color + ", Number of Wheels: " + data.NumWheels);
        
        
    }
    
}
