public class Main {
    public static void main(String[] args) {
        Batedor jovem = new Batedor();
        BatedorRapido alguem = new BatedorRapido();
        Batedor ele = new Batedor();
        Inimigo[] lista = {jovem, alguem, ele};
        Invoca vai = new Invoca();
        vai.invocaMetodos(lista, jovem);
    }
}

