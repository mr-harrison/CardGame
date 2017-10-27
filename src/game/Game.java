/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
/**
 *
 * @author user
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // Print the values of my cards in a deck
        Deck d = new Deck();
        d.shuffle();
        d.printAllCards(); 
        Player p = new Player();
        for(int i = 0; i < d.getSize(); i++) {
            p.addCard(d.cardAt(i));
        }
        System.out.println("");
        p.sortHand();
        p.printAllCards();
        
        SortGUI sG = new SortGUI();
        sG.setVisible(true);
        //GameGUI  g = new GameGUI();
        //g.setVisible(true);
        //GuessingGameGUI gG = new GuessingGameGUI();
        //gG.setVisible(true);

    }
    
}
