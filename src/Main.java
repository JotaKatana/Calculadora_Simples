import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        double numero1, numero2, soma, subtracao, multiplicacao, divisao, raiz1, raiz2;

        Scanner sc = new Scanner(System.in);

        System.out.println("======== CALCULADORA =======");

        System.out.println("Informe o primeiro numero decimal: ");
        numero1 = sc.nextDouble();
        System.out.println("Informe o segundo numero decimal: ");
        numero2 = sc.nextDouble();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        raiz1 = Math.sqrt(numero1);
        raiz2 = Math.sqrt(numero2);

        System.out.println("\n\n======== Resultados =======\n\n");
        System.out.printf("Soma: %.2f\nSubtração: %.2f\n", soma, subtracao);
        System.out.println("Divisão "+numero1+" / "+numero2+": "+divisao);
        System.out.println("Divisão "+numero1+" * "+numero2+": "+multiplicacao);
        System.out.printf("Raiz de %.2f: %.2f\nRaiz de %.2f: %.2f\n", numero1, raiz1,numero2, raiz2);
        System.out.println("===========================");

        sc.close();
    }
}
