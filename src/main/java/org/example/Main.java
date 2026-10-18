import org.example.EroeNonIdoneoException;
import org.example.Reclutatore;

import static java.lang.IO.println;

void main() {
    int difficolta = 75;
    println("DIFFICOLTA DELLA MISSIONE: " + difficolta);
    Reclutatore r = new Reclutatore();
    for (int i = 0; i < 5; i++) {
        try {
            r.recluta(difficolta);
            println("L'eroe è all'altezza della missione\n");
        } catch(EroeNonIdoneoException e) {
            println("L'eroe " + e.getNome() + " di potenza " + e.getPotenza() + " è troppo debole\n");
        }
    }
}
