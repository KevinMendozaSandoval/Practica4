
import java.util.ArrayList;
public class Jugador
{
    private int puntos;
    private Carta c1;
    private Carta c2;
    private Carta c3;
    private Carta c4;
    private Carta c5;
    private ArrayList<Carta> mano;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador()
    {
        c1 = new Carta();
        c2 = new Carta();
        c3 = new Carta();
        c4 = new Carta();
        c5 = new Carta();
        mano = new ArrayList();
        mano.add(c1);
        mano.add(c2);
        mano.add(c3);
        mano.add(c4);
        mano.add(c5);
    }
    public int valorCarta(){
        return c1.getX();
    }
    public int getPuntosJugador(){
    return puntos;
    }
    public void removerCarta(int index){
    mano.remove(index);
    }
     public void obtenerCarta(int index){
    mano.get(index);
    }
    public ArrayList<Carta> getMano(){
        return mano;
    }
    
    public void mostrarCartasConFor(){
     for(int i=0;i<mano.size();i++){ //Imprime el las cartas del arreglo
        System.out.println("- ------------------------");
        System.out.println(mano.get(i));
        
    }
}
}