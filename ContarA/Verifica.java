package vaga2;

public class Verifica {
    public static int contarA(String s) {
        s = s.toLowerCase();
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}

