package ru.job4j.loop;

public class PrimeNumber {
    public static void main(String[] args) {

        calc(67);
    }

    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            boolean num = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    num = false;
                    break;
                }
            }

            if (num) {
                System.out.println(i);
            }
        }
          return count;

    }
}







