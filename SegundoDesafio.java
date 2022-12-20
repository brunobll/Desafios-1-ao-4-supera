import java.util.Scanner;
import java.lang.Math;

//classe que define os métodos que irão imprimir a determinada nota e sua quantidade
class Notas {

    //nota: 100.00
    public void notasDeCem(double[] quantidadeNotas, int indice){
        System.out.printf("\n%.0f%s", quantidadeNotas[indice], " notas de R$100.00");
    }

    //nota: 50.00
    public void notasDeCinquenta(double[] quantidadeNotas, int indice){
        System.out.printf("\n%.0f%s", quantidadeNotas[indice], " notas de R$50.00");
    }

    //nota: 20.00
    public void notasDeVinte(double[] quantidadeNotas, int indice){
        System.out.printf("\n%.0f%s", quantidadeNotas[indice], " notas de R$20.00");
    }

    //nota: 10.00 
    public void notasDeDez(double[] quantidadeNotas, int indice){
        System.out.printf("\n%.0f%s", quantidadeNotas[indice], " notas de R$10.00");
    }
    //nota: 5.00
    public void notasDeCinco(double[] quantidadeNotas, int indice){
        System.out.printf("\n%.0f%s", quantidadeNotas[indice], " notas de R$5.00");
    }
    //nota: 2.00
    public void notasDeDois(double[] quantidadeNotas, int indice){
        System.out.printf("\n%.0f%s", quantidadeNotas[indice], " notas de R$2.00");
    }

}

//classe que define os métodos que irão imprimir a determinada moeda e sua quantidade
class Moedas {

    //moeda: 1.00
    public void moedasDeUm(double[] quantidadeMoedas, int indice){
        System.out.printf( "\n%.0f%s", quantidadeMoedas[indice], " moedas de R$ 1.00");
    }
    //moeda: 0.50
    public void moedasDeCinquenta(double[] quantidadeMoedas, int indice){
        System.out.printf( "\n%.0f%s", quantidadeMoedas[indice], " moedas de R$ 0.50");
    }
    //moeda: 0.25
    public void moedasDeVinteCinco(double[] quantidadeMoedas, int indice){
        System.out.printf( "\n%.0f%s", quantidadeMoedas[indice], " moedas de R$ 0.25");
    }
    //moeda: 0.10
    public void moedasDeDez(double[] quantidadeMoedas, int indice){
        System.out.printf( "\n%.0f%s", quantidadeMoedas[indice], " moedas de R$ 0.10");
    }
    //moeda: 0.05
    public void moedasDeCinco(double[] quantidadeMoedas, int indice){
        System.out.printf( "\n%.0f%s", quantidadeMoedas[indice], " moedas de R$ 0.05");
    }
    //moeda: 0.01
    public void moedasDeZeroUm(double[] quantidadeMoedas, int indice){
        System.out.printf( "\n%.0f%s", quantidadeMoedas[indice], " moedas de R$ 0.01");
    }

}


public class SegundoDesafio {
    public static void main(String[] args){
        //declação das variáveis
        double valorInformado;
        double[] quantidadeNotas = new double[6];           //arranjo que recebe a quantidade de notas seguindo a mesma sequência do arranjo valoresNotas[]
        double[] quantidadeMoedas = new double[6];          //arranjo que recebe a quantidade de moedas seguindo a mesma sequência do arranjo valoresMoedas[]
        double[] valoresNotas = {100, 50, 20, 10, 5, 2};    //arranjo que define os valores de cada uma das notas 
        double[] valoresMoedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};   //arranjo que define os valores de cada uma das moedas

        //declaração dos objetos
        Scanner scanner = new Scanner(System.in);
        Notas notas = new Notas();
        Moedas moedas = new Moedas();

        //leitura do valor
        valorInformado = scanner.nextDouble();
        scanner.close();

        System.out.println("\nNOTAS:");
        
        //quantidadeNotasCem
        quantidadeNotas[0] = Math.floor(valorInformado/valoresNotas[0]);
        notas.notasDeCem(quantidadeNotas, 0);

        valorInformado -= quantidadeNotas[0]*valoresNotas[0];

        //quantidadeNotasCinquenta 
        quantidadeNotas[1] = Math.floor(valorInformado/valoresNotas[1]);
        notas.notasDeCinquenta(quantidadeNotas, 1);

        valorInformado -= quantidadeNotas[1]*valoresNotas[1];

        //quantidadeNotasVinte
        quantidadeNotas[2] = Math.floor(valorInformado/valoresNotas[2]);
        notas.notasDeVinte(quantidadeNotas, 2);

        valorInformado -= quantidadeNotas[2]*valoresNotas[2];

        //quantidadeNotasDez
        quantidadeNotas[3] = Math.floor(valorInformado/valoresNotas[3]); 
        notas.notasDeDez(quantidadeNotas, 3);

        valorInformado -= quantidadeNotas[3]*valoresNotas[3];

        //quantidadeNotasCinco
        quantidadeNotas[4] = Math.floor(valorInformado/valoresNotas[4]);
        notas.notasDeCinco(quantidadeNotas, 4);

        valorInformado -= quantidadeNotas[4]*valoresNotas[4];

        //quantidadeNotasDois
        quantidadeNotas[5] = Math.floor(valorInformado/valoresNotas[5]);
        notas.notasDeDois(quantidadeNotas, 5);

        valorInformado -= quantidadeNotas[5]*valoresNotas[5];

        System.out.println("\nMOEDAS:");

        //quantidadeMoedasUm
        quantidadeMoedas[0] = Math.floor(valorInformado/valoresMoedas[0]);
        moedas.moedasDeUm(quantidadeMoedas, 0);
        
        valorInformado -= quantidadeMoedas[0]*valoresMoedas[0];

        //quantidadeMoedasCinquenta
        quantidadeMoedas[1] = Math.floor(valorInformado/valoresMoedas[1]);
        moedas.moedasDeCinquenta(quantidadeMoedas, 1);

        valorInformado -= quantidadeMoedas[1]*valoresMoedas[1];

        //quantidadeMoedasVinteCinco
        quantidadeMoedas[2] = Math.floor(valorInformado/valoresMoedas[2]);
        moedas.moedasDeVinteCinco(quantidadeMoedas, 2);

        valorInformado -= quantidadeMoedas[2]*valoresMoedas[2];

        //quantidadeMoedasDez
        quantidadeMoedas[3] = Math.floor(valorInformado/valoresMoedas[3]);
        moedas.moedasDeDez(quantidadeMoedas, 3);

        valorInformado -= quantidadeMoedas[3]*valoresMoedas[3];

        //quantidadeMoedasCinco
        quantidadeMoedas[4] = Math.floor(valorInformado/valoresMoedas[4]);
        moedas.moedasDeCinco(quantidadeMoedas, 4);

        valorInformado -= quantidadeMoedas[4]*valoresMoedas[4];

        //quantidadeMoedasZeroUm
        quantidadeMoedas[5] = Math.floor(valorInformado/valoresMoedas[5]);
        moedas.moedasDeZeroUm(quantidadeMoedas, 5);

        valorInformado -= quantidadeMoedas[5]*valoresMoedas[5];
    }
}
