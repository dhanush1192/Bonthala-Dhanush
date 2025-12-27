class Problem3 {

    public static void main(String[] args) {

        int a = 6;   // input value

        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        int num = 1;
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(num);
            if (i + 2 <= limit) {
                System.out.print(", ");
            }
            num += 2;
        }
    }
}
