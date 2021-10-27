package UE2;

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
        Comparator<Weapon> comparatorDamage = (w1, w2) -> {
            return w1.getDamage() - w2.getDamage();
        };
        weapons.sort(comparatorDamage);
        return weapons.get(0);
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        Comparator<Weapon> comparatorDamage = (w1, w2) -> {
            return w2.getMinStrength() - w1.getMinStrength();
        };
        weapons.sort(comparatorDamage);
        return weapons.get(0);
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
       // weapons = (List<Weapon>)weapons.stream().reduce(0,(x, y) -> x.getDamageType().equals(DamageType.MISSILE));
        return weapons;
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return new Weapon();
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return null;
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return null;
    }

    public int sumUpValues(List<Weapon> weapons) {
        return 0;
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return 0;
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons;
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        //implement this
    }
}
