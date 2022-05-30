class Data {
    int dia;
    int mes;
    int ano;

    public Data(int x, int y ,int z){
        this.dia = x;
        this.mes = y;
        this.ano = z;
    }
    public Data(){
        this.dia = 25;
        this.mes = 9;
        this.ano = 1990;
    }

    void imprime(){
        System.out.println("Dia: " + this.dia);
        System.out.println("Mês: " + this.mes);
        System.out.println("Ano: " + this.ano);
    }
}


