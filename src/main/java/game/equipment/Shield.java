package game.equipment;

public enum Shield {

    MEATSHEILD(20),
    PLATINUMSHIELD(60);

    private final int value;

    Shield(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
