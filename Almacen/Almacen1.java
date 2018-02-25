package Almacen;

import java.util.*;

/**
 *
 * @author Beatriz 
 */
public class Almacen1 {
    static private final int LIBRE=0;
    //Array con valores almacenados
    private int tvalores[];
    private int valoresAlmacenados=0;
    
    //constructores sin parámetros creo una tabla de 10 elementos
public Almacen1() {
        this(10); //Llamo al constructor con parametros
    }

    
    //constructores donde se fija tamaño maximo del almacen
public Almacen1(int tamaño) {
        tvalores=new int[tamaño];
        init();
    }

    //pone todas las posiciones a LIBRES
public void init() {
        for(int i=0;i<tvalores.length;i++) {
            tvalores[i]=Almacen1.LIBRE;
        }
        valoresAlmacenados=0;
    }
    /*
     * @return devuelve una cadena con los valores de la tabla
     */
public String toString() {
        return Arrays.toString(tvalores);
    }
    
	/*
	 * @param contlibre cuenta las posiciones libres
	 * @return devuelve las posiciones libres de la tabla
	 */
public int numPosicionesLibres() {
   int contlibre=0;
   for(int i=0;i<tvalores.length;i++){
       if(tvalores[i]==LIBRE){
           contlibre++;
        }
    }
        return contlibre;
    }

    /*@param contocu cuenta cuantas posiciones hay ocupadas
     * @return devuelve un numero de posiciones ocupadas
     */
public int numPosicionesOcupadas() {
    int contocu=0;
    for(int i=0;i<tvalores.length;i++){
        if(tvalores[i]!=LIBRE){
            contocu++;
        }
    }
        return contocu;
    }

/*
 * @param esta
 * @param num
 *@return devuelve si el numero esta en la tabla 
 */

public boolean estaValor(int num) {
    boolean esta=false;
    for(int i=0;i<tvalores.length;i++){
        if(tvalores[i]==num){
           esta=true;
        }else{
          esta=false;
        }
    }
    return esta;
    }

/*
 * almacena el valor de  la tabla,
 * @param esta 
 * @param num
 * @return devuelve falso si no se puede almacenar
 */

public boolean ponValor(int num) {
    boolean esta=true;
    for(int i=0;i<tvalores.length;i++){
        if(tvalores[i]!= LIBRE){
            esta=false;
            break;
        }
    }
    return esta;
    }

/*elimina el elemento de la tabla
 * @param esta 
 * @return devuelve falso si no esta en la tabla
 */
public boolean sacarValor(int num) {
    boolean esta=true;
    for(int i=0;i<tvalores.length;i++){
        if(tvalores[i]!=num){
            esta=false;
        }
    }
    return esta;
    }

/*indica si el almacen esta lleno
 * @param esta
 * @return devuelve true si esta lleno 
 */
    
public boolean estaLleno() {
    boolean esta=false;
    for(int i=0;i<tvalores.length;i++){
        if(tvalores[i]!=LIBRE){
            esta=true;
        }
    }
        return esta;
    }

}
