import java.util.Scanner;

public class calculadora {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        char operacao = sc.next().charAt(0);

        if (operacao == '+' || operacao == '-' || operacao == '/' || operacao == '*') {
            Float num1 = sc.nextFloat();
            Float num2 = sc.nextFloat();

            if (operacao == '+') {
                System.out.println("RESULTADO: " + (num1 + num2));
            } else if (operacao == '-') {
                System.out.println("RESULTADO: " + (num1 - num2));
            } else if (operacao == '*') {
                System.out.println("RESULTADO: " + (num1 * num2));
            } else if (operacao == '/' && num2 != 0) {
                System.out.println("RESULTADO: " + (num1 / num2));
            } else {
                System.out.println("ERRO");
            }
        } else { 
            System.out.println("ENTRADA INVALIDA");
        }
    }
}
