package Almacen;

import java.util.*;
/*
 * @author Beatriz
 */
public class TestAlmacen
{
    static public void main(String[] argv){
    Scanner sc=new Scanner(System.in);
    int opcion;
    int prueba;
    
    mostrarMenu();
    opcion=sc.nextInt();
    while(opcion !=0){
        procesarOpcion(opcion, prueba);
        mostrarMenu();
        opcion=sc.nextInt();
    }
    sc.close();
}

    /*
     * muestra el menu 
     */
static void mostrarMenu(){
    System.out.println("---MENÚ DE CONTROL DEL ALMACÉN---");
    System.out.println("1.-Mostrar contenido del almacén");
    System.out.println("2.-Poner un valor");
    System.out.println("3.-Buscar un valor");
    System.out.println("4.-Borrar un valor");
    System.out.println("5.-Contar posiciones ocupadas");
    System.out.println("6.-Contar posiciones libres");
    System.out.println("0.-Terminar");
    System.out.println("Introduzca una opcion: [1-6]");
}

/*
 * procesa la opcion que se ha elegido en mostrarMenu()
 */
static void procesarOpcion(int opcion, Almacen1 parAlmacen, int prueba){
    switch(opcion){
       case 1:
            System.out.println("tabla: "+parAlmacen.toString());
            break;
        case 2:
           System.out.println("Puede almacenarlo?: "+ parAlmacen.ponValor(prueba));
            break;
        case 3:
            System.out.println("Esta el valor?: "+ parAlmacen.estaValor(prueba));
            break;
        case 4:
            System.out.println("Puedes sacar el valor?: "+ parAlmacen.sacarValor(prueba));
            break;
        case 5:
             System.out.println("Posiciones ocupadas= "+ parAlmacen.numPosicionesOcupadas());
            break;
        case 6:
           System.out.println("Posiciones libres= "+ parAlmacen.numPosicionesLibres());
            break;
    }
}
}