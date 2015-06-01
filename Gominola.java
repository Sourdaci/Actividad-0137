
/**
 * Write a description of class Gominola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gominola
{
    // instance variables - replace the example below with your own
    private String color;
    private String sabor;

    /**
     * Constructor for objects of class Gominola
     */
    public Gominola(String color, String sabor)
    {
        this.color = color;
        this.sabor = sabor;
    }

    public void mostrar(){
        System.out.println("Gominola de " + sabor + ", color " + color);
    }
}
