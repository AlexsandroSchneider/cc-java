class Contador {
    public static Contagem contador(Object[] v) {
        Contagem conta = new Contagem();
        for (Object object : v) {
            if (object instanceof Morcego) conta.morcegos++;
            else if (object instanceof Mamifero) conta.mamiferos++;
            else if (object instanceof Animal) conta.animais++;
            else conta.desconhecidos++;
        } return conta;
    }
}