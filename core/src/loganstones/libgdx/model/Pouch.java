package loganstones.libgdx.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Павел on 21.05.2017.
 */

public class Pouch implements IPouch{
    private static final Pouch ourInstance = new Pouch();

    public static Pouch getInstance() {
        return ourInstance;
    }

    private Pouch() {
    }

    private ArrayList<Stone> pouchOfStones;

    @Override
    public void init(){
        pouchOfStones = new ArrayList<Stone>();
        for (int i=0; i<6; i++){
            pouchOfStones.add(Stone.create(Entity.Stone, Entity.Scissors));
            pouchOfStones.add(Stone.create(Entity.Scissors, Entity.Paper));
            pouchOfStones.add(Stone.create(Entity.Paper, Entity.Stone));
        }
        shuffle();
        shuffle();
        shuffle();
    }

    @Override
    public void shuffle(){
        Random rnd = new Random();
        Collections.shuffle(pouchOfStones,rnd);
    }

    @Override
    public Stone handOutStone(){
        Stone res = null;
        if (pouchOfStones.size() > 0)
            res = pouchOfStones.remove(0);
        return res;
    }
}
