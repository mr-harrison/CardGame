/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Deck {
    private int deckSize = 0;
    ArrayList<Card> deck = new ArrayList<>();
    public Deck() {
        Map<Integer,String> faceValues = new HashMap<>();
        faceValues.put(0, "Ace");
        faceValues.put(1, "2");
        faceValues.put(2, "3");
        faceValues.put(3, "4");
        faceValues.put(4, "5");
        faceValues.put(5, "6");
        faceValues.put(6, "7");
        faceValues.put(7, "8");
        faceValues.put(8, "9");
        faceValues.put(9, "10");
        faceValues.put(10, "Jack");
        faceValues.put(11, "Queen");
        faceValues.put(12, "King");
        
        Map<Integer,String> suits = new HashMap<>();
        suits.put(0, "Spades");
        suits.put(1, "Hearts");
        suits.put(2, "Diamonds");
        suits.put(3, "Clubs");
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) { 
                deck.add(new Card(faceValues.get(j),suits.get(i)));
                deckSize++;
            }
        }
    }
    
    public void printAllCards() {
        for(int i = 0; i < deckSize; i++) {
            System.out.print(deck.get(i).toString());
        }
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    public void removeCard(int index) {
        deck.remove(index);
        deckSize--;
    }
    
    public Card cardAt(int i) {
        return deck.get(i);
    }
    
    public int getSize() {
        int size = deckSize;
        return size;
    }
}
