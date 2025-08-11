public class Ex5 {

    public boolean palindromo(String s) {
        if(s.length() == 1 || s.length() == 0) return true;

        if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        String novaString = s.substring(1, s.length() - 1);
        return palindromo(novaString);
    }
}
