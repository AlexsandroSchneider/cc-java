public class Gerenciador {
    void analisa(String s) throws TokenDesconhecido, ComandoMalFormado {
        if (s.length() == 0) {
            throw new TokenDesconhecido();
        }
        if (s.length() == 5) {
            throw new ComandoMalFormado();
        }
    }
}
