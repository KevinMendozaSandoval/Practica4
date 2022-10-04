

/**
 * Write a description of class AplicacionCarta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class AplicacionCarta
{
    private Carta c1;
    private Carta c2;
    private Carta c3;
    private Carta c4;
    private Carta c5;
    private ArrayList<Carta> arrCartas; //Se creo un arreglo para meter las cartas con sus caracteristicas

    public AplicacionCarta(){
        c1 = new Carta();
        c2 = new Carta();
        c3 = new Carta();
        c4 = new Carta();
        c5 = new Carta();
        arrCartas= new ArrayList(); //array de cartas
        arrCartas.add(c1);
        arrCartas.add(c2);
        arrCartas.add(c3);
        arrCartas.add(c4);
        arrCartas.add(c5);
    }
    
    public int valorCarta(){
        return c1.getX();
    }
    public void mostrarCartas(){
    System.out.println("-------------------------");
    System.out.println("Carta 1:");
    System.out.println(c1.getPalo()); 
    System.out.println(c1.getFig());
    System.out.println(c1.getColor());
    System.out.println("-------------------------");
    System.out.println("Carta 2:");
    System.out.println(c2.getPalo()); 
    System.out.println(c2.getFig());
    System.out.println(c2.getColor());
    System.out.println("-------------------------");
    System.out.println("Carta 3:");
    System.out.println(c3.getPalo());
    System.out.println(c3.getFig());
    System.out.println(c3.getColor());
    System.out.println("-------------------------");
    System.out.println("Carta 4:");
    System.out.println(c4.getPalo()); 
    System.out.println(c4.getFig());
    System.out.println(c4.getColor());
    System.out.println("-------------------------");
    System.out.println("Carta 5:");
    System.out.println(c5.getPalo()); 
    System.out.println(c5.getFig());
    System.out.println(c5.getColor());
    System.out.println("-------------------------");
    
    
    
}
public void contadorCartas(){
    int contRoja=0,contNegra=0,contJoker=0;
    if(c1.getColor().equalsIgnoreCase(c2.getFig()) && c1.getFig().equalsIgnoreCase(c3.getColor()) && c1.getFig().equalsIgnoreCase(c4.getColor()) ){ //Compara las dos variables e ignora si son mayusculas y minusculas
      System.out.println("Si son iguales");  
    }
    else{
       System.out.println("Son diferentes");   
    }

    for(int i=0;i<arrCartas.size();i++){
        if(arrCartas.get(i).getColor().equalsIgnoreCase("Roja")){
            contRoja++;
        }else{
            contNegra++;
        }
        if(arrCartas.get(i).getPalo().equalsIgnoreCase("JOKER")){
            contJoker++;
        }
        
    }
    System.out.println("La cantidad de cartas Rojas es: "+contRoja); 
    System.out.println("La cantidad de cartas Negras es: "+contNegra); 
    System.out.println("La cantidad de cartas JOKERS es: "+contJoker); 
}
}
