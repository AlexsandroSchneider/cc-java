public class Circulo extends Formas implements Rotacionavel{
    private Pontos[] ponto = new Pontos[3];
    @Override
    public void rotaciona() {     
    }
    @Override
    public void setPonto() {
        ponto[0].setX(1);
        ponto[0].setY(2);
        ponto[1].setX(2);
        ponto[2].setX(3);
        ponto[3].setY(3);
    }
    @Override
    public Pontos[] getPonto() {
        
        return null;
    }
}
