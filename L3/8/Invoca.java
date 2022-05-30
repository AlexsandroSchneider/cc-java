public class Invoca {
    public void invocaMetodos(Inimigo v[], Inimigo base) {
        for (Inimigo inimigo : v) {
            if (inimigo.getClass() == base.getClass()) {
                inimigo.voa(); inimigo.pousa(); inimigo.corre(); inimigo.pula(); inimigo.nada(); inimigo.mergulha(); inimigo.ataca(); inimigo.defende();
                if (inimigo instanceof BatedorRapido) {
                    BatedorRapido enemy = (BatedorRapido)inimigo;
                    enemy.reporta(); enemy.olhadinha();
                } else if (inimigo instanceof Batedor) {
                    Batedor enemy = (Batedor)inimigo;
                    enemy.reporta();
                } else if (inimigo instanceof Armeiro) {
                    Armeiro enemy = (Armeiro)inimigo;
                    enemy.engatilha();
                }
            }
        }
    }
}
