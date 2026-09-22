package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        double saldo = 0.0;
        int opcao = 0;

        do {
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            if (env.hasNextInt()) {
                opcao = env.nextInt();
            } else {
                System.out.println("Opção Inválida");
                env.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Saldo Atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito: R$ ");
                    double valorDeposito = env.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Depósito realizado com sucesso! Saldo Atual: R$" + saldo);
                    } else {
                        System.out.println("Valor inválido");
                    }

                    break;

                case 3:
                    System.out.println("Digite o valor do saque: R$ ");
                    double valorSaque = env.nextDouble();

                    if (valorSaque > 0 && valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println(("Saque realizado com sucesso! Saldo Atual:" + saldo));
                    } else {
                        System.out.println("Saldo insuficiente | Valor invalido");
                    }

                    break;

                case 4:
                    System.out.println("Sessão encerrada. Obrigado por utilizar nossos serviços!");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (opcao != 4);
    }
}