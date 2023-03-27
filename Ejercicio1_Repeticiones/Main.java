import java.util.Scanner;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // código aquí

    Scanner teclado = new Scanner(System.in);
    int n;
    int posicion;

    Scanner userData = new Scanner(System.in);
    System.out.println("Ingrese las cantidad de números del arreglo a procesar: ");
    n = userData.nextInt();

    // instancia1 almacenamiento de datos
    int[] dataArray = new int[n];
    System.out.println("Ingrese los valores de su arreglo");

    // recorre el array para llenarlo
    for (int i = 0; i < n; i++) {
      System.out.print((i + 1) + ". Digite un numero: ");
      dataArray[i] = teclado.nextInt();
    }
    // salida del arreglo lleno
    System.out.println("\n Los numeros ingresados, fueron almacenados en las siguientes posiciones del array ");

    for (posicion = 0; posicion < dataArray.length; posicion++) {
      System.out.print("\n La posicion " + posicion + " tiene el valor de : " + dataArray[posicion]);
    }

    // creacion del mapa
    HashMap<Integer, Integer> mapa = new HashMap<>();

    // Ciclo For9
    for (int x = 0; x < dataArray.length; x++) {
      int numero = dataArray[x];

      // verificar si la clave existe en el HashMap
      if (mapa.containsKey(numero)) {
        // accedemos al elemento en el HashMap
        mapa.put(numero, mapa.get(numero) + 1);
      } else {
        // agregamos elementos al HashMap
        mapa.put(numero, 1);
      }
    }
    // Obtener las repeticiones de los numeros contenidos en el array
    int moda = 0, mayor = 0;

    for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
      // Obtiene con getvalue la clave y el valor del objeto actual del mapa
      if (entry.getValue() > mayor) {
        mayor = entry.getValue();
        moda = entry.getKey();
      }
    }
    System.out.println("");
    System.out.println("");
    System.out.printf("El numero mas repetido es el %d, con %d repeticiones", moda, mayor);

  }
}
