/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */


public class Card implements Comparable<Card> {
    private String faceValue = "";
    private String suit = "";
    
    public Card(String faceValue, String suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }
    
    public void setValue(String value){
        this.faceValue = value;
    }
    
    public String getValue() {
        String value = faceValue;
        return value;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public String getSuit(){
        String s = suit;
        return s;
    }
    
    public String getImage() {
        String imageName = faceValue + suit;
        return imageName;
    }
    
    @Override
    public String toString(){
        return(faceValue + " of " + suit + "\n");
    }
    @Override
    public int compareTo(Card compareCard) {
        Map<String, Integer> faceValues = new HashMap<>();
        Map<String, Integer> suits = new HashMap<>();
        faceValues.put("Ace", 0);
        faceValues.put("2", 1);
        faceValues.put("3", 2);
        faceValues.put("4", 3);
        faceValues.put("5", 4);
        faceValues.put("6", 5);
        faceValues.put("7", 6);
        faceValues.put("8", 7);
        faceValues.put("9", 8);
        faceValues.put("10", 9);
        faceValues.put("Jack", 10);
        faceValues.put("Queen", 11);
        faceValues.put("King", 12);
        //Initialize the suits to values so they can be sorted
        suits.put("Spades", 0);
        suits.put("Hearts", 1);
        suits.put("Diamonds", 2);
        suits.put("Clubs", 3);
        int compareSuit = suits.get(((Card)compareCard).getSuit());
        int compareValue = faceValues.get(((Card)compareCard).getValue());
        if(suits.get(this.suit) == compareSuit)
        {
            /* For Ascending order of values */
            return faceValues.get(this.faceValue)-compareValue;
         }
        /* For Ascending order of suits */
        else return suits.get(this.suit) - compareSuit; 
     }
}
