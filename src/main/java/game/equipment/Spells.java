package game.equipment;

public enum Spells {

    FIREBALL(30),
    LIGHTENINGSTRIKE(50);

    private final int value;

    Spells(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
