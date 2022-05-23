/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Game;
import java.util.List;

/**
 *
 * @author aakar
 */
public interface GameDao {
  
    Game add(Game game);
    
    List<Game> getAll();
    
    Game findById(int id);
    
    boolean update(Game game);
}
