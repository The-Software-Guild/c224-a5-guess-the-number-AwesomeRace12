/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDateTime;

/**
 *
 * @author aakar
 */
public class Round {
    private int gameID;
    private String guess;
    private String result;
    private LocalDateTime guess_time;
    
    public Round(){
        
    }
     public Round(int gameID, String guess) {
        this.gameID = gameID;
        this.guess = guess;
    }
    

    public Round(int gameID, LocalDateTime guess_time, String guess, String result) {
        this.gameID = gameID;
        this.guess_time = guess_time;
        this.guess = guess;
        this.result = result;
    }
    public void setgameID(int gameID){
        this.gameID = gameID;
    }
    public int getID(){
       return gameID; 
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDateTime getGuesstime() {
        return guess_time;
    }

    public void setGuesstime(LocalDateTime guess_time) {
        this.guess_time = guess_time;
    }
}
