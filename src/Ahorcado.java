import java.util.Scanner;


public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner: permite que el usuario escriba.
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximo = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Utilizando arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Inicializa el array con guiones bajos y muestra al usuario
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Bucle principal
        while (!palabraAdivinada && intentos < intentosMaximo) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "( tiene "  +  palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor: ");
            // Clase Scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Recorre la palabra para verificar si la letra está presente
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            
    
        

            // Si la letra no estaba en la palabra, aumenta los intentos
            if (!letraCorrecta) {
                intentos++;
                System.out.println( letra + " Es Incorrecto Te quedan " + (intentosMaximo - intentos) + " intentos.");
            }

            // Compara si el usuario ha adivinado toda la palabra
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("FelicidadesHas adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        // Mensaje de finalización si se queda sin intentos
        if (!palabraAdivinada) {
            System.out.println("Qué pena, te has quedado sin intentos. Game over.");
        }

        // Cerramos el scanner
        scanner.close();
    } // <- Cierre del método main
} // <- Cierre de la clase Ahorcado
