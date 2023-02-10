import java.io.*;

public class Main {
    public static void main(String[] args) {



        try {
            InputStream inputStream = new FileInputStream("ruta");
            arrayIndex(new int[]{12,13,14,31,5,5});
            System.out.println(divisionByZero(5,0));
        }catch (ArithmeticException e){
            System.out.println("Division por cero no posible : " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de alcance : " + e.getMessage());
        }catch (FileNotFoundException e){
            System.out.println("fichero que no existe : " + e.getMessage());
        }

    }

    public static int divisionByZero(int a,int b){
        return a / b;
    }
    public static void arrayIndex(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[9]);
        };
    }

}