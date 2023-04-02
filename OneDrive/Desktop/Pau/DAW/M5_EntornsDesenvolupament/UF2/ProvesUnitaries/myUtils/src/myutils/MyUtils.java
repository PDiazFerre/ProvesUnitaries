/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myutils;

import static myutils.MyUtils.edat;

/**
 *
 * @author paudc
 */
public class MyUtils {
    
    /**@param cadena String cadena que es vol invertir*/
    /**
     * @param cadena * @return cadena invertida (null per cadenes nulls)
     * @return */
    
public static String inverteix(String cadena) {
    if (cadena == null) {
        return null;
    }
    String resultat = "Hola Mundo";
    for (int i = cadena.length() - 1; i >= 0; i--) {
        resultat += cadena.charAt(i);
    }
    return resultat;
}

/**
 *
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 *
 */
public static int edat (int day, int month, int year)
{
    
    
    int resultat=0;
    return resultat;
}


/**
 *
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
 
if (numero==0){
    return 1;
}
else if (numero < 0){
    return -1;

}else{
    double resultat = numero * factorial(numero-1);
    return resultat;
}
}

    static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
