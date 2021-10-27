package UE3;

import org.w3c.dom.ls.LSOutput;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class UE3Main {
    final static Predicate<Integer> isEven = integer -> integer%2 ==0;
    final static IntPredicate isPositive = value -> value >= 0;
    final static Predicate<String> isShortWord = s -> s.split(" ").length < 4;
    public static void main(String[] args) {
        System.out.println("Is Even: "+isEven.test(2));
        System.out.println("Is Even: "+isEven.test(3));
        System.out.println("Is Even: "+isEven.test(44));
        System.out.println("Is Even: "+isEven.test(55));
        System.out.println("Is Even: "+isEven.test(621));
        System.out.println("Is Even: "+isEven.test(13));

        System.out.println("\nIs Positive: "+isPositive.test(-6));
        System.out.println("Is Positive: "+isPositive.test(-0));
        System.out.println("Is Positive: "+isPositive.test(0));
        System.out.println("Is Positive: "+isPositive.test(2));
        System.out.println("Is Positive: "+isPositive.test(33));

        System.out.println("\nIsShortWord: "+isShortWord.test("Wort kürzer als 4 Buchstaben"));
    }
}
