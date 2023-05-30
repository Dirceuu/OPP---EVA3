import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EVA_3_9_LEER_ARCHIVOS {
    final static String RUTA = "C:\\Users\\Alan\\Documents\\Archivos\\Prueba.txt";

    public static void main(String[] args) {
        try {
            readUsingFiles(RUTA);
            readingUsingBufferedReader(RUTA);
            readingUsingFileReader(RUTA);
            readUsingScanner(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readUsingFiles(String ruta) throws IOException {
        Path path = Paths.get(RUTA);
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }

    public static void readingUsingBufferedReader(String ruta) throws IOException {
        System.out.println("Leer un archivo con buffered render: ");

        File file = new File(ruta);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufReader = new BufferedReader(inputStreamReader);
        String linea;
        while ((linea = bufReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufReader.close();
    }

    public static void readingUsingFileReader(String ruta) throws IOException {
        System.out.println("\n" + "Leer archivo usando file reader: ");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufReader.close();
        fileReader.close();
    }

    public static void readUsingScanner(String ruta) throws IOException {
        System.out.println("\n" + "Leer un archivo usando scanner: ");
        Path path = Paths.get(ruta);
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            System.out.println(linea);
        }
        sc.close();
    }
}
