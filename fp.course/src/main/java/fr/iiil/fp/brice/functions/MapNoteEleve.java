package fr.iiil.fp.brice.functions;

import fr.iiil.fp.brice.Eleve;

import java.util.function.Function;

public class MapNoteEleve implements Function<Eleve, Double> {
    @Override
    public Double apply(Eleve eleve) {
        return eleve.getNote();
    }
}
