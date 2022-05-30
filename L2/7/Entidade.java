public class Entidade extends Basico {
    public Entidade(int energia, int x, int y, int id, String h[]) {
        super(id, h);
        this.setEnergia(energia);
        this.posicao.setX(x);
        this.posicao.setY(y);
    }
}
