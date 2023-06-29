package com.example.demo.threading;

import com.example.demo.AnInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.function.*;
import java.util.stream.*;


public class Question_9_5 {



        public static void main(String[] args) {
            DoubleStream s = DoubleStream.of(1.2, 2.4);
            s.peek(System.out::println).filter(x -> x > 2).count();

        }


}
