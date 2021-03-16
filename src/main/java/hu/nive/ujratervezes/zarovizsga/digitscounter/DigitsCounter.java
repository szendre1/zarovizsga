package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s){
        if (s==null){
            return 0;
        }
        Set<Character> chars = new HashSet<Character>();
        for (char ch: s.toCharArray()) {
            Boolean flag = Character.isDigit(ch);
            if(flag) {
                chars.add(ch); // number
            }
        }
        return chars.size();
    }
}
