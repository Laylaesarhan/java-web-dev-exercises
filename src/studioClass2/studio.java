package studioClass2;

import java.util.HashMap;
import java.util.Map;

public class studio {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> totals = new HashMap<>();
        for (Character item : charactersInString) {
            if (totals.containsKey(item)) {
                totals.put(item, totals.get(item) + 1);
            } else {
                totals.put(item, 1);
            }
        }
        for (Map.Entry<Character, Integer> charInTotals : totals.entrySet()) {
            System.out.println(charInTotals.getKey() + ":" + charInTotals.getValue());

        }
    }
}