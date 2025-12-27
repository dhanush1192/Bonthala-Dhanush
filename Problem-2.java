class Problem2 {

    public static void main(String[] args) {

        int a = 4;   // input value

        int num = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i < a) {
                System.out.print(", ");
            }
            num += 2;
        }
    }
}
