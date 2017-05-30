package loganstones.libgdx.model;

import java.util.ArrayList;

/**
 * Created by Павел on 29.05.2017.
 */

public class Player implements IPlayer {
    ArrayList<Stone> stonesSet;
    String name;
    private static int playersAmount = 0;
    int number;

    private int chosenStone;

    public int getChosenStone() {
        return chosenStone;
    }

    public void setChosenStone(int chosenStone) {
        if(chosenStone > 0 && chosenStone < stonesSet.size())
            this.chosenStone = chosenStone;
    }

    public Player(String name) {
        this.name = name;
        number = playersAmount++;

        stonesSet = new ArrayList<Stone>();
    }

    public Player() {
        number = playersAmount++;
        this.name = "Player" + String.valueOf(number);

        stonesSet = new ArrayList<Stone>();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    // ипользовать только для View
    @Override
    public ArrayList<Entity> getStonesSet() {
        ArrayList<Entity> ret = new ArrayList<Entity>();
        for(Stone stone : stonesSet){
            ret.add(stone.getFace());
        }

        return ret;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void GetStone(Stone stone){
        stonesSet.add(stone);
    }

    @Override
    public Stone PutStone(){
        return stonesSet.remove(chosenStone);
    }

    public static void resetPlayersAmount() {
        playersAmount = 0;
    }
}
