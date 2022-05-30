public class Entidade {
    public Entidade(int x, int y, int vida) {
        this.posicao.setX(x);
        this.posicao.setY(y);
        this.setVida(vida);
    }
    public Entidade(){
        this(0, 0, 0);
    }
}
