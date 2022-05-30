public class Maisculiza {
    public static Sinal[] maiusculizaPrimeiraLetra(Sinal[] s){
        for (Sinal sinal : s) {
            if (sinal instanceof Letra) {
                sinal.simbolo = sinal.simbolo.substring(0, 1).toUpperCase() + sinal.simbolo.substring(1);
            }
        }
        return s;
    }
}