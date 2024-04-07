package ru.job4j;

public class ArgumentsMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);

    }

    public static void main(String[] args) {
        String name = "Job4j";
        String age = "6";

        ArgumentsMethod.hello("Job4j", 6);
        ArgumentsMethod.hello("Job4j", 6);
        ArgumentsMethod.hello("Job4j", 6);
        ArgumentsMethod.hello("Job4j", 6);


    }
}

