package UE1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public Weapon() {
    }

    public List<Weapon> fileReader(File file){
        try {
            List<Weapon> list = Files.lines(new File("weapons.csv").toPath())
                    .skip(1)
                    .map(s -> s.split(";"))
                    .map(s -> new Weapon(
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
