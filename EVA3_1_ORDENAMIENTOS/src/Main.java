/*
 *
 */

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int[120];
       Llenar(datos);
       imprimir(datos);
       
       long ini, fin;
       
       ini = System.nanoTime();
       selecSort(datos);
       fin = System.nanoTime();
       imprimir(datos);
        System.out.println("Tiempo: " + (fin - ini));
       
       Llenar(datos);
       imprimir(datos);
       ini = System.nanoTime();
       selecSort(datos);
       fin = System.nanoTime();
       imprimir(datos);
        System.out.println("Tiempo: " + (fin - ini));
        
       
       Llenar(datos);
       imprimir(datos);
       ini = System.nanoTime();
       bubbleSort(datos);
       fin = System.nanoTime();
       imprimir(datos);
        System.out.println("Tiempo: " + (fin - ini));
       
       
       
       
    }
    public static void Llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100 );
        }
}
    public static void imprimir (int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    public static void selecSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int iMin = i;
            for (int j = (i +1); j < arreglo.length; j++) {
                if (arreglo[iMin] > arreglo[j] ){
                    iMin = j;
                }
            }
           int temp;
           temp = arreglo[iMin] = arreglo[i];
           arreglo[i] = temp;
        }
    }
    public static void insertSort (int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            int iPoint;
            for (iPoint = i; iPoint > 0; iPoint--) {
                int iPrev = (iPoint - 1);
                if (arreglo[iPrev] > temp){
                    //Swap
                    arreglo[iPoint] = arreglo[iPrev];
                }else
                    break;
            }
            arreglo[iPoint] = temp;
        }
    }
    public static void bubbleSort(int[] arreglo){
            for (int i = 0; i < arreglo.length; i++) { //Metodo cuadratico
                for (int j = 0; j < arreglo.length - 1; j++) {
                    if (arreglo[j] > arreglo[j + 1] ){
                        int iTemp = arreglo[i];
                        arreglo[j]= arreglo[j + 1];
                        arreglo[j + 1] = iTemp;
                    }
                }
            }
    }
}

