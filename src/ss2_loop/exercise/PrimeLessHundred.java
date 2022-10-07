package ss2_loop.exercise;

public class PrimeLessHundred {
    public static void main(String[] args) {
        int check = 2;
        while (check < 100) {
            int count = 0;
            for (int i = 2; i <= check; i++) {
                if (check % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(check + "\t");
            }
            check++;
        }
    }
}
