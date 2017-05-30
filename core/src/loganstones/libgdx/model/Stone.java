package loganstones.libgdx.model;

/**
 * Created by Павел on 21.05.2017.
 */

public class Stone {
    public static Stone create(Entity SideA, Entity SideB) {
        return new Stone(SideA, SideB);
    }
    private Entity face;
    private Entity back;
    private boolean movable;

    public boolean isMovable() {
        return movable;
    }

    public void setMovable(boolean movable) {
        this.movable = movable;
    }


    private Stone(Entity SideA, Entity SideB) {
        face = SideA;
        back = SideB;
        movable = true;
    }

    public Entity getFace() {
        return face;
    }

    public void flip(Stone pStone){
            Entity dummy = pStone.face;
            pStone.face = pStone.back;
            pStone.back = dummy;

    }
}
