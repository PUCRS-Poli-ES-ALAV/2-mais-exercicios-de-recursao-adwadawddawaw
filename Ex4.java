public class Ex4 {
    public static int somatorio(int j, int k) {
        if (j > k) {
            return 0;
        }
        return j + somatorio(j + 1, k);
    }
}
