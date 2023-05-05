package projeto_Bolao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    
    public static int lerOpcao(){
        /* le a opcao digitada e retorna ela */
        Scanner ler = new Scanner(System.in); 
        return ler.nextInt();      
    } 

    public static int imprimeMenu() {
        boolean continua = true;
        Scanner ler = new Scanner(System.in); 

        while (continua) {
            try {

                System.out.println();
                System.out.println("Escolha uma das opcoes");
                System.out.println("1) Cadastrar jogador");
                System.out.println("2) Cadastrar aposta");
                System.out.println("3) Inserir sorteio e listar vencedores");
                System.out.println("4) Sair");
                System.out.printf("Digite aqui a opcao do menu: ");
                int i = ler.nextInt();

                for (int j = 0; j < 20; j++) {
                    System.out.println();
                }
                
                continua = false;
                return i;

            } catch (InputMismatchException e) {

                for (int j = 0; j < 20; j++) {
                    System.out.println();
                }
                
                
                System.out.println("\u001B[45m ERRO! Numero invalido, digite um numero inteiro! \u001B[0m");
                //"\u001B[45m" + texto + "\u001B[0m"
                ler.nextLine();
            }
        }
        /* imprime as primeiras opcoes do menu */

        
        int i = lerOpcao();
        for (int j = 0; j < 20; j++) {
            System.out.println();
        }
        return i;
    }
}
