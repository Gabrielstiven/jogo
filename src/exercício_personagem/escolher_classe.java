
package exercício_personagem;

import java.util.Scanner;


 // @author gabriel
 
public class escolher_classe {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    String aa;
    
    mago m1= new mago();
    poderes p1 = new poderes();
    
    
    System.out.println("digite qual personagem deseja ser: \nmago ou guerreiro  ");
    aa = a.nextLine();
    
    
    if (aa.equals("mago")){
        Scanner a1 = new Scanner(System.in);
    p1.poderMagico();
    System.out.println("caso queira ver sua mochila digite 'mochila' ");    
    aa = a1.nextLine();
    p1.Mochilamago();
    
    
    }else if(aa.equals("guerreiro")){
    System.out.println("caso queira ver sua mochila digite 'mochila' ");    
    p1.poderForça();
            
    p1.MochilaGuerreiro();
        
     
    }else if(aa.equals("mochila")){
       
              
    }
        
    }
}
    

    
    
    
    


