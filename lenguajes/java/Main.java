import java.io.*;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        long resultado = fibonacciSum(5000);
        long end = System.nanoTime();

        double tiempoMs = (end - start) / 1_000_000.0;

        // Asegurar que la carpeta existe antes de escribir el archivo
        File directory = new File("/benchmark/lenguajes/java/");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Guardar resultado en un archivo
        try (FileWriter writer = new FileWriter("/benchmark/lenguajes/java/resultado.txt")) {
            writer.write(String.valueOf(resultado));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir solo el tiempo en milisegundos
        System.out.printf("%.2f%n", tiempoMs);
    }

    public static long fibonacciSum(int n) {
        long a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a;
            long temp = a;
            a = b;
            b = temp + b;
        }
        return sum;
    }
}

 
