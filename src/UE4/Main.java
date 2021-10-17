package UE4;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.PresentationDirection;
import java.util.stream.IntStream;

public class Main {
    final static int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(w -> w % 2 != 0).map((w) -> w = (int) Math.pow(w, 2)).reduce(0, (left, right) -> left + right);

    public static void main(String[] args) {
        System.out.println(result);
    }
}
