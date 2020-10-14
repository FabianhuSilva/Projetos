package banco;

public class Banco extends CadastroConta {

    public static void main(String[] args) {
       Banco teste = new Banco();
       teste.abriConta();
       teste.depositar();
       teste.sacar();
       teste.pagarMensalidade();
               
               }
    
}
