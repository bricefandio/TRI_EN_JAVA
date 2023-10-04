package fr.iiil.fp.brice;
import lombok.AllArgsConstructor;
import lombok.*;

@AllArgsConstructor
//import lombok.ToString;
@ToString
@Getter
public class Eleve {
    private String nom;
    @Setter
    private Double note;

}
