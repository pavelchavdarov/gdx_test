package loganstones.libgdx.model;

import com.badlogic.gdx.math.Vector3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Павел on 30.05.2017.
 */

public class gameModel {
    IBoard board;
    IPouch pouch;
    ArrayList<IPlayer> players;
    int currentPlayer;


    public gameModel() {
        players = new ArrayList<IPlayer>();
        // 2 players
        players.add(new Player());
        players.add(new Player());

        board = Board.getInstance();
        pouch = Pouch.getInstance();
        pouch.init();

        Random rand = new Random();
        currentPlayer = rand.nextInt()%2;

    }

    public IBoard getBoard(){
        return board;
    }

    public IPlayer getCurrentPlayer(){
        return players.get(currentPlayer);
    }

    public ArrayList<IPlayer> getPlayers(){
        return players;
    }

    public int changePlayer(){
        currentPlayer = (currentPlayer + 1)%2;
        return currentPlayer;
    }
    public IPouch getPouch(){
        return pouch;
    }


}
