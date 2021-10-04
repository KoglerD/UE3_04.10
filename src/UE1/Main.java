package UE1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Comparator<Weapon> comparatorCombatT = (w1, w2) -> {
            return w1.getcType().compareTo(w2.getcType());
        };

        Comparator<Weapon> comparatorName = (w1, w2) -> {
            return w1.getName().compareTo(w2.getName());
        };

        Comparator<Weapon> comparatorDamage = (w1, w2) -> {
            return w2.getDamage()-w1.getDamage();
        };

        Weapon weapon = new Weapon();
        ArrayList<Weapon> weaponList = weapon.fileReader(new File("C:\\Schule\\2021-22 KoglerD190073\\POS\\Uebungen\\KoglerD_UE3_04.10.21\\UE3_KoglerD\\weapons.csv"));

        Printable printable = w -> {
            weaponList.sort(comparatorName);

            for (Weapon we : weaponList) {
                System.out.println(we.toString());
            }
            System.out.println("____________________________________");
        };

        printable.print(weaponList);

    }


}
