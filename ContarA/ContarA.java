package vaga2;
import java.util.Scanner;

public class ContarA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a string para verificar:");
        String input = scanner.nextLine();
        
        int quantidade = Verifica.contarA(input);
        
        if (quantidade > 0) {
            System.out.println("A letra 'a' (ou 'A') foi encontrada " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não foi encontrada na string.");
        }
        scanner.close();
    }
}