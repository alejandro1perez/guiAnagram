/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guianagram;

/**
 *
 * @author alejandro.perez
 */
public class GuiAnagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiFormAnagram gf = new GuiFormAnagram();
       gf.setVisible(true);
        //Anagram Game
        //To play just press button Show Word
        //Player has 60 secs to get as many words as possible
        //Each word is one point
        //If word is not met score will display failed, the game will keep going, so hurry! 
        //To restart just press Restart Game button and then press Show Word
        //Good Luck and have Fun
    }
    
}
