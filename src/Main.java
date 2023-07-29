import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            String nome;
            int idade;

            Scanner teclado = new Scanner(System.in);


            System.out.print("Qual é o seu nome:  ");
            nome = teclado.nextLine();

            System.out.print("Qual é a sua idade:  ");
            idade = teclado.nextInt();


            System.out.println("Olá " + nome + " É um prazer te-lo aqui !");
            System.out.println("Sua idade é: " + idade + " anos");


//            System.out.println(nome);
//            System.out.println("É um Desprazer ter você Aqui");

//            System.out.println("A Aula começou a ficar bacana !");
//            System.out.println("Mentira, está uma Bosta  !! ");

    }
}