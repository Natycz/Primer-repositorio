import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Obtener la ruta del directorio indicada por el usuario
        String rutaDirectorio = "C:\\Users\\natyz\\Downloads\\programas";

        // Llamar al método para listar los directorios
        encontrarDirectorios(rutaDirectorio);
    }

    public static void encontrarDirectorios(String ruta) {
        // Crear un objeto File con la ruta proporcionada
        File directorioActual = new File(ruta);

        // Verificar si el directorio existe y es un directorio
        if (directorioActual.exists() && directorioActual.isDirectory()) {
            // Obtener todos los archivos y directorios dentro del directorio actual
            File[] archivos = directorioActual.listFiles();

            // Iterar sobre los archivos y directorios
            for (File archivo : archivos) {
                // Verificar si es un directorio
                if (archivo.isDirectory()) {
                    // Imprimir el nombre del directorio
                    System.out.println(archivo.getName());
                    // Llamar recursivamente al método para explorar el directorio encontrado
                    encontrarDirectorios(archivo.getAbsolutePath());
                }
            }
        } else {
            // Mostrar un mensaje de error si la ruta no es válida
            System.out.println("La ruta proporcionada no es un directorio válido.");
        }
    }
}
