/*
    Primeiro Desafio: ler os valores e imprimí-los da seguinte maneira: primeiro os números pares e em ordem crescente, depois os números ímpares e em ordem decrescente
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

public class PrimeiroDesafio {
    public static void main(String[] args){

        //declaração de variáveis que serão usadas para armazenas os valores 
        int qtdValores; 
        ArrayList<Integer> pares = new ArrayList<Integer>(); 
        ArrayList<Integer> impares = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        //Leitura da quantidade de valores e dos valores propriamente ditos
        qtdValores = scanner.nextInt();

        for(int i = 0; i < qtdValores; i++){
            int valor = scanner.nextInt();

            if(valor%2 == 0){
                pares.add(valor);
            }
            else{
                impares.add(valor);
            }
        }

        //definição das variáveis de tamanho e fechamento do Scanner
        int tamanhoPares = pares.size();
        int tamanhoImpares = impares.size();
        scanner.close();

        //Loop para ordenar os valores pares em ordem crescente
        for(int par1 = 0; par1 < tamanhoPares; par1++){
            int valor1 = pares.get(par1);

            for(int par2 = tamanhoPares - 1; par2 >= par1; par2--){
                int valor2 = pares.get(par2); 

                if(valor1 > valor2){
                    pares.set(par2, valor1);
                    pares.set(par1, valor2);
                    break;
                }
            }
        }

        //Loop para ordenar os valores ímpares em ordem crescente
        for(int impar1 = 0; impar1 < tamanhoImpares; impar1++){
            int valor1 = impares.get(impar1);

            for(int impar2 = tamanhoImpares - 1; impar2 >= impar1; impar2--){
                int valor2 = impares.get(impar2); 

                if(valor1 > valor2){
                    impares.set(impar2, valor1);
                    impares.set(impar1, valor2);
                    break;
                }
            }
        }

        //Loop para imprimir os valores pares na ordem da ArrayList
        for(int par3 = 0; par3 < tamanhoPares; par3++){
            System.out.println("Valor[" + par3 + "] = " + pares.get(par3));
        }

        //Loop para imprimir os valores ímpares na ordem inversa da ArrayList
        for(int impar3 = tamanhoImpares - 1; impar3 >= 0; impar3--){
            System.out.println("Valor[" + impar3 + "] = " + impares.get(impar3));
        }
        
    }

}
