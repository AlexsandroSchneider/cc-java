class Media {
    public double comuns;
    public double imaginarios;

    Media media(Numero[] s) {
        Media op = new Media();
        int comum = 0, imag = 0, contaComum = 0, contaImag = 0;
        for (Numero numero : s) {
            if (numero instanceof NumeroComum) {
                NumeroComum xx = (NumeroComum)numero;
                comum = comum + xx.getValor();
                contaComum++;
            } else if (numero instanceof NumeroImaginario) {
                NumeroImaginario xxx = (NumeroImaginario)numero;
                imag = imag + xxx.getValorCompleto();
                contaImag++;
            }
        }
        System.out.println(comum + " " + contaComum);
        op.comuns = comum/contaComum;
        System.out.println(imag + " " + contaImag);
        op.imaginarios = imag/contaImag;
        return op;
    }
}