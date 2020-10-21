/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.ai.gui;
import java.util.*;

/**
 *
 * @author krish
 */

class Player{
    int[] movePlayed = new int[10];
    String marker;
    
    public Player(String mark){
        this.marker = mark;
        for(int i=0; i<10; i++){
            movePlayed[i] = 0;
        }
    }
    boolean win(){
        if ((movePlayed[1]==1 && movePlayed[2] == 1 && movePlayed[3] == 1) ||
           (movePlayed[4]==1 && movePlayed[5] == 1 && movePlayed[6] == 1) ||
           (movePlayed[7]==1 && movePlayed[8] == 1 && movePlayed[9] == 1) ||
           (movePlayed[1]==1 && movePlayed[5] == 1 && movePlayed[9] == 1) ||
           (movePlayed[3]==1 && movePlayed[5] == 1 && movePlayed[7] == 1) ||
           (movePlayed[1]==1 && movePlayed[4] == 1 && movePlayed[7] == 1) ||
           (movePlayed[2]==1 && movePlayed[5] == 1 && movePlayed[8] == 1) ||
           (movePlayed[3]==1 && movePlayed[6] == 1 && movePlayed[9] == 1)){
            return true;
        }
        return false;
    }
}

public class TicTacToe {
    int[] moves = new int[10];
    Player p1 = new Player("X");
    Player p2 = new Player("O");
    byte availpos = 9;
    int chance = 0;
    boolean on = true;

    public TicTacToe() {
        for(int i=0; i<10; i++){
            moves[i] = 0;
        }
        availpos = 9;
        chance = 0;
        on = true;
    }
    
    
    String checkWin(){
        if (p1.win()){
            return "Player 1";  
        }
        if (p2.win()){
            return "Player 2";
        }
        return  "";
    }
    
    boolean moveable(int pos){
        if (moves[pos]==0){
            return true;
        }
        return false;
    }
    
    String getMarker(){
        return (this.chance==0)?"O":"X";
    }
}
