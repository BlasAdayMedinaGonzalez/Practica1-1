import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class LectoryEscritura {

    private String Url;
    private String urlEscritura;
    private String fichero;

    ArrayList<String> Nombre = new ArrayList<String>();
    static int contadorFila = 0;
    static double notaTotal = 0;
    static int LIMITE_NOTA = 4;
    static int LIMITE_PERSONAS = 10;
    static Double[] nota = new Double[LIMITE_NOTA];
    static double[] notaTotalArray = new double[LIMITE_PERSONAS];
    static int[] contadorRandomNombre = new int[LIMITE_PERSONAS];
    static Double[] Media = new Double[LIMITE_PERSONAS];


    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUrlEscritura() {
        return urlEscritura;
    }

    public void setUrlEscritura(String urlEscritura) {
        this.urlEscritura = urlEscritura;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public String leer() {
        File file = null;
        BufferedReader bfR = null;
        file = new File(getUrl());
        String linea = "";
        if (!file.exists()) {
            return "El fichero de entrada no existe";
        }

        try {
            bfR = new BufferedReader(new FileReader(file));
            if ((linea = bfR.readLine()) == null) {
                return "El fichero esta vacío";
            }
            // Se salta primera línea que no es nombre
            if ((linea = bfR.readLine()) == null) {
            }
            // Se cuenta cada fila y se añade cada nombre en un array
            while ((linea = bfR.readLine()) != null) {
                contadorFila++;
                Nombre.add(linea);
            }

            for (int i = 0; i < LIMITE_PERSONAS; i++) {

                contadorRandomNombre[i] = (int) Math.floor(Math.random() * (0 - (contadorFila + 1)) + (contadorFila));
                notaTotal = 0;
                // bucle que guarda cada numero aleatorio y los asuma al total
                for (int j = 0; j < nota.length; j++) {
                    nota[j] = Math.round((Math.random() * 11) * 100.0) / 100.0;
                    notaTotal += nota[j];
                }
                // Se guarda cada nota total en un array
                notaTotalArray[i] = notaTotal;
                // Se hace la media de cada nota
                Media[i] = Math.round((notaTotalArray[i] / 4) * 100.0) / 100.0;

                System.out.println(Nombre.get(contadorRandomNombre[i]) + " nota 1: " + nota[0] + " nota 2: " + nota[1]
                        + " nota 3: " + nota[2] + " nota 4: " + nota[3] + " Media: "
                        + Media[i]);

            }
            return "";
        } catch (IOException e) {
            return e.toString();
        } finally {
            try {
                if (bfR != null)
                    bfR.close();
            } catch (Exception e) {
                return "Error cerrando objetos:\n" + e;
            }
        }
    }

    public String pasaraFichero() {

        return "";
    }

}
