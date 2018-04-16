public class Ariana {
    public static void main(String[] args) {
        String[] sentence = {"i", "must", "not", "tell", "lies."};
        int counter  = 1;
        for(int outer = 0; outer <5; outer++) {
            System.out.printf("%-2d I must not tell lies.\n", counter++);
            System.out.printf("%-2d i MUST not tell lies.\n", counter++);
            System.out.printf("%-2d i must NOT tell lies.\n", counter++);
            System.out.printf("%-2d i must not TELL lies.\n", counter++);
            System.out.printf("%-2d i must not tell LIES.\n", counter++);
            System.out.printf("%-2d i must not TELL lies.\n", counter++);
            System.out.printf("%-2d i must NOT tell lies.\n", counter++);
            System.out.printf("%-2d i MUST not tell lies.\n", counter++);

        }
    }
}
