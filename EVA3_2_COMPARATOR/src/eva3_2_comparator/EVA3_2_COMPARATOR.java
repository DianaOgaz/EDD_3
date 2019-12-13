/*
* uso de margesort para comparar dos valored de la lista y ordenarlos, ya sea
* enteros o strings, modificando unicamente el comparador.
 */
package eva3_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class EVA3_2_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Integer> iLista = new LinkedList<Integer>();
       
        for (int i = 0; i < 15; i++) {
            int x = (int)(Math.random()* 100);
            iLista.add(x);
       
        }
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int iResu;
                
             Integer val1, val2;
             val1 = (Integer)o1;
             val2 = (Integer)o2;
             iResu = val1 - val2;
             return iResu;
            }
        }; // interface, no implementa metodos 
         iLista.sort(c);
         System.out.println(iLista);
         
         
          LinkedList<String> iListaS = new LinkedList<String>();
          iListaS.add("Hola");
          iListaS.add(" ");
          iListaS.add("Mundo");
          iListaS.add(""
                  + " ");
          iListaS.add("Cruel");
          iListaS.add("!!");
          
          Comparator s = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String cade1 = (String) o1;
                String cade2 = (String) o2;
                
                char c1 = cade1.charAt(0);
                char c2 = cade2.charAt(0);
                return c1 - c2;
                }
          };
          System.out.println(iListaS);
          iListaS.sort(s);
          System.out.println(iListaS);
    }
   
   
}
