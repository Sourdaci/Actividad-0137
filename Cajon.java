import java.util.Arrays;
/**
 * Write a description of class Chuche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cajon implements Conjunto, Cloneable, Comparable
{
    // instance variables - replace the example below with your own
    private Object[] arrayDeObject;

    /**
     * Creamos el array vacio
     */
    public Cajon()
    {
        arrayDeObject = new Object[0];
    }

    /**
     * Agregamos un entero al final del array
     */
    public void anadirElemento(Object o){
        int longitudBase = arrayDeObject.length; // Guardo tamaño
        // Creo una copia de si mismo con un espacio mas
        arrayDeObject = Arrays.copyOf(arrayDeObject, (longitudBase + 1));
        // Agrego el valor en la ultima posicion, que es el tamaño antes de la copia
        arrayDeObject[longitudBase] = o;
    }
    
    /**
     * Devuelve cuantos enteros hay en la coleccion
     */
    public int getNumElementos(){
        return arrayDeObject.length;
    }
    
    public void mostrar(){
        System.out.println("Este cajon tiene " + getNumElementos() + " elementos");
    }
    
    public int compareTo(Object o){
        Conjunto conj = (Conjunto) o;
        return getNumElementos() - conj.getNumElementos();
    }
}
