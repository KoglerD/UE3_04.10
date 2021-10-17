package UE2;

import UE2.UE2Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UE2MainTest {

    @Test
    public void testAverageTestNums(){
        int[] a = {1, 2, 5, 6, 9};
        double averageResult = UE2Main.average(a);
        assertEquals(averageResult, 4.6);
    }

    @Test
    public void testAverageTestNumsSame(){
        int[] a = {3, 3, 3, 3};
        double averageResult = UE2Main.average(a);
        assertEquals(averageResult, 3);
    }

    @Test
    public void testUppercaseNormalString(){
        String[] randomStrings = new String[10];
        for (int i = 0; i < randomStrings.length; i++) {
            randomStrings[i] = UE2Main.randomString();
            //System.out.println(array[i]);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < randomStrings.length; i++) {
            list.add(randomStrings[i].toUpperCase());
        }

        assertEquals(UE2Main.upperCase(randomStrings), list);
    }


}