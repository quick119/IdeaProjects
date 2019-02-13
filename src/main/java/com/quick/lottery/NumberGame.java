package com.quick.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();     //Set：不会重复的集合
    int numberCount = 0;
    public abstract void generate();
    public boolean validate() {
        if (numbers.size() == numberCount)
            return  true;
        else
            return false;
    }
}
