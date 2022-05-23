/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Round;
import java.util.List;

/**
 *
 * @author aakar
 */
public interface RoundDao {
    
    Round add(Round round);
    List<Round> getRoundbyGameid(int gameid);
}
