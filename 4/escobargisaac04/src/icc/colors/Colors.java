
package icc.colors;

/**
 * Clase que se encarga de guardar <strong>las cadenas de formato</strong> para la terminal.
 *
 * @author Mindahrelfen
 */
public class Colors {

    /**
     * Modifica el color de la fuente a negro.
     */
    public static final String BLACK = "\033[0;30m";

    /**
     * Modifica el color de la fuente a rojo.
     */
    public static final String RED = "\033[0;31m";

    /**
     * Modifica el color de la fuente a verde.
     */
    public static final String GREEN = "\033[0;32m";

    /**
     * Modifica el color de la fuente a amarillo.
     */
    public static final String YELLOW = "\033[0;33m";

    /**
     * Modifica el color de la fuente a azul.
     */
    public static final String BLUE = "\033[0;34m";

    /**
     * Modifica el color de la fuente a magenta.
     */
    public static final String MAGENTA = "\033[0;35m";

    /**
     * Modifica el color de la fuente a cyan.
     */
    public static final String CYAN = "\033[0;36m";

    /**
     * Modifica el color de la fuente a blanco.
     */
    public static final String WHITE = "\033[0;37m";

    /**
     * Elimina todos los formatos de la fuente, incluyendo el color.
     */
    public static final String RESTORE = "\033[0m";

    /**
     * Muestra a la fuente con un colo mas intenso.
     */
    public static final String HIGH_INTENSITY = "\033[1m";

    /**
     * Muestra a la fuente con un colo menos intenso.
     */
    public static final String LOW_INTENSITY = "\033[2m";

    /**
     * Agrega el formato italics a la fuente.
     */
    public static final String ITALICS = "\033[3m";

    /**
     * Subraya a la fuente.
     */
    public static final String UNDERLINE = "\033[4m";

    /**
     * Hace parpadear a la fuente.
     */
    public static final String BLINK = "\033[5m";

    /**
     * Hace parpadear muy rapido a la fuente.
     */
    public static final String FAST_BLINK = "\033[6m";

    /**
     * Intercambia el color de la fuente con el del fondo.
     */
    public static final String REVERSE = "\033[7m";

    /**
     * Vuelve invisible a la fuente.
     */
    public static final String INVISIBLE_TEXT = "\033[8m";

    /**
     * Modifica el color de fondo a negro.
     */
    public static final String BGD_BLACK = "\033[0;40m";

    /**
     * Modifica el color de fondo a rojo.
     */
    public static final String BGD_RED = "\033[0;41m";

    /**
     * Modifica el color de fondo a verde.
     */
    public static final String BGD_GREEN = "\033[0;42m";

    /**
     * Modifica el color de fondo a amarillo.
     */
    public static final String BGD_YELLOW = "\033[0;43m";

    /**
     * Modifica el color de fondo a azul.
     */
    public static final String BGD_BLUE = "\033[0;44m";

    /**
     * Modifica el color de fondo a magenta.
     */
    public static final String BGD_MAGENTA = "\033[0;45m";

    /**
     * Modifica el color de fondo a cyan.
     */
    public static final String BGD_CYAN = "\033[0;46m";

    /**
     * Modifica el color de fondo a blanco.
     */
    public static final String BGD_WHITE = "\033[0;47m";

    /**
     * Imprime la cadena <code>s</code> con el formato dado. Imprime con retorno de carro.
     *
     * @param s Cadena a imprimir.
     * @param format Formato a aplicar a dicha cadena.
     */
    public static final void println(Object s, String format) {
        System.out.println(format + s + RESTORE);
    }

    /**
     * Imprime la cadena <code>s</code> con el formato dado. Imprime sin retorno de carro.
     *
     * @param s Cadena a imprimir.
     * @param format Formato a aplicar a dicha cadena.
     */
    public static final void print(Object s, String format) {
        System.out.print(format + s + RESTORE);
    }
}
