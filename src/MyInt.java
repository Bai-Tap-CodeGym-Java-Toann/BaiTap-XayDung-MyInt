public class MyInt {
    int value = 0;

    public MyInt() {
    }

    public MyInt(int i) {
        value = i;
    }

    public boolean isPrime() {
        if (this.value < 2) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isOdd() {
        if (value % 2 == 0) {
            return false;
        }
        return true;
    }

    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(int i) {
        if (value == i) {
            return true;
        }
        return false;
    }

    public boolean equals(MyInt i) {
        if (value == i.value) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }

    public static int[] parseInt(String[] arr) {
        int[] outRay = new int[arr.length];
        int i = 0;
        for (String x : arr) {
            outRay[i] = Integer.parseInt(x);
            i++;
        }
        return outRay;
    }

}
