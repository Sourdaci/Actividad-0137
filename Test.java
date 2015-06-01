import java.util.Random;
public class Test{
    public Test(){
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(6);
        Conjunto[] colecciones = new Conjunto[2];
        Gominola chuche = new Gominola("Rojo y Blanco", "Fresa-Nata");
        System.out.println("Prueba de implementacion de Interface");
        System.out.println("Almacen: ArrayList\nCajon: Array\nSaca: HashMap");
        System.out.println("Escogiendo aleatoriamente 2 colecciones...");
        switch (num){
            case 0:
            colecciones[0] = new Almacen();
            colecciones[1] = new Cajon();
            break;
            case 1:
            colecciones[0] = new Almacen();
            colecciones[1] = new SacaSinFondo();
            break;
            case 2:
            colecciones[0] = new Cajon();
            colecciones[1] = new SacaSinFondo();
            break;
            case 3:
            colecciones[0] = new Cajon();
            colecciones[1] = new Cajon();
            break;
            case 4:
            colecciones[0] = new Almacen();
            colecciones[1] = new Almacen();
            break;
            case 5:
            colecciones[0] = new SacaSinFondo();
            colecciones[1] = new SacaSinFondo();
            break;
        }
        System.out.println("Agregando objetos a coleccion 1...");
        num = aleatorio.nextInt(11);
        for(int i=0; i < num; i++){
            colecciones[0].anadirElemento(chuche);
        }
        System.out.println("Agregando objetos a coleccion 2...");
        num = aleatorio.nextInt(11);
        for(int i=0; i < num; i++){
            colecciones[1].anadirElemento(chuche);
        }
        System.out.println("Prueba de metodo mostrar()");
        colecciones[0].mostrar();
        colecciones[1].mostrar();
        System.out.println("Prueba de metodo getNumElementos()");
        System.out.println("Coleccion 1: " + colecciones[0].getNumElementos());
        System.out.println("Coleccion 2: " + colecciones[1].getNumElementos());
        System.out.println("Prueba de metodo compareTo()");
        int unoConDos = 0;
        int dosConUno = 0;
        if(colecciones[0] instanceof Almacen){
            Almacen alm = (Almacen) colecciones[0];
            if(colecciones[1] instanceof Almacen){
                Almacen alm2 = (Almacen) colecciones[1];
                unoConDos = alm.compareTo(alm2);
                dosConUno = alm2.compareTo(alm);
            }else if(colecciones[1] instanceof Cajon){
                Cajon caj = (Cajon) colecciones[1];
                unoConDos = alm.compareTo(caj);
                dosConUno = caj.compareTo(alm);
            }else{
                SacaSinFondo saca = (SacaSinFondo) colecciones[1];
                unoConDos = alm.compareTo(saca);
                dosConUno = saca.compareTo(alm);
            }
        }else if(colecciones[0] instanceof Cajon){
            Cajon caj = (Cajon) colecciones[0];
            if(colecciones[1] instanceof Almacen){
                Almacen alm = (Almacen) colecciones[1];
                unoConDos = caj.compareTo(alm);
                dosConUno = alm.compareTo(caj);
            }else if(colecciones[1] instanceof Cajon){
                Cajon caj2 = (Cajon) colecciones[1];
                unoConDos = caj.compareTo(caj2);
                dosConUno = caj2.compareTo(caj);
            }else{
                SacaSinFondo saca = (SacaSinFondo) colecciones[1];
                unoConDos = caj.compareTo(saca);
                dosConUno = saca.compareTo(caj);
            }
        }else{
            SacaSinFondo saca = (SacaSinFondo) colecciones[0];
            if(colecciones[1] instanceof Almacen){
                Almacen alm = (Almacen) colecciones[1];
                unoConDos = saca.compareTo(alm);
                dosConUno = alm.compareTo(saca);
            }else if(colecciones[1] instanceof Cajon){
                Cajon caj = (Cajon) colecciones[1];
                unoConDos = saca.compareTo(caj);
                dosConUno = caj.compareTo(saca);
            }else{
                SacaSinFondo saca2 = (SacaSinFondo) colecciones[1];
                unoConDos = saca.compareTo(saca2);
                dosConUno = saca2.compareTo(saca);
            }
        }
        System.out.println("La diferencia entre 1 y 2 es de: " + unoConDos);
        System.out.println("La diferencia entre 2 y 1 es de: " + dosConUno);
        System.out.println("Si puedes leer esto, el programa ha acabado");
    }
}
