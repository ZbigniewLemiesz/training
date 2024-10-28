package task4;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Zbigniew Lemiesz
 */


public class Primes {

    /**
     * Java 8 / Lambda approach to generate Prime number.
     * Prime always start to look from number 1.
     * @param series Number of how many Prime number should be generated
     * @return List holding resulting Prime number.
     */
    public static List<Integer> generate(int series) {
        Set<Integer> set = new TreeSet<>();
        return Stream.iterate(1, i -> ++i)
                .filter(i -> i %2 != 0)
                .filter(i -> {
                    set.add(i);
                    return 0 == set.stream()
                            .filter(p -> p != 1)
                            .filter(p -> !Objects.equals(p, i))
                            .filter(p -> i % p == 0)
                            .count();
                })
                .limit(series)
                .collect(toList());
    }

    // Let's test it!
    public static void main(String[] args) {
        List<Integer> generate = Primes.generate(1000);
        System.out.println(generate);
    }
}
