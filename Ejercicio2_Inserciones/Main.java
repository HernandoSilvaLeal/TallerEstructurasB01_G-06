import java.util.Scanner;

public class Main {

  public static void insertionSort(int[] array) {

    int a;
    int conta1;
    int conta2;
    for (conta1 = 1; conta1 < array.length; conta1++) {
      a = array[conta1];
      for (conta2 = conta1 - 1; conta2 >= 0 && array[conta2] > a; conta2--) {
        array[conta2 + 1] = array[conta2];
        array[conta2] = a;
      }
    }
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de números a ordenar: ");
    int n = teclado.nextInt();

    int[] array = new int[n];

    System.out.println("Ingrese los números a ordenar: ");
    for (int i = 0; i < n; i++) {
      array[i] = teclado.nextInt();
    }

    insertionSort(array);
    System.out.println("Los números ordenados son: ");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
  }
}