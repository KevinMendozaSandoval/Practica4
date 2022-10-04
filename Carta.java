

/**
 * Elaborar un programa que genere 5 cartas
 *
 * @author (Kevin)
 * @version (2)
 */

import java.util.Random;
public class Carta
{
    // instance variables - replace the example below with your own
    private int x;
    int aux;
    private String palo;
    private String fig;
    private String color;

    public Carta(){
        numeroRand();
        figRand();
    }
    
    public void setPalo(String palo){
        this.palo=palo;
    }
    public void setFig(String fig){
        this.fig=fig;
    }
    public void setColor(String color){
        this.color=color;
    }
    
    public int getX(){
        return x; 
    }
    public String getPalo(){
        return palo; 
    }
    public String getFig(){
        return fig; 
    }
    public String getColor(){
        return color; 
    }
    
    /**
     * Constructor for objects of class Carta
     */
    public void numeroRand()
    {
        // valor de carta
        
        x = (int)(Math.random()*13+1);
        v1();
        
    }
    
    public String figRand()
    {
        
        /*
         * 1- Corazones
         * 2- Picas
         * 3- Diamante
         * 4- Trebol
         */
        aux = (int)(Math.random()*4+1);
        switch(aux){
            case 1:
                fig="Corazones";
                break;
                case 2:
                    fig="Picas";
                    break;
                    case 3:
                    fig="Diamante";
                    break;
                    case 4:
                        fig="Trebol";
                        break;
                    
                
                
        }// Fin del switch
        if(aux==1 || aux==3){
           color="Roja";
       }
       if(aux==2 || aux==4){
           color="Negra";
       }
       return fig;
    }
    
   public String v1(){ //Muestra el valor
       if(x==1){
           palo="A";
       
       }
       if(x>=2 && x<=10){
           palo=""+x;
       }
       if(x==11){
           palo="J";
       }
       if(x==12){
           palo="Q";
       }
       if(x==13){
           palo="K";
       }
       return palo;
   }
   
   public String toString(){
       return "Carta{"+palo+" "+fig+" }";   
       }
       
   }
    
    


