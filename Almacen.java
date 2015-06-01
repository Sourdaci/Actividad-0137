import java.util.ArrayList;
/**
 * Write a description of class Chuche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Almacen implements Conjunto, Cloneable, Comparable
{
    // instance variables - replace the example below with your own
    private ArrayList<Object> cosas;

    /**
     * Constructor for objects of class Chuche
     */
    public Almacen()
    {
        cosas = new ArrayList<Object>();
    }

    public void mostrar(){
        System.out.println("Este almacen tiene " + cosas.size() + " elementos");
    }
    
    public int getNumElementos(){
        return cosas.size();
    }
    
    public void anadirElemento(Object o){
        cosas.add(o);
    }
    
    public int compareTo(Object o){
        Conjunto conj = (Conjunto) o;
        return cosas.size() - conj.getNumElementos();
    }
}
