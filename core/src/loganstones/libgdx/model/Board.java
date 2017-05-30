package loganstones.libgdx.model;

import com.badlogic.gdx.math.Vector3;

import java.util.HashMap;

/**
 * Created by Павел on 21.05.2017.
 */

public class Board implements IBoard {
    private HashMap<Vector3, Stone> Stones;

    private static final Board ourInstance = new Board();

    public static Board getInstance() {
        return ourInstance;
    }

    private Board() {
        Stones = new HashMap<Vector3, Stone>();
    }

    @Override
    public HashMap<Vector3, Entity> getBoard() {
        HashMap<Vector3, Entity> retBoard = new HashMap<Vector3, Entity>();
        for (Vector3 p : Stones.keySet()){
            retBoard.put(p, Stones.get(p).getFace());
        }
        return retBoard;
    }

    @Override
    public void moveStone(Vector3 oldPoint, Vector3 newPoint) {
        Stone s = Stones.remove(oldPoint);
        Stones.put(newPoint, s);
        Stones.get(newPoint).setMovable(false);
    }

    @Override
    public void putStone(Stone pStone, Vector3 pPoint) {
        Stones.put(pPoint, pStone);
    }
}
