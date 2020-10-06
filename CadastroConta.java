package banco;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CadastroConta { 
    
    int nunmConta;
    String tipoconta;
    String donoconta;
    float saldo;
    boolean status;

        List<String> listadecontas = new ArrayList<String>();
	listadecontas.add("CC");
	listadecontas.add("CP");
      
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
        this.setTipoconta(JOptionPane.showInputDialog("Digite o Tipo de Conta\n CC - Conta Corrente \n CP - Conta Poupança"));
        for(getTipoconta():listadecontas){
        
    }
        if (getTipoconta().length() > 2 || getTipoconta().length() < 2) {
       JOptionPane.showMessageDialog(null,"O Tipo de Conta Digitado %s\n É Invalido!"+this.getTipoconta(),"Tipo de Cohnta",JOptionPane.WARNING_MESSAGE);
        return;
        } else {
            this.setTipoconta(JOptionPane.showInputDialog("Digite o Tipo de Conta\n CC - Conta Corrente \n CP - Conta Poupança"));           
        }

        
if(var.notEquals("Salvar")){
        
    
        
        
        
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
