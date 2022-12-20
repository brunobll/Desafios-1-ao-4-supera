/*
 * Quarto Desafio: Manipular as Strings para orndeá-las
 */

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args){
        int quantidadeStrings;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStrings = new Scanner(System.in);

        quantidadeStrings = scanner.nextInt();
        String[] frases = new String[quantidadeStrings];

        for(int i = 0; i < quantidadeStrings; i++){
            frases[i] = scannerStrings.nextLine();
        }

        scanner.close();
        scannerStrings.close();
        System.out.print("\n");

        for(int j = 0; j < quantidadeStrings; j++){ 
            int tamanhoFrase = frases[j].length();
            char[] frase = frases[j].toCharArray();

            //imprime a parte esquerda
            for(int x = (tamanhoFrase/2) - 1; x >= 0; x--){
                System.out.print(frase[x]);
            }

            //imprime a parte direita
            for(int y = tamanhoFrase - 1; y >= tamanhoFrase/2; y--){
                System.out.print(frase[y]);
            }

            System.out.print("\n");

        }

    }
}
