class ContaBonificada extends Conta {
    public ContaBonificada(String numero, Cliente cliente){
        super(numero, cliente);
    }

    public int getBonus() {
        return 0;
    }
}