package pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CountryCode;
    private String Language;
    private Integer IsOfficial;
    private Double Percentage;
}

