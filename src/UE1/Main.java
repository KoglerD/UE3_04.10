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

        Comparator<Weapon> comparatorNameLength = (w1, w2) -> {
            return w2.getName().length()-w1.getName().length();
        };

        Comparator<Weapon> comparatorDamageT = (w1, w2) -> {
            return w1.getdType().compareTo(w2.getdType());
        };

        Weapon weapon = new Weapon();
        ArrayList<Weapon> weaponList = weapon.fileReader(new File("C:\\Schule\\2021-22 KoglerD190073\\POS\\Uebungen\\KoglerD_UE3_04.10.21\\UE3_KoglerD\\weapons.csv"));



        Printable printable = w -> {
            int namelengthMax = 0;
            int dTypelengthMax = 0;
            int cTypelengthMax = 0;
            int damagelengthMax = 0;
            int speedlengthMax = 0;
            int strengthlengthMax = 0;
            int valuelengthMax = 0;
            w.sort(comparatorName);


            for (Weapon we : w) {
                if (we.getName().length() >= namelengthMax) {
                    namelengthMax = we.getName().length();
                }
                if (we.getdType().toString().length() >= dTypelengthMax) {
                    dTypelengthMax = we.getdType().toString().length();
                }
                if (we.getcType().toString().length() >= cTypelengthMax) {
                    cTypelengthMax = we.getcType().toString().length();
                }
                if (String.valueOf(we.getDamage()).length() >= damagelengthMax) {
                    damagelengthMax = String.valueOf(we.getDamage()).length();
                }
                if (String.valueOf(we.getStrength()).length() >= strengthlengthMax) {
                    strengthlengthMax = String.valueOf(we.getStrength()).length();
                }
                if (String.valueOf(we.getSpeed()).length() >= speedlengthMax) {
                    speedlengthMax = String.valueOf(we.getSpeed()).length();
                }
                if (String.valueOf(we.getValue()).length() >= valuelengthMax) {
                    valuelengthMax = String.valueOf(we.getValue()).length();
                }
            }

            String damageString = "";
            List<String> damageList = new ArrayList<>();
            String nameString = "";
            List<String> nameList = new ArrayList<>();
            String cTypeString = "";
            List<String> cTypeList = new ArrayList<>();
            String dTypeString = "";
            List<String> dTypeList = new ArrayList<>();
            String strengthString = "";
            List<String> strengthList = new ArrayList<>();
            String speedString = "";
            List<String> speedList = new ArrayList<>();
            String valueString = "";
            List<String> valueList = new ArrayList<>();


            for (Weapon we  :w) {
                damageString = String.valueOf(we.getDamage());
                while (damageString.length() <= damagelengthMax){
                    damageString += " ";
                }
                damageString += "|";
                damageList.add(damageString);
                nameString = String.valueOf(we.getName());
                while (nameString.length() <= namelengthMax){
                    nameString += " ";
                }
                nameString += "|";

                nameList.add(nameString);

                cTypeString = String.valueOf(we.getcType());
                while (cTypeString.length() <= cTypelengthMax){
                    cTypeString += " ";
                }
                cTypeString += "|";
                cTypeList.add(cTypeString);

                dTypeString = String.valueOf(we.getdType());
                while (dTypeString.length() <= dTypelengthMax){
                    dTypeString += " ";
                }
                dTypeString += "|";
                dTypeList.add(dTypeString);

                strengthString = String.valueOf(we.getStrength());
                while (strengthString.length() <= strengthlengthMax){
                    strengthString += " ";
                }
                strengthString += "|";
                strengthList.add(strengthString);

                speedString = String.valueOf(we.getSpeed());
                while (speedString.length() <= speedlengthMax){
                    speedString += " ";
                }
                speedString += "|";
                speedList.add(speedString);

                valueString = String.valueOf(we.getValue());
                while (valueString.length() <= valuelengthMax){
                    valueString += " ";
                }
                valueString += "|";
                valueList.add(valueString);
            }
            for (int i = 0; i < valueList.size(); i++) {
                System.out.println(nameList.get(i)+dTypeList.get(i)+cTypeList.get(i)+damageList.get(i)+speedList.get(i)+strengthList.get(i)+valueList.get(i));
            }




        };

        printable.print(weaponList);

        /*Printable printable = w -> {
            w.sort(comparatorName);

            for (Weapon we : w) {
                System.out.println(we.toString());
            }
            System.out.println("____________________________________");

            /*weaponList.sort(comparatorCombatT);

            for (Weapon we : weaponList) {
                System.out.println(we.toString());
            }
            System.out.println("____________________________________");

            weaponList.sort(comparatorDamageT);

            for (Weapon we : weaponList) {
                System.out.println(we.toString());
            }
            System.out.println("____________________________________");

            weaponList.sort(comparatorDamage);

            for (Weapon we : weaponList) {
                System.out.println(we.toString());
            }
            System.out.println("____________________________________");
        };*/

    }


}
