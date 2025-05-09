import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ReOrdenar {
    public static int ordenarDesc(final int num) {
        String numero = String.valueOf(num);
        List<Character> digitos = new ArrayList<>();

        for (char c : numero.toCharArray()) {
            digitos.add(c);
        }

        Collections.sort(digitos, Collections.reverseOrder());

        StringBuilder resultado = new StringBuilder();
        for (char c : digitos) {
            resultado.append(c);
        }

        return Integer.parseInt(resultado.toString());
    }
}
