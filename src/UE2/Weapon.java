package UE2;

import UE1.Combattype;
import UE1.Damagetype;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class Weapon {
    private String name;
    private CombatType cType;
    private DamageType dType;
    private int damage;
    private int speed;
    private int strength;
    private int value;


    public Weapon() {
    }

    public Weapon(String name, CombatType combatType0, DamageType damageType0, int damage, int speed, int strength, int value) {
        this.name = name;
        this.cType = combatType0;
        this.dType = damageType0;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CombatType getCombatType() {
        return cType;
    }

    public void setcType(CombatType cType) {
        this.cType = cType;
    }

    public DamageType getDamageType() {
        return dType;
    }

    public void setdType(DamageType dType) {
        this.dType = dType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMinStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<UE1.Weapon> fileReader(File file){
        try {
            List<UE1.Weapon> list = Files.lines(new File("weapons.csv").toPath())
                    .skip(1)
                    .map(s -> s.split(";"))
                    .map(s -> new UE1.Weapon(
                            s[0],
                            Combattype.valueOf(s[1]),
                            Damagetype.valueOf(s[2]),
                            Integer.parseInt(s[3]),
                            Integer.parseInt(s[4]),
                            Integer.parseInt(s[5]),
                            Integer.parseInt(s[6])
                    ))
                    .collect(Collectors.toList());
            return list;
        }catch(IOException ioe){
            System.out.println("Die Datei ist eventuell fehlerhaltig");
        }
        /*ArrayList<Weapon> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] split = line.split(";");
                list.add(new Weapon(split[0], Combattype.valueOf(split[1]), Damagetype.valueOf(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6])));
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("File not Found");
        }*/
        return null;
    }

    @Override
    public String toString() {
        return name+" "+cType.toString()+" "+dType.toString()+" "+damage+" "+speed+" "+strength+" "+value;
    }
}
