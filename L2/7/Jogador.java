public class Jogador extends Entidade {
    public Jogador (int vida, int energia, int x, int y, int id, String h[]) {
        super(energia, x, y, id, h);
        this.setVida(vida);
    }
}
