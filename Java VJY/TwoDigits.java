class TwoDigits {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 55, 33, 2, 45 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                System.out.println(arr[i]);
            }
        }

    }
}