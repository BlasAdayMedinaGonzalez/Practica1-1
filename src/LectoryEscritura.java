
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

    // #region g y s

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
    // #endregion



}
