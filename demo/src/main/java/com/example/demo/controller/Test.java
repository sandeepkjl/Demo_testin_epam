package com.example.demo.controller;

class Test {

        public void print(Integer i) {

                System.out.println("Integer");

        }







        public void print(long i) {

                System.out.println("long");

        }



        public static void main(String args[]) {

                Test test = new Test();

                test.print(new Integer(10));

        }

}

