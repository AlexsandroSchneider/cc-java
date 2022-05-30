public class InimigoVolatil extends Inimigo {
    @Override
    public int getVida() {
        return (this.getPosicao().getX() + this.getPosicao().getY());
    }
    @Override
    public void setVida(int v) {
        this.setVelocidade().setA(v);
        this.setVelocidade().setB(v);
    }
    @Override
    public int getEnergia() {
        return (super.getVida() + super.getEnergia());
    }
}
