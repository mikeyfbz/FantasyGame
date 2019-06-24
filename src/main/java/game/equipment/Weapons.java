package game.equipment;

public enum  Weapons {

    SWORD(50),
    AXE(90);

    private final int value;

    Weapons(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
