package src;
import java.util.Locale;
import java.util.Scanner;

public class Teste {    

    private Scanner scanner;
    
    public Teste(){
        this.scanner = new Scanner(System.in).useLocale(Locale.US);
    }
    public static void main(String[] args) {
        Teste teste = new Teste();

        System.out.print("Digite o seu nome: ");
        String nome = teste.scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teste.scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teste.scanner.nextInt();
        teste.scanner.nextLine();

        System.out.print("Digite sua altura: ");
        double altura = teste.scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + "\nTenho " + idade + " anos de idade e minha altura é de " + altura + " metros");

    }
}
