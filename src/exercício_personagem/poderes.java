/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício_personagem;

/**
 *
 * @author aluno
 */
public class poderes extends escolher_classe{
    String a;
    
    private String magia;
    private String forca;
    
    private String cajado ;
    private String poções;
    private String espada;
    private String escudo;
    
    public void poderMagico(){
        System.out.println("seu poder aumentou em 50% de 100%");
        this.magia += 50;
        System.out.println("voce ganhou um cajado e uma poção\n");
        this.cajado +=10;
        this.poções += 9;
        
        
    }
    
    public void poderForça(){
        System.out.println("sua força aumentou em 100%\n");
        this.forca += 100;
        this.espada += 7;
        this.escudo += 10;
    }
    
    public void Mochilamago(){
        System.out.println("cajado\n"
                + "poção\n");
        
    }
    
    public void MochilaGuerreiro(){
        System.out.println("espada\n"
                + "escudo");
 
    }


        
            
            
    }
    

   
    

   
     
    


    
