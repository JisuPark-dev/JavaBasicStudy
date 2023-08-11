package com.study.javabasic.lamda;

public class FilterHeavyApple implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
