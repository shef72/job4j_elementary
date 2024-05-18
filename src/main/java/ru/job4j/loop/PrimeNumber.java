package ru.job4j.loop;

public class PrimeNumber {
    public static void main(String[] args) {
        calc(25);
        calc(23);
    }

    public static int calc(int finish) {
        int count = 0;
         boolean num = true;
        for (int i = 2; i <= finish; i++) {
            if (finish % i == 0) {
                if (i > 2) {
                    if (i < finish) {
                        num = false;
                        System.out.println(finish + "S");
                    }
                }
            }
        }
        if (num) {
            System.out.println(finish + "P");
        }
       return count;
    }

}







