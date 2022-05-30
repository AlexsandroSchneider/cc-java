public class Personagem extends Entidade {
    public Personagem(int ouro, int vida, int x, int y) {
        super(x, y, vida);
        this.setOuro(ouro);
    }
    public Personagem(int ouro, int vida) {
        this(ouro, vida, 0, 0);
    }
}
