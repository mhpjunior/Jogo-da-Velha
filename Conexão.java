package controle.seccionadoras.x;


import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Prata
 */
class Conexao implements Runnable{
    private int status;

    public Conexao(){
        this.status = 0;
    }//Construtor
    
    public void run(){
        
        try{
            
            status =status++;
           
            //Thread.sleep(2000);
            
            /**
            System.out.print("Entrou Aqui");
            ServerSocket porta = new ServerSocket(12345);
            Socket cliente = porta.accept();
            status = 1;
            String IP = cliente.getInetAddress().getHostAddress();
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner entrada = new Scanner(cliente.getInputStream());
            
            String teste="nemfoi";
            
            teste = entrada.nextLine();
            
            if(teste == "oi"){
                status = 2;
            }
            else{
                status = 3;
            }
           **/ 
        }//TRY
        catch(Exception e){}//CATCH
        
    
    }//RUN
    
    public int pegaStatus(){
       return status;
    }
    
}//Classe
