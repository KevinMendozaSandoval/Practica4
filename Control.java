
/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Control
{
    // instance variables - replace the example below with your own
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private ArrayList<Carta> P1;
    private ArrayList<Carta> P2;
    private ArrayList<Carta> P3;
    private int limite;
    private int limite2;
    private int limite3;
    private int puntosJugador;
    private int puntosJugador2;
    private int puntosJugador3;
    
    private int contIguales;
    /**
     * Constructor for objects of class Control
     */ 
    public Control()
    {
        jugador1= new Jugador();
        jugador2= new Jugador();
        jugador3= new Jugador();
        P1=jugador1.getMano();
        P2=jugador2.getMano();
        P3=jugador3.getMano();    
        puntosJugador=0;
        puntosJugador2=0;
        puntosJugador3=0;
        contIguales=0;
    }
    public void CartasJugador1(){
       
       System.out.println("---Jugador 1:---");
       for(int i=0;i<P1.size();i++){
           System.out.println(P1.get(i));
       }
   }
   public void CartasJugador2(){
       
       System.out.println("---Jugador 2:---");
       for(int i=0;i<P2.size();i++){
           System.out.println(P2.get(i));
       }
   }
   public void CartasJugador3(){
       
       System.out.println("---Jugador 3:---");
       for(int i=0;i<P3.size();i++){
           System.out.println(P3.get(i));
       }
   }
   public void tirarCarta(int posicion){
       P1.remove(posicion);
   }
   public void tirarCarta2(int limite){
       P2.remove(limite);
   }
   public void tirarCarta3(int limite){
       P3.remove(limite);
   }
   
   public void iniciar(){
       
       int p=0;
       Scanner enter=new Scanner(System.in);
       Scanner enter2=new Scanner(System.in);
       Scanner enter3=new Scanner(System.in);
       for(int i=0;i<5;i++){
           p=0;
           while(p!=1){
       System.out.println("Ronda "+ (i+1));
       CartasJugador1();
       System.out.println("¿Que carta desea tirar? ");
       limite=enter.nextInt();
       limite=limite-1;
       
       
       CartasJugador2();
       System.out.println("¿Que carta desea tirar? ");
       limite2=enter2.nextInt();
       limite2=limite2-1;
      
       
       CartasJugador3();
       System.out.println("¿Que carta desea tirar? ");
       limite3=enter.nextInt();
       limite3=limite3-1;
       
       
       if(P1.get(limite).getX()==P2.get(limite2).getX() && P1.get(limite).getX()>P3.get(limite3).getX()){ //comparar si las dos cartas son iguales
           System.out.println("Oh! noooooo!");
           System.out.println("Son cartas iguales, vuelve a tirar");
           contIguales++;
           if(contIguales==2){
               System.out.println("Se lanzaron dos veces la misma carta");
               System.out.println("Reciben un punto cada uno");
               puntosJugador=puntosJugador++;
               puntosJugador2=puntosJugador2++;
               p=1;
           }
           
           
        
           
       } 
       else if(P1.get(limite).getX()==P3.get(limite3).getX() &&P1.get(limite).getX()>P2.get(limite2).getX() ){
           System.out.println("Oh! noooooo!");
           System.out.println("Son cartas iguales, vuelve a tirar");
           contIguales++;
           if(contIguales==2){
               System.out.println("Se lanzaron dos veces la misma carta");
               System.out.println("Reciben un punto cada uno");
               puntosJugador=puntosJugador++;
               puntosJugador3=puntosJugador3++;
               p=1;
           }
       }
       else if(P2.get(limite2).getX()==P3.get(limite3).getX() && P2.get(limite2).getX()>P1.get(limite).getX()){
           System.out.println("Oh! noooooo!");
           System.out.println("Son cartas iguales, vuelve a tirar");
           contIguales++;
           if(contIguales==2){
               System.out.println("Se lanzaron dos veces la misma carta");
               System.out.println("Reciben un punto cada uno");
               puntosJugador2=puntosJugador2+1;
               puntosJugador3=puntosJugador3+1;
               p=1;
           }
       }
       
       
       else{
          p=1;  //sale del ciclo si no son iguales
       }
       
    }//while
    if(P1.get(limite).getX()>P2.get(limite2).getX() && P1.get(limite).getX()>P3.get(limite3).getX()){
           puntosJugador=puntosJugador+2;
           System.out.println("Puntos para el jugador 1");
       }
       else if(P2.get(limite).getX()>P3.get(limite3).getX() && P2.get(limite).getX()>P1.get(limite).getX() ){
           puntosJugador2=puntosJugador2+2;
           System.out.println("Puntos para el jugador 2");
       }
       else {
           puntosJugador3=puntosJugador3+2;
           System.out.println("Puntos para el jugador 3");
       }
    
    tirarCarta(limite); //tira la carta que el usuario mando ya comparado  
    tirarCarta2(limite2);  // tira la carta del segundo usuario
    tirarCarta3(limite3);   //tira la carta del tercer usuario
       
    }//endFor2
       System.out.println("--------------------------");
       System.out.println("Puntuaciones:");
       System.out.println("Jugador 1: "+puntosJugador+" pts");
       System.out.println("Jugador 2: "+puntosJugador2+" pts");
       System.out.println("Jugador 3: "+puntosJugador3+" pts");
       System.out.println("--------------------------");
   }
   }
   
   


