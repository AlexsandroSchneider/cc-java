public class FazAlgo {
    public void fazAlgo() {
        BatedorRapido br = new BatedorRapido();
        Ferreiro f = new Ferreiro();
        Prefeito p = new Prefeito();
        Inimigo i; Batedor b; Corredor c; Nadador n;
        i = (Inimigo)br; // não use "new" aqui e "i" não pode ser null.
        c = f;
        if(i instanceof Batedor) {
            b = (Batedor)i;
        }
        NPC npc = (NPC)c;
        Nadador g = p;
        n = new Inimigo();
        Armeiro a = (Armeiro)n;
    }
}