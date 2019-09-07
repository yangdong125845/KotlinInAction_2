package com.yangd.kotlininaction_2.VIII.I;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

import java.util.ArrayList;
import java.util.List;

public class javaCallKotlinFunctionArgs {


    public static void main(String[] args) {
        ProcessTheAnswer.processTheAnswer(number -> number + 1);

        ProcessTheAnswer.processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer) {
                System.out.println(integer);
                return integer + 1;
            }
        });

        List<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
    }
}
