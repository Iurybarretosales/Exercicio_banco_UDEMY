package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("____________________________");
        System.out.println("Bem Vindo ao banco do povo");
        System.out.println("____________________________");
        System.out.println();
        System.out.println("Preencha os campos a seguir.");
        System.out.println();

        System.out.print("Número da conta: ");
        int accountNumber = sc.nextInt();
        bankAccount.setAccountNumber(accountNumber);

        System.out.print("Nome do titular: ");
        sc.nextLine();
        String cardholderName = sc.nextLine();
        bankAccount.setCardholderName(cardholderName);

        System.out.print("Valor de deposito: ");
        double depositAmount = sc.nextDouble();
        bankAccount.setDepositAmount(depositAmount);

        System.out.println(bankAccount.toString());

        int c = 0;

        while (c == 0){
            System.out.println("Deseja ralizar alguma movimentação em sua conta ?");
            System.out.println("[1] = SIM \n[2] = NAO");
            int response = sc.nextInt();
            if (response == 1){
                System.out.println("Escolha uma das opçoes:");
                System.out.println("[1] - Alterar nome do titular\n" +
                        "[2] - Depositar\n" +
                        "[3] - Saque");
                response = sc.nextInt();

                if (response == 1){
                    System.out.print("Digite o novo nome do titular: ");
                    String newName = sc.next();
                    bankAccount.updateCardholderName(newName);
                    System.out.println(bankAccount.toString());

                } else if (response == 2) {
                    System.out.println("Digite o valor do deposito: ");
                    double deposit = sc.nextDouble();
                    bankAccount.setDepositAmount(deposit);
                    System.out.println(bankAccount.toString());

                } else if (response == 3) {
                    System.out.println("Digite o valor do saque: ");
                    double sake = sc.nextDouble();
                    bankAccount.sake(sake);
                    System.out.println(bankAccount.toString());
                }else {
                    System.out.println("Digite um valor valido");
                }
            }else {
                c = 1;
            }

        }


        sc.close();
    }
}