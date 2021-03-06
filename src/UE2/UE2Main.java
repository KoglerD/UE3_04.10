package UE2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UE2Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(101-0);
            //System.out.println(array[i]);
        }
        String[] randomStrings = new String[10];
        for (int i = 0; i < randomStrings.length; i++) {
            randomStrings[i] = randomString();
            //System.out.println(randomStrings[i]);
        }
        System.out.println(average(new int[]{1,2,3,4,5,6}));
    }

    public static double average(int[] numbers){
        return IntStream.of(numbers).average().getAsDouble();


        /*double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum/numbers.length;

        double[] numbersD = Arrays.stream(numbers).asDoubleStream().toArray();*/
    }

    public static String randomString() {
        //https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index= (int)(AlphaNumericString.length()* Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static List<String> upperCase(String[] strings){
        Stream stream = Arrays.stream(strings);
        List<String> list = (List<String>) stream.map(o -> o.toString().toUpperCase()).collect(Collectors.toList());
        return list;
    }


}
