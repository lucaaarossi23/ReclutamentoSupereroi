package org.example;
import net.datafaker.Faker;

import static java.lang.IO.println;

public class Reclutatore {
    private Faker faker = new Faker();

    public void recluta(int Difficolta) throws EroeNonIdoneoException {
        String Nome = faker.superhero().name();
        int Potenza = faker.number().numberBetween(1, 100);

        println("Nome: " + Nome);
        println("Potenza: " + Potenza);

        if (Potenza < Difficolta) {
            throw new EroeNonIdoneoException(Nome, Potenza);
        }
    }
}
