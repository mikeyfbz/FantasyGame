package game.equipment;

public enum Potions {

    ELIXIR(100),
    HERB(10);

    private final int value;

    Potions(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
