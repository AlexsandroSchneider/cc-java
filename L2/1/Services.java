public class Services {
    public static int contaPossiveisCandidatos(Inimigo i[]) {
        int conta = 0;
        for (Inimigo obj : i) {
            int objX  = obj.getPosicao().getX();
            int objY = obj.getPosicao().getY();
            int objEnergy = obj.getEnergia();
            double objVelocity = obj.getVelocidade().tamanho();
            if ((objX > 100 || objY > 100) && objEnergy <= 50 && objVelocity == 200) {
                conta++;
            }
        }
        return conta;
    }
    
}