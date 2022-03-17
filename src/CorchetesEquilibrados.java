import java.util.Scanner;
import java.util.Stack;

public class CorchetesEquilibrados {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String cadena = scanner.nextLine();
        Stack<Character> pila = new Stack<Character>();
        int i = 0;
        while (i < cadena.length()) {
            if (pila.empty() && (cadena.charAt(i) == ')' || cadena.charAt(i) == '}' || cadena.charAt(i) == ']')) {
                System.out.println("Salida NO");
                System.exit(0);
            }
            if (!pila.empty()) {
                if ((pila.peek() == '(' && cadena.charAt(i) == ')') || (pila.peek() == '{' && cadena.charAt(i) == '}') || (pila.peek() == '[' && cadena.charAt(i) == ']')) {
                    pila.pop();
                }
                else if (cadena.charAt(i) == ')' || cadena.charAt(i) == '}' || cadena.charAt(i) == ']') {
                    System.out.println("Salida NO");
                    System.exit(0);
                }
                else {
                    pila.push(cadena.charAt(i));
                }
            }
            else {
                pila.push(cadena.charAt(i));
            }
            if ((i + 1) == cadena.length() && pila.size() == 1) {
                System.out.println("Salida NO");
                System.exit(0);
            }
            i++;
        }
        System.out.println("Salida SI");
    }
}
