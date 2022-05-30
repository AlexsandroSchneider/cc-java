public class CampoDeGuerra {
    public void processa(Entidade e[], int dx, int dy) {
        for (Entidade x : e) {
            x.atualiza();
            if (x instanceof Construcao) {
                x.produzir();
            }
            if (x instanceof Arqueiro || x instanceof Cavaleiro || x instanceof Bombeiro || x instanceof Trabalhador) {
                x.moveX(dx);
                x.moveY(dy);
            }
            if  (x instanceof Unidade && x.estahMorta()) {
                x.posiciona(0,0);
            }
        }
    }
}
