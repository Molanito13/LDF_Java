package Estilos;

/**
 * Clase Colorinchis
 *
 * @author Fernando Martín Gay
 *
 * @version 1.8 24/05/2022
 */
public class Colorinchis {

    
    /**
     * Colorea la cadena de color rojo
     *
     * @param frase Cadena a colorear
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String red (String frase) {
        return "\u001B[31m"+frase+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color rojo, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String red (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[31m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[31m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[31m"+frase+"\u001B[0m";
        } else {
            return "\u001B[31m"+frase+"\u001B[0m";
        }
    }

    /**
     * Colorea el caracter de color rojo
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String red (char caracter) {
        return "\u001B[31m"+caracter+"\u001B[0m";
    }

    /**
     * Colorea el numero de color rojo
     *
     * @param frase numero a colorear
     * 
     * @return El numero coloreado
     *
     * @author Fernando Martín Gay
     */
    public static String red (int numero) {
        return "\u001B[31m"+numero+"\u001B[0m";
    }

    /**
     * Colorea el double de color rojo
     *
     * @param frase numero a colorear
     * 
     * @return El double coloreado
     *
     * @author Fernando Martín Gay
     */
    public static String red (double numero) {
        return "\u001B[31m"+numero+"\u001B[0m";
    }

     /**
     * Colorea la cadena de color negro
     *
     * @param frase Cadena a colorear
     * 
     * @return La cadena coloreada
      *
      * @author Fernando Martín Gay
     */
    public static String black (String frase) {
        return "\u001B[30m"+frase+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color negro, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String black (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[30m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[30m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[30m"+frase+"\u001B[0m";
        } else {
            return "\u001B[30m"+frase+"\u001B[0m";
        }
    }
    
    /**
     * Colorea el caracter de color rojo
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String black (char caracter) {
        return "\u001B[30m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color negro
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String black (int numero) {
        return "\u001B[30m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el caracter de color negro
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String black (double numero) {
        return "\u001B[30m"+numero+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color verde
     *
     * @param frase Cadena a colorear
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String green (String frase) {
        return "\u001B[32m"+frase+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color verde, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String green (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[32m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[32m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[32m"+frase+"\u001B[0m";
        } else {
            return "\u001B[32m"+frase+"\u001B[0m";
        }
    }
    /**
     * Colorea el caracter de color verde
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String green (char caracter) {
        return "\u001B[32m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color verde
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String green (int numero) {
        return "\u001B[32m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el double de color verde
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String green (double numero) {
        return "\u001B[32m"+numero+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color amarillo
     *
     * @param frase Cadena a colorear
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String yellow (String frase) {
        return "\u001B[33m"+frase+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color amarillo, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String yellow (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[33m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[33m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[33m"+frase+"\u001B[0m";
        } else {
            return "\u001B[33m"+frase+"\u001B[0m";
        }
    }
    
    /**
     * Colorea el caracter de color amarillo
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String yellow (char caracter) {
        return "\u001B[33m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color verde
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String yellow (int numero) {
        return "\u001B[33m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el double de color amarillo
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String yellow (double numero) {
        return "\u001B[33m"+numero+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color azul
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String blue (String frase) {
        return "\u001B[34m"+frase+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color azul, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String blue (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[34m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[34m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[34m"+frase+"\u001B[0m";
        } else {
            return "\u001B[34m"+frase+"\u001B[0m";
        }
    }
    
    /**
     * Colorea el caracter de color azul
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String blue (char caracter) {
        return "\u001B[34m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color azul
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String blue (int numero) {
        return "\u001B[34m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el double de color azul
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String blue (double numero) {
        return "\u001B[34m"+numero+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color morado
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String purple (String frase) {
        return "\u001B[35m"+frase+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color morado, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String purple (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[35m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[35m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[35m"+frase+"\u001B[0m";
        } else {
            return "\u001B[35m"+frase+"\u001B[0m";
        }
    }
    
    /**
     * Colorea el caracter de color morado
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String purple (char caracter) {
        return "\u001B[35m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color morado
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String purple (int numero) {
        return "\u001B[35m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el double de color morado
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String purple (double numero) {
        return "\u001B[35m"+numero+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color cyan
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String cyan (String frase) {
        return "\u001B[36m"+frase+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color cyan, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String cyan (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[36m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[36m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[36m"+frase+"\u001B[0m";
        } else {
            return "\u001B[36m"+frase+"\u001B[0m";
        }
    }
    
    /**
     * Colorea el caracter de color cyan
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String cyan (char caracter) {
        return "\u001B[36m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color cyan
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String cyan (int numero) {
        return "\u001B[36m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el double de color cyan
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String cyan (double numero) {
        return "\u001B[36m"+numero+"\u001B[0m";
    }

    /**
     * Colorea la cadena de color blanco
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String white (String frase) {
        return "\u001B[37m"+frase+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color blanco, negrita e itálica
     *
     * @param frase Cadena a colorear
     * @param bold indicador de negrita
     * @param italic indicador de cursiva
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String white (String frase, boolean bold, boolean italic) {
        if (bold && italic) {
            return "\u001B[1m\033[3m\u001B[37m"+frase+"\u001B[0m";
        } else if (!bold && italic) {
            return "\033[3m\u001B[37m"+frase+"\u001B[0m";
        } else if (bold && !italic) {
            return "\u001B[1m\u001B[37m"+frase+"\u001B[0m";
        } else {
            return "\u001B[37m"+frase+"\u001B[0m";
        }
    }
    
    /**
     * Colorea el caracter de color blanco
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String white (char caracter) {
        return "\u001B[37m"+caracter+"\u001B[0m";
    }
    
    /**
     * Colorea el numero de color blanco
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String white (int numero) {
        return "\u001B[37m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea el double de color blanco
     *
     * @param frase Cadena a colorear
     * 
     * @return El caracter coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String white (double numero) {
        return "\u001B[37m"+numero+"\u001B[0m";
    }
    
    /**
     * Colorea la cadena de color multicolor 'RAINBOW' uwu
     *
     * @param frase Cadena a colorear
     * 
     * @return La cadena coloreada
     *
     * @author Fernando Martín Gay
     */
    public static String rainbow (String frase) {
        int contador = 0;
        String[] letras = frase.split("");
        String[] colores = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};
        for (int i = 0; i < letras.length; i++) {
            letras[i] = colores[contador] + letras[i];
            contador++;
            if (contador == 6) {
                contador = 0;
            }
        }
        return String.join("", letras) + "\u001B[0m";
    }
}
