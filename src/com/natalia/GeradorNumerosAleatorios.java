package com.natalia;

import java.util.Random;

public class GeradorNumerosAleatorios {
    public static void main(String[] args) {
        int numero, i, j;
        int[] gerarNum = new int[6];

        //Faz uma instanciacao da classe Random para gerar numeros aleatorios
        Random r = new Random();
        for (i=0; i<gerarNum.length; i++){
            //numero vai ate 60 // + 1 = comeca de 1 ate 60
            numero = r.nextInt(60) + 1;

            //Verifica e tira os numeros repetidos
            for (j=0; j<gerarNum.length; j++){
                if(numero == gerarNum[j] && j != i){
                    numero = r.nextInt(60) + 1;
                }else {
                    gerarNum[i] = numero;
                }
            }
        }
        //Ordena os numeros de forma crescente
        for (i=0; i<gerarNum.length; i++){
            for (j = i + 1; j<gerarNum.length; j++){
                if (gerarNum[i] > gerarNum[j]){
                    numero = gerarNum[i];
                    gerarNum[i] = gerarNum[j];
                    gerarNum[j] = numero;
                }
            }
        }
        //Printa o resultado na tela
        for (i=0; i<gerarNum.length; i++){
            System.out.println(gerarNum[i] + " ");
        }

    }
}
