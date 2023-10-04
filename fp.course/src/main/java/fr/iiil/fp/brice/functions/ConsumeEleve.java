package fr.iiil.fp.brice.functions;

import fr.iiil.fp.brice.Eleve;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;


@Slf4j
public class ConsumeEleve implements Consumer<Eleve> {
    @Override
    public void accept(Eleve eleve) {
        log.info("{}", eleve);
    }
}
