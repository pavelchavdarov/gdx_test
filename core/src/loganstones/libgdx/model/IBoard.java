package loganstones.libgdx.model;

import com.badlogic.gdx.math.Vector3;

import java.util.HashMap;

/**
 * Created by Павел on 21.05.2017.
 */

public interface IBoard {
    HashMap<Vector3, Entity> showBoard();

    void moveStone(Vector3 oldPoint, Vector3 newPoint);

    void putStone(Stone pStone, Vector3 pPoint);
}
