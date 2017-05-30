package loganstones.libgdx.model;

import java.util.ArrayList;

/**
 * Created by Павел on 29.05.2017.
 */

public interface IPlayer {
    void GetStone(Stone stone);

    Stone PutStone();

    String getName();

    int getNumber();

    // ипользовать только для View
    ArrayList<Entity> getStonesSet();

    void setName(String name);

    int getChosenStone();

    void setChosenStone(int chosenStone);
}
