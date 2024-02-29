/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;
import java.util.Arrays;
/**
 *
 * @author Usuario
 */
public class Vector {
    public static void main(String[] args) {
        // Crear un vector de strings
        String[] datosString = {"5", "2", "8", "1", "4"};

        // Convertir datos string a int
        int[] datosInt = convertirAEnteros(datosString);

        // Ordenar el vector de menor a mayor
        Arrays.sort(datosInt);

        // Imprimir el vector ordenado
        System.out.println("Vector ordenado de menor a mayor: " + Arrays.toString(datosInt));
    }

    // Método para convertir un vector de strings a un vector de enteros
    private static int[] convertirAEnteros(String[] datosString) {
        int[] datosInt = new int[datosString.length];

        for (int i = 0; i < datosString.length; i++) {
            // Utilizar Integer.parseInt para convertir el string a int
            datosInt[i] = Integer.parseInt(datosString[i]);
        }

        return datosInt;
    }
}
    

