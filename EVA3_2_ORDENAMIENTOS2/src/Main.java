/*
 * Metodos de ordenamientos para listas
 */

/**
 *
 * @author Diana Teresa Ogaz Escarpita #18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int[120];
       Llenar(datos);
       imprimir(datos);
    }
    public static void Llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100 );
        }
}
    public static void imprimir (int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.print("");
    }
    public static void selecSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int Min = i;
            for (int j = i+1; j < arreglo.length; j++) {
                
            }
            
        }
    }
    public static int busquedaBin(int[] arreglo, int iVal){
        return busquedaBinRec(arreglo, iVal, 0, (arreglo.length));
    }
    private static int busquedaBinRec(int[] arreglo, int iVal, int ini, int fin){
        int mid = ini +(fin - ini)/ 2;
        if(iVal == arreglo[mid]){
            return mid;
        }else if (iVal > arreglo[mid]){
            return busquedaBinRec(arreglo, iVal, mid + 1, fin);
        }else if (iVal < arreglo[mid]){
            return busquedaBinRec(arreglo, iVal,ini, mid - 1);
        }else 
            return -1;
    }
}

