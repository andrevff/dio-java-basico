import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scan.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
