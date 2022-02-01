/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * Student Name: Matthew Beaudoin
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card matthewTenClubs = new Card("Clbs", 10);
        matthewTenClubs.setSuit("diamonds");
        
        System.out.println(matthewTenClubs.getValue());
        System.out.println(matthewTenCLubs.getSuit());
    }
}
