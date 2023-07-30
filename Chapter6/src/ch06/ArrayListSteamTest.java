package Chapter6.src.ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListSteamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edwards");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(x -> System.out.println(x));

        System.out.println();

        sList.stream().sorted().forEach(x-> System.out.print(x+"\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(x -> System.out.print(x+"\t"));
        System.out.println();
        sList.stream().filter(s->s.length()>=5).forEach(x-> System.out.println(x));
    }
}
