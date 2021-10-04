package UE1;

public class Weapon {
    private String name;
    private Combattype cType;
    private Damagetype dType;
    private int damage;
    private int speed;
    private int strength;
    private int value;

    public Weapon(String name, Combattype cType, Damagetype dType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.cType = cType;
        this.dType = dType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    @Override
    public String toString() {
        return name+" "+cType.toString()+" "+dType.toString()+" "+damage+" "+speed+" "+strength+" "+value;
    }

    public String getName() {
        return name;
    }

    public Combattype getcType() {
        return cType;
    }

    public Damagetype getdType() {
        return dType;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcType(Combattype cType) {
        this.cType = cType;
    }

    public void setdType(Damagetype dType) {
        this.dType = dType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
