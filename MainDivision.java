import java.util.Scanner;
// libreria
public class MainDivision {
    // nombre de la clase
    public static void main(String[]args){
        // metodo main
        Scanner opc = new Scanner(System.in);
        // metodo constructor
        System.out.println("Ingresa un numero");
        // impresion de un mensaje
        double a= opc.nextDouble();
        // declaracion  del tipo de variable
        System.out.println("Ingresa otro numero");
        // impresion del mensaje
        double b= opc.nextDouble();
        // declaracion de el tipo de variable
        double r= a/b;
        // operacion
        Division div = new Division();
        // metodo constructor del objeto a llamar
        div.a=a;
        div.b=b;
        div.r=r;
        // almacenamiento de las variables
        System.out.println("El resultado es:"+ div.mostrarDivision(a, b));
        // concatenacion del resultado
    }
}
// cierre de llaves
