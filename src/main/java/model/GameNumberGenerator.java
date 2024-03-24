package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameNumberGenerator {

    public static int generate() {
        List<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            digits.add(i);
        }

        Collections.shuffle(digits, new Random());

        return digits.get(0) * 100 + digits.get(1) * 10 + digits.get(2);
    }
}
