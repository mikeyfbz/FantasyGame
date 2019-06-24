package game.equipment;

public enum Armour {

    PLATEARMOUR(5),
    BUBBLEARMOUR(2);

    private final int value;

    Armour(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
