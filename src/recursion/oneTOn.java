class oneTOn {
    static void printNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumbers(i + 1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(1, n);
    }
}