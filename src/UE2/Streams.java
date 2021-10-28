package UE2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public double average(int[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum/numbers.length;
    }

    public static String randomString() {
        //https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public List<String> upperCase(String[] strings){
        Stream stream = Arrays.stream(strings);
        List<String> list = (List<String>) stream.map(o -> o.toString().toUpperCase()).collect(Collectors.toList());
        return list;
    }
    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        /*Comparator<Weapon> comparatorDamage = (w1, w2) -> {
            return w1.getDamage() - w2.getDamage();
        };
        //weapons.sort(comparatorDamage);*/
        if (weapons.isEmpty()){
            return null;
        }
        weapons.sort(Comparator.comparing(Weapon::getDamage));
        return weapons.get(0);
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {

        /*Comparator<Weapon> comparatorDamage = (w1, w2) -> {
            return w2.getMinStrength() - w1.getMinStrength();
        };
        weapons.sort(comparatorDamage);
        return weapons.get(0);*/
        //Weapon weapon = weapons.sort(Comparator.comparing());
        try {
            if (weapons.isEmpty()){
                return null;
            }
                weapons.sort(Comparator.comparing(Weapon::getMinStrength));
                return weapons.get(weapons.size()-1);
        }catch (IndexOutOfBoundsException ioobe){
            System.out.println("Index zu hoch");
            return weapons.get(weapons.size());
        }

    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        //List<Weapon> weList = new ArrayList<>();
        /*for (int i = 0; i < weapons.size(); i++) {
            if (weapons.get(i).getDamageType() == (DamageType.MISSILE)) {
                weapons.remove(i);
                //weList.add(weapons.get(i));
            }
        }*/
        List<Weapon> weList = weapons.stream().filter(weapon -> weapon.getDamageType()==DamageType.MISSILE).collect(Collectors.toList());
        //weapons = (List<Weapon>)weapons.stream().reduce(0,(x, y) -> x.getDamageType()==equals(DamageType.MISSILE));
        return weList;
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        if (weapons.isEmpty()){
            return null;
        }
        weapons.sort(Comparator.comparing(weapon -> weapon.getName().length()));
        return weapons.get(weapons.size()-1);
    }

    public List<String> toNameList(List<Weapon> weapons) {
        List<String> nameList = new ArrayList<>();
        weapons.stream().forEach(weapon -> nameList.add(weapon.getName()));
        return nameList;
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        List<Integer> speedList = new ArrayList<>();
        weapons.stream().forEach(weapon -> speedList.add(weapon.getSpeed()));
        return speedList.stream().mapToInt(i -> i).toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        //weapons.stream().forEach(weapon -> list.add(weapon.getValue()));
        if (weapons.isEmpty()){
            return 0;
        }
        return weapons.stream().mapToInt(weapon -> weapon.getValue()).sum();

    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        //weapons.stream().mapToLong(weapon -> weapon.hashCode()).sum();
        //long l = weapons.stream().mapToLong(weapon -> weapon.hashCode()).reduce(0, Long::sum);
        return weapons.stream().mapToInt(weapon -> weapon.hashCode()).sum();
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        weapons.stream().distinct();
        return weapons;
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.stream().forEach(weapon -> weapon.setValue((int) weapon.getValue()*110/100));
    }
}
