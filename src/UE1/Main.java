package UE1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Weapon> list = new ArrayList<>();
        File file = new File("C:\\Schule\\2021-22 KoglerD190073\\POS\\Uebungen\\KoglerD_UE3_04.10.21\\UE3_KoglerD\\weapons.csv");
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
        }
        for (Weapon w:list) {
            System.out.println(w.toString());
        }
    }
}
