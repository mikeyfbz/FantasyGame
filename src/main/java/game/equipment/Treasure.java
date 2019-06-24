package game.equipment;

public enum Treasure {

    GOLD(100),
    DIAMONDS(500);

    private final int value;

    Treasure(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
