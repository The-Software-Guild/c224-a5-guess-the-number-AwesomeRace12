/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author aakar
 */
public class Game {
    private int gameID;
    private String answer;
    private boolean finished;
    
    public Game() {
    }

    public Game(String answer, boolean finished) {
        this.answer = answer;
        this.finished = finished;
    }
    
    

    public Game(int gameID, String answer, boolean finished) {
        this.gameID = gameID;
        this.answer = answer;
        this.finished = finished;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
    @Override
    public String toString() {
        return "Game{" + "gameId=" + gameID + ", answer=" + answer + ", finished=" + finished + '}';
    }
    
}
