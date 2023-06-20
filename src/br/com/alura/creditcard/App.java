package br.com.alura.creditcard;

import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do Cartão: ");
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);

        int leave = 1;
        while (leave != 0) {
            System.out.println("Digite a descrição da compra: ");
            String description = read.next();

            System.out.println("Digite o valor da compra: ");
            double value = read.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean purchaseMade = card.launchBuy(purchase);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                leave = read.nextInt();
            } else {
                System.out.println("Saldo insificiente!");
                leave = 0;
            }
        }

        System.out.println("**************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(card.getPurchases());

        for (Purchase p : card.getPurchases()) {
            System.out.println(p.getDescription() + " - " + p.getValue());
        }

        System.out.println("\n**************************");

        System.out.println("\n Saldo do cartão: " + card.getBalance());

        read.close();
    }
}
