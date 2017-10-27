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
public class Player {
    private int handSize;
    private ArrayList<Card> hand = new ArrayList<>();
    private String playerName;
    private boolean faceUp = true;
    
    public Player() {
        this.handSize = 0;
        this.playerName = "Empty";
    }
    
    public Player(String playerName) {
        this.handSize = 0;
        this.playerName = playerName;
    }
    
    public void addCard(Card c) {
        this.hand.add(c);
        this.handSize++;
    }
    
    public void setPlayerName(String name) {
        this.playerName = name;
    }
    
    public void removeCard(int location) {
        if(location > 0 && location < this.handSize) {
            hand.remove(location);
        }
    }
    
    public String getPlayerName() {
        String p = this.playerName;
        return p;
    }
    
    public void sortHand() {
        Collections.sort(hand);
    }
    
    public Card cardAt(int i) {
        return hand.get(i);
    }
    
    public void setFaceUp() {
        this.faceUp = true;
    }
    
    public void setFaceDown() {
        this.faceUp = false;
    }
    
    public boolean isFaceUp() {
        boolean b = this.faceUp;
        return b;
    }
    public int handSize() {
        int hs = this.handSize;
        return hs;
    }
    
    public void printAllCards() {
        for(int i = 0; i < handSize; i++) {
            System.out.print(hand.get(i).toString());
        }
    }
}