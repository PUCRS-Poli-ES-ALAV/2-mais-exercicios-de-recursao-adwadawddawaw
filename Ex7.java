import java.util.List;

public class Ex7 {
    public int somatorio(List<Integer> a) {
        if (a.isEmpty()) {
            return 0;
        }
        return a.get(0) + somatorio(a.subList(1, a.size()));
    }
}