package by.academy.homework7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        Map<Double, String> list = Stream.generate(() -> new Random().nextLong(0, 100)).
                limit(100).map(x -> (x * Math.PI - 20)).filter(x -> x < 100).sorted().
                skip(3).distinct().collect(Collectors.toMap(s -> s, s -> "Number: " + s));

        for (Map.Entry<Double, String> map : list.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
