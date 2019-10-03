/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscomparativos;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicioscomparativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String palabra1="hoLa";
        String palabra2="hola";
       boolean comparacion = palabra1.equals(palabra2);
       int comparaciondos = palabra1.compareTo(palabra2);
       
       boolean comparacion3 =palabra1.toLowerCase().equals (palabra2.toLowerCase());
       boolean comparacionreal =palabra1.equalsIgnoreCase(palabra2);
      
        System.out.println(comparacion);
        System.out.println(comparaciondos);  
        System.out.println(comparacion3);
        System.out.println(comparacionreal);*/
        /*int numero1=10;
        int numero2=100;
        
        boolean comparacion= numero1>0 || numero2<100;
        boolean comparacion2= numero1>0 && numero2<100;
        System.out.printf("La comparacion entre numeros es : %b", comparacion);
        
        System.out.printf("La comparacion con & es : %b", comparacion2);*/
        
        int numerouno = 10 
         ;
        int numerodos = 20 
                ;
        String palabrauno="hola"
                ;
        String palabrados="goal"
                ;
        
        boolean comparacionmultiple= numerouno>numerodos
                || palabrauno.equals(palabrados);
        
        boolean comparacionMultipledos= numerouno<numerodos
                || palabrauno.equals(palabrados)
                || numerouno!=numerodos;
        
        int n1=10,n2=20,n3=10;
        String p1="tino",p2="flayin";
        boolean b1=true,b2=false;
        
        boolean salida=(((n1>0)&&(n2<5)&&(n3!=10))||p1.equals(p2)||b2) && b1;
                          //T   y  //F  y   //F        //F        //F
                                  //F                        //F         //T
        System.out.println(salida);                                                     
    }
    
    
}
