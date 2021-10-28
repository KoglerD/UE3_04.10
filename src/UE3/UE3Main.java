package UE3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UE3Main {
    final static Predicate<Integer> isEven = integer -> integer%2 ==0;
    final static Predicate<Integer> isPositive = value -> value >= 0;
    final static Predicate<String> isShortWord = s -> s.length()<4;
    //final static IntPredicate isPositivee = value -> value >= 0;

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(-6,-3,-0,0,1,2,3,4,5,6,7,8,9,10,11,187,256);

        nums.stream().filter(isPositive.and(isEven)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("..................");

        nums.stream().filter(isPositive.and(isEven.negate())).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("..................");

        String words = "These words are not short";
        Arrays.stream(words.split(" ")).filter(isShortWord).collect(Collectors.toList()).forEach(System.out::println);
        //nums.stream().filter(isEven).collect(Collectors.toList()).forEach(System.out::println);//werkt

        /*try {
            nums.stream().filter(isEven.and((Predicate<? super Integer>)isPositivee)).collect(Collectors.toList()).forEach(System.out::println);

        }catch(ClassCastException classCastException){
            System.out.println("Exception tritt auf!");
        }*/
        //
        //
        //
        // nums.stream().filter(((Predicate<Integer>) isPositive).negate(isEven.test())).collect(Collectors.toList()).forEach(System.out::println);


        /*System.out.println("Is Even: "+isPositive.negate());
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
        System.out.println("\nIsShortWord: "+isShortWord.test("ok its short"));*/
    }
}
