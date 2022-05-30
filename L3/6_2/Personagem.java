public class Personagem implements Serializavel {
    private int id, x, y;
    private String nome;

    public Personagem(int id, int x, int y, String nome) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.nome = nome;
    }
    public String serializa() {
        return "id=" + this.id + ";x=" + this.x + ";y=" + this.y + ";nome=" + this.nome;
    }
    public void carrega(Serializavel s) {
        if (s instanceof Personagem) {
            Personagem este = (Personagem)s;
            this.id = este.id;
            this.x = este.x;
            this.y = este.y;
            this.nome = este.nome;
        }
    }
}