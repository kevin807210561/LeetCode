package Kevin_20170913_20171012;

public class day028_1_UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
