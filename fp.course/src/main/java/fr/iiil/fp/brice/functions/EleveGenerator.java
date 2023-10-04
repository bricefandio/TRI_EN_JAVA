package fr.iiil.fp.brice.functions;

import fr.iiil.fp.brice.Eleve;

import java.util.Random;
import java.util.function.Supplier;

public class EleveGenerator implements Supplier<Eleve> {
    @Override
    public Eleve get() {
        Random r = new Random();
        return new Eleve("Junior" , r.nextDouble(0.0, 20.0));
    }
}
