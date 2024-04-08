package ru.job4j;

public class ArgumentsMethod {
    public static void hello(int age, String name) {
        System.out.println("Hello, " + name + ", age = " + age);

    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;

        ArgumentsMethod.hello(age, name);
      //  ArgumentsMethod.hello("Job4j", 6);
      //  ArgumentsMethod.hello("Job4j", 6);
      //  ArgumentsMethod.hello("Job4j", 6);


    }
}

