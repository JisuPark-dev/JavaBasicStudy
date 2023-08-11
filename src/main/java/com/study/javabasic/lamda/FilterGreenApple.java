package com.study.javabasic.lamda;

public class FilterGreenApple implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor()==Color.GREEN;
    }
}
