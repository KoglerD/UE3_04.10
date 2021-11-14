package UE5;

import javax.swing.tree.RowMapper;
import java.util.Arrays;
import java.util.List;

public class MainUE5 {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Tim", "Andi", "Michael");
        final Mapper<String, Integer> intMapper = String::length;
        System.out.println(intMapper.mapAll(names));
        final Mapper<String, String> stringMapper = str -> ">> "+str.toUpperCase()+"<< ";

        final List<String> uppercaseNames = stringMapper.mapAll(names);
        System.out.println(uppercaseNames);
    }
}
