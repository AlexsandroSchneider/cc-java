public class Elemento extends Entidade implements Serializavel, Combativel {
    public int serial;
    public int nivel;

    public int[] serializa() {
        int vetor[] = new int[2];
        vetor[0] = this.serial;
        vetor[1] = this.nivel;
        return vetor;
    }
    public void deserealiza(int[] vetor) {
        this.serial = vetor[0];
        this.nivel = vetor[1];
    }
    public boolean podeCombater(Combativel inimigo) {
        if (inimigo instanceof Arqueiro || inimigo instanceof Cavaleiro) {
            return true;
        }
        return false;
    }
}
