import java.util.HashMap;
/**
 * Write a description of class Chuche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SacaSinFondo implements Conjunto, Cloneable, Comparable
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Object> cosas;
    private int indice;

    /**
     * Constructor for objects of class Chuche
     */
    public SacaSinFondo()
    {
        cosas = new HashMap<Integer, Object>();
        indice = 1;
    }

    public void mostrar(){
        System.out.println("Esta saca tiene " + cosas.size() + " elementos");
    }
    
    public int getNumElementos(){
        return cosas.size();
    }
    
    public void anadirElemento(Object o){
        cosas.put(indice, o);
        indice++;
    }
    
    public int compareTo(Object o){
        Conjunto conj = (Conjunto) o;
        return cosas.size() - conj.getNumElementos();
    }
}
