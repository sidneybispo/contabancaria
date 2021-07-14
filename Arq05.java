package arq05;
public class Arq05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(01010101);
        p1.setCliente("Zé binário");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(01001101);
        p2.setCliente("Maria Binário");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
