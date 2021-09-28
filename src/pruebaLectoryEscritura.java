import java.io.File;

public class pruebaLectoryEscritura {
    public static void main(String[] args) {
        LectoryEscritura le = new LectoryEscritura();
        le.setUrl("C:\\Users\\adaym\\OneDrive\\Escritorio\\programacionMovil\\pruebaInicial\\Listado de nombres aleatorios.csv");

        String comprobar;

        comprobar = le.leer();
        if (!comprobar.equals("")) {
            System.out.println("No se ha podido leer los datos del archivo txt " +  le.getUrl() + " Error: " + comprobar);
        }

        le.setUrlEscritura("C:\\Users\\adaym\\OneDrive\\Escritorio\\programacionMovil\\pruebaInicial" + File.separator + "ficheroCreado.txt");

        comprobar = le.pasaraFichero();
        if (!comprobar.equals("")) {
            System.out.println("No se ha podido escribir los datos en el nuevo fichero " + le.getUrlEscritura() + " Error: " + comprobar);
        }
    }
}
