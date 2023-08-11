package com.study.javabasic.lamda;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class DoFilter {
    static List<Apple> inventory = Arrays.asList(
            new Apple(80,Color.GREEN),
            new Apple(155, Color.GREEN),
            new Apple(120, Color.RED));
    public static void main(String[] args) {
        for(Apple apple: FilterApple(inventory, new FilterGreenApple())){
            System.out.println(apple);
        }
//        for (Apple apple : FilterApple(inventory,
//                apple -> apple.getWeight() > 150)) {
//            System.out.println(apple.getWeight());
//        }
    }

    public static List<Apple> FilterApple(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

