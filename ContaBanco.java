package arq05;
//Autor: Sidney Bispo
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String cliente;
    private float saldo;
    private boolean status;
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo()> 0){
            System.out.println("Conta não pode ser fechada! Ainda tem saldo positivo!");
        } else if(this.getSaldo() < 0 ){
            System.out.println("Conta não pode ser fechada! O saldo está negativo!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }    
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v; Atributos
            this.setSaldo(this.getSaldo() + v); // Métodos Especiais
            System.out.println("Depósito realizado com sucesso na conta do Cliente!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta do Cliente!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pelo Cliente!");
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    //Métodos Especiais
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}   
