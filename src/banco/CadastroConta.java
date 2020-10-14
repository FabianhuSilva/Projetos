package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CadastroConta { 
    
    private int nunmConta;
    private String tipoconta;
    private String donoconta;
    private float saldo;
    private boolean status;
  
    
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
    
        do {
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
            this.setSaldo(150.0f);
            System.out.println(getSaldo());
            break;

            //Para Case2 - Conta Poupança    
        case "CP":
         setTipoconta(opcao);
         JOptionPane.showMessageDialog(null,"Seu Tipo de Conta Digitado é Poupança \n Conta "+this.getTipoconta(),"Tipo de Conta",JOptionPane.WARNING_MESSAGE);
            System.out.println(getTipoconta());
            retorno="ok";
            this.setSaldo(50.0f);
            System.out.println(getSaldo());
            break;
            
        default:
        JOptionPane.showMessageDialog(null,"Opção inavalida!"); 
        retorno="error";
            break;
    }
        }while(retorno != "ok"); 
        //Para comparar STRING usar Equals e nao ==
        //Gerador de Numero de Conta
        Random gerarnumconta = new Random();
        this.setNunmConta(gerarnumconta.nextInt(99999));
        JOptionPane.showMessageDialog(null,"O Numero da sua Conta é: "+this.getNunmConta(),"Numero da Conta",JOptionPane.WARNING_MESSAGE);
        
        //Solicita o nome do cliente
        this.setDonoconta(JOptionPane.showInputDialog("Digite seu nome:"));
        System.out.println(" Nome digitado " + this.getDonoconta());
        System.out.println("numero conta gerado " +this.getNunmConta());
        setStatus(true);
        
    }

    public void fecharConta(){
        /*
        Particularidades:
        Saldo = 0
        */
        
    }
        
    public void depositar(){
        String valordigitado,contadg;
        int numeroct, sitmov = 0;
        float soma = 0.0f; 
        /*
        int i = Integer.valueOf(str).intValue();
        int i = Integer.parseInt(str);
        */
        do{
        JOptionPane.showMessageDialog(null,"Ultimo numero Conta Digitado \n => "+this.getNunmConta(),"",JOptionPane.WARNING_MESSAGE);
        contadg=JOptionPane.showInputDialog("Digite o numero da conta \n Ultima Conta: "+this.getNunmConta());               
        numeroct=Integer.valueOf(contadg).intValue();
        // =========================== Laço================================
             if (getNunmConta() == numeroct && getStatus() == true) {
                JOptionPane.showMessageDialog(null,"Deposito Bancario \n Conta "+this.getTipoconta(),"Numero Conta"+this.getNunmConta(),JOptionPane.WARNING_MESSAGE);
                valordigitado=JOptionPane.showInputDialog("Qual o valor deseja Depositar: ");               
                soma=Float.valueOf(valordigitado).floatValue();
                System.out.println(soma);
                this.setSaldo(getSaldo()+soma);
                System.out.println(getSaldo());
                JOptionPane.showMessageDialog(null,"Deposito Bancario Realizado com Sucesso! \n Saldo R$ "+this.getSaldo(),"",JOptionPane.WARNING_MESSAGE);
                sitmov=0;
                break;
                //float f = Float.valueOf(str).floatValue();
         
           } else {
            JOptionPane.showMessageDialog(null,"Conta Digita não Encontrada \n Conta "+numeroct,"Numero Conta Valida Digitada"+this.getNunmConta(),JOptionPane.WARNING_MESSAGE);
            sitmov=1;
                  }   
         // Enquanto for verdade ele continua rodando             
         }while(sitmov == 1);
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
        float saque = 0.0f;
        String valorsac;
            valorsac=JOptionPane.showInputDialog("Qual o valor deseja SACAR: ");               
            saque=Float.valueOf(valorsac).floatValue();
        if (saque < getSaldo()) {
            setSaldo(getSaldo() - saque);
            System.out.println(getSaldo());
            JOptionPane.showMessageDialog(null,"Saldo Atual: "+this.getSaldo(),"",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente \n Saldo disponivel "+this.getSaldo(),"Valor de Saque"+saque,
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void pagarMensalidade(){
        String pagarmes;
        int opcaoconta,desconto;
        /*
        Particularidades:
        CC = 12 Reais / CP=20 Reais
        */
        JOptionPane.showMessageDialog(null,"Mensalidade \n Conta Poupança = R$ 20,00 \n Conta Corrente = R$ 12,00","",
        JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null," Escolha  \n 1 -Conta Poupança \n 2 - Conta Corrente ","",
        JOptionPane.WARNING_MESSAGE);
           
        pagarmes=JOptionPane.showInputDialog("1 -Conta Poupança \n 2 - Conta Corrente\nDigite o seu Tipo de Conta: ");               
        opcaoconta=Integer.valueOf(pagarmes).intValue();
        switch(opcaoconta){
            case 1:
                desconto = 20;
                setSaldo(getSaldo() - desconto);
                System.out.println(getSaldo());
                JOptionPane.showMessageDialog(null,"Foi Pago: R$ "+desconto,"\n Seu saldo é R$ %d " + getSaldo(),
                JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                desconto = 12;
                setSaldo(getSaldo() - desconto);
                System.out.println(getSaldo());
                JOptionPane.showMessageDialog(null,"Foi Pago: R$ "+desconto,"\nSeu saldo é R$ "+getSaldo(),
                JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção Indisponivel","",
                JOptionPane.WARNING_MESSAGE);
                break;
        }
            
    }
}
