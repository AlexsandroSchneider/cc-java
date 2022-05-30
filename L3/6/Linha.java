public class Linha implements Comparavel, Clonavel {
    public int id, tempo, prioridade;

    public boolean igual(Comparavel c) {
        if (c instanceof Linha) {
            Linha cc = (Linha)c;
            if (this.id == cc.id) {
                return true;
            }
        }
        return false;
    }
    public Clonavel clona(){
        Linha copia = new Linha();
        copia.id = this.id;
        copia.prioridade = this.prioridade;
        copia.tempo = this.tempo;
        return copia;
    }
}
