public static int getNumberOfMaxParam(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int result = 0;

        if (max == a && max >= b && max >= c) {
        result = 1;
        } else if (max == b && max > a && max >= c) {
        result = 2;
        } else if (max == c && max > a && max > b) {
        result = 3;
        }
        return result;
}