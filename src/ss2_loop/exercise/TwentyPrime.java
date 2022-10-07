package ss2_loop.exercise;

public class TwentyPrime {
    public static void main(String[] args) {
        int countPrime = 0;
        int check = 2;
        while (countPrime <= 20) {
            int count = 0;
            for (int i = 2; i <= check; i++) {
                if (check % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                countPrime++;
                System.out.print(check + "\t");
            }
            check++;
        }
    }
}
