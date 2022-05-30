public class Inimigo extends Boid {
    Inimigo achaAlvoMaisProximo(Inimigo i[]) {
        for (Inimigo inimigo : i) {
            int enemyX  = inimigo.getPosicao().getX();
            int enemyY = inimigo.getPosicao().getY();
            int enemyA = inimigo.getVelocidade().getA();
            int enemyB = inimigo.getVelocidade().getB();
            int myX = this.getPosicao().getX();
            int myY = this.getPosicao().getY();
            int myA = this.getVelocidade().getA();
            int myB = this.getVelocidade().getB();
            if (enemyX == myX && enemyY == myY && enemyA == myA && enemyB == myB){
                return inimigo;
            }
        }
    }
}
