package fr.iiil.fp.brice;
import fr.iiil.fp.brice.functions.EleveGenerator;
import lombok.extern.slf4j.Slf4j;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



@Slf4j
public class Main {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();

        try {
            Stream<String> lines = Files.lines(Paths.get("src/main/resources/personnes.csv"));

            personnes = lines
                    .skip(1) // Ignore the first line
                    .map(line -> {
                        String[] parts = line.split(",");
                        String prenom = parts[0].trim();
                        int age = Integer.valueOf(parts[1].trim());
                        return new Personne(prenom, age);
                    })
                    .collect(Collectors.toList());

            lines.close(); // Close the stream

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Trier la liste des personnes par âge croissant
        personnes.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        // Afficher la liste triée
        personnes.forEach(System.out::println);
    }
}