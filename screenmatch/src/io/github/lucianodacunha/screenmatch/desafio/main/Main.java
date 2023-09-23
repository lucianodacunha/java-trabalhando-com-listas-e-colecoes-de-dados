package io.github.lucianodacunha.screenmatch.desafio.main;

import io.github.lucianodacunha.screenmatch.desafio.model.CreditCard;
import io.github.lucianodacunha.screenmatch.desafio.model.Store;
import java.util.*;


/**
 * - Criar uma aplicação para lançamento de compras com cartão de crédito
 * - Menu para lançamento de compras
 * - Exibição da lista de compras realizadas e ordenadas por valor
 *
 * O menu é para realizar as compras, ou seja, essas compras deverão ser
 * armazenadas em uma lista e depois essa lista deve ser exibida e ordenada por
 * valor.
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var card = new CreditCard();
        var store = new Store(card);
        var input = new Scanner(System.in);

        System.out.println(store.getCard());
        System.out.println();

        System.out.printf("Amount available for purchase: $ %.2f\n",
                card.getBalance());
        System.out.print("Do you want to buy something? [s/N]: ");
        var toBuy = input.nextLine();

        System.out.println();

        while(toBuy.equalsIgnoreCase("s")) {
            store.listStock();
            System.out.print("\nEnter the ID of the desired product: ");
            var id = Integer.parseInt(input.nextLine());

            System.out.print("Enter the quantity: ");
            var quantity = Integer.parseInt(input.nextLine());
            store.addProductToCart(store.getProductById(id, quantity));

            System.out.printf("\nAmount available for purchase: $ %.2f\n",
                    card.getBalance());
            System.out.print("Do you want to buy something else? [s/N]: ");
            toBuy = input.nextLine();
            System.out.println();
        }

        System.out.println("Purchase items.");
        store.getCart().listCart();
        System.out.printf(
                "%-37s%8.2f\n",
                "TOTAL",store.getCart().getTotalValue());

        input.close();
    }
}






