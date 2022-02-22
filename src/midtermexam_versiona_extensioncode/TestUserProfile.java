/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Matthew Beaudoin
 */
public class TestUserProfile {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        UserProfile account = new UserProfile("HOLD","ACTION");
        
        System.out.print("Please enter account name:");
        account.setUserID(input.nextLine());
        
        System.out.println("\nPlease Select a genre:");
        System.out.print("Comedy\nDrama\nAction\nMystery\n");
        
        account.setGenre(input.nextLine());
        
        System.out.println("Account Created! Welcome " + account.getUserID());
    
    }
}
