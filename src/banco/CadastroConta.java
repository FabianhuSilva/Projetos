package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CadastroConta { 
    
    int nunmConta;
    String tipoconta;
    String donoconta;
    float saldo;
    boolean status;
  
    
    /*
        List<String> listadecontas = new ArrayList<String>();
	listadecontas.add("CC");
	listadecontas.add("CP");
   */
    
    
//Construtor
    /*
    Usar para funcionalidades iniciais
    */
    public CadastroConta() {
       
    }
    
    

    public int getNunmConta() {
        return nunmConta;
    }

    public void setNunmConta(int nunmConta) {
        this.nunmConta = nunmConta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getDonoconta() {
        return donoconta;
    }

    public void setDonoconta(String donoconta) {
        this.donoconta = donoconta;
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
    
    
    //metodos 
    public void abriConta(){
        /*
        Particularidades:
        Saldo Inicial - CC = 50 Reais / CP = 150 Reais
        Status = true
        */
        
        //Aqui o Cliente digita o tipo de conta
        
        String opcao,retorno;
        
        
    
        JOptionPane.showMessageDialog(null,"Digite o Tipo de Conta\n CC - Conta Corrente \n CP - Conta Poupança"); 
        opcao=JOptionPane.showInputDialog("Digite o Tipo de Conta\n CC - Conta Corrente \n CP - Conta Poupança");         
        do {
        JOptionPane.showMessageDialog(null,"Digite o Tipo de Conta\n CC - Conta Corrente \n CP - Conta Poupança"); 
        opcao=JOptionPane.showInputDialog("Digite o Tipo de Conta\n CC - Conta Corrente \n CP - Conta Poupança");         
        
        //teste de retorno
        System.out.println(opcao);
        
        switch (opcao){
            
        //Para Case1 - Conta Corrente
        case "CC":
         setTipoconta(opcao);
         JOptionPane.showMessageDialog(null,"Seu Tipo de Conta Digitado é Corrente \n Conta "+this.getTipoconta(),"Tipo de Conta",JOptionPane.WARNING_MESSAGE);
            System.out.println(getTipoconta());
            retorno="ok";
            break;

            //Para Case2 - Conta Poupança    
        case "CP":
         JOptionPane.showMessageDialog(null,"Seu Tipo de Conta Digitado é Poupança \n Conta "+this.getTipoconta(),"Tipo de Conta",JOptionPane.WARNING_MESSAGE);
            System.out.println(getTipoconta());
            retorno="ok";
            break;
            
        default:
        JOptionPane.showMessageDialog(null,"Opção inavalida!"); 
        retorno="error";
            break;
            
    }
        }while(retorno != "ok");       
        //Gerador de Numero de Conta
        Random gerarnumconta = new Random();
        this.setNunmConta(gerarnumconta.nextInt(99999));
        JOptionPane.showMessageDialog(null,"O Numero da sua Conta é: "+this.getNunmConta(),"Numero da Conta",JOptionPane.WARNING_MESSAGE);
        
        //Solicita o nome do cliente
        this.setDonoconta(JOptionPane.showInputDialog("Digite seu nome:"));
        System.out.println(" Nome digitado " + this.getDonoconta());
        System.out.println("numero conta gerado " +this.getNunmConta());
        
        
    }

    public void fecharConta(){
        /*
        Particularidades:
        Saldo = 0
        */
        
    }
        
    public void depositar(){
        /*
        Particularidade:
        Para a conta indicada, a mesma deve estar com o STATUS = TRUE
        */
    }
    
    public void sacar(){
        /*
        Particularidades:
        o Valor a ser Sacado, não deve ultrapassar o saldo do cliente, e quando
        fizer isto retornar mensagem de saldo insuficiente
        */
    }
    
    public void pagarMensalidade(){
        /*
        Particularidades:
        CC = 12 Reais / CP=20 Reais
        */
    }
}
