package pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.entity.CountryLanguage;
import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.repository.CountryLanguageRepository;
import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.repository.CountryRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataGervacioYhensonApplication implements CommandLineRunner {

    @Autowired
    CountryRepository countryRepository;
    CountryLanguageRepository countryLanguageRepository;


    public static void main(String[] args) {
        SpringApplication.run(Cl1JpaDataGervacioYhensonApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        //save
        /*Country country = new Country("IMG", "Imaginario", "South America", "South America", 1300.0, 1821, 52345, 87.0, 1998.0, 2024.0, "Imaginario", "Republic", "Yhenson Gervacio", 2980, "IM");
        countryRepository.save(country);*/

                /*List<String> ids = Arrays.asList("COL", "ARG");
        ids.forEach(countryRepository::deleteById);
        System.out.println("Países eliminados: COL, ARG");*/


        List<CountryLanguage> languages = countryLanguageRepository.findByCountryCode("ARG");
        if (!languages.isEmpty()) {
            System.out.println("Lenguajes en ARG (Argentina):");
            languages.forEach(lang -> System.out.println(lang.getLanguage())); // Ahora funcionará
        } else {
            System.out.println("País 'ARG' no encontrado. Mostrando lenguajes del país 'PER' (Perú):");
            List<CountryLanguage> peruLanguages = countryLanguageRepository.findByCountryCode("PER");
            peruLanguages.forEach(lang -> System.out.println(lang.getLanguage()));
        }


        System.out.println("\nVolviendo a ejecutar la consulta de lenguajes:");
        List<CountryLanguage> languagesnc = countryLanguageRepository.findByCountryCode("ARG");
        if (!languages.isEmpty()) {
            System.out.println("Lenguajes en ARG (Argentina):");
            languages.forEach(lang -> System.out.println(lang.getLanguage()));
        } else {
            System.out.println("País 'ARG' no encontrado. Mostrando lenguajes del país 'PER' (Perú):");
            List<CountryLanguage> peruLanguages = countryLanguageRepository.findByCountryCode("PER");
            peruLanguages.forEach(lang -> System.out.println(lang.getLanguage()));
        }

        System.out.println("\nRestaurando la base de datos. Puedes hacerlo manualmente desde la terminal.");
    }
}