/*
 * Terceiro Desafio: imprimir a quantidade de pares de números do arranjo que, ao serem subtraídos, resultam no valor alvo informado
 */

import java.util.Scanner; 

class analisaArranjo {
    public int analise(int[] elementos, int quantidadeElementos, int valorAlvo){
        int i, j;
        int quantidadePares = 0;  
        for(i = 0; i < quantidadeElementos; i++){
            for(j = quantidadeElementos - 1; j >= 0; j--){

                if(elementos[i] - elementos[j] == valorAlvo) { quantidadePares++; }
            }
        }
        return quantidadePares;
    }

}

public class TerceiroDesafio {
    public static void main(String[] args){
        int quantidadeElementos, valorAlvo;
        Scanner scanner = new Scanner(System.in);
        analisaArranjo analisaArranjo = new analisaArranjo();

        quantidadeElementos = scanner.nextInt();
        valorAlvo = scanner.nextInt();

        int[] elementos = new int[quantidadeElementos];

        for(int i = 0; i < quantidadeElementos; i++){
            elementos[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.print("\nQuantidade de pares: ");
        System.out.print(analisaArranjo.analise(elementos, quantidadeElementos, valorAlvo));
    }
}