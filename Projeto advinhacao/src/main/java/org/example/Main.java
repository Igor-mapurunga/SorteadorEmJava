package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteador = new Random();

        int contador = 0;

        int numeroSorteado = sorteador.nextInt(100);

        System.out.println("Bem-vindo ao jogo de adivinhação! Nosso sistema irá embaralhar os números de 0 a 99. " +
                "Adivinhe qual número foi sorteado:");

        while (true) {
            int tentativa = leitor.nextInt();

            if (tentativa == numeroSorteado) {
                System.out.println("Parabéns, você acertou o número!!!");
                contador++;
                System.out.println("O numero de chances que você tentou até acertar foi :" + contador);
                break;
            } else {
                contador++;
                System.out.println("Tente novamente. Dica: o número sorteado é " +
                        (tentativa < numeroSorteado ? "maior" : "menor") + " do que o que você digitou.");
            }
        }

        leitor.close();
    }
}

