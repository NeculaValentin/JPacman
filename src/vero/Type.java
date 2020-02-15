package vero;

public enum Type {
    WALL(1), DOT(2),PACMAN (3),GHOST(4), BLANK(6), POWER_UP(8);
    private int value;

    Type(int value) {
        this.value = value;
    }


    public int getValue(){
    return value;
    }
}
