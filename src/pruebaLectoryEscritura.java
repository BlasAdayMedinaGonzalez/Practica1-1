import java.io.File;

public class pruebaLectoryEscritura {
    public static void main(String[] args) {
        LectoryEscritura le = new LectoryEscritura();
        le.setUrl("C:\\Users\\adaym\\OneDrive\\Escritorio\\programacionMovil\\pruebaInicial\\Listado de nombres aleatorios.csv");

        String comprobar;

        comprobar = le.leer();
        if (!comprobar.equals("")) {
            System.out.println("No se ha podido leer los datos del archivo csv " +  le.getUrl() + " Error: " + comprobar);
        }



    }
}
