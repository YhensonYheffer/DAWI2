package pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.entity.Country;
import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.repository.CountryRepository;

@SpringBootApplication
public class Cl1JpaDataGervacioYhensonApplication implements CommandLineRunner {

    @Autowired
    CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cl1JpaDataGervacioYhensonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //save

        Country country = new Country("IMG", "Imaginario", "South America", "South America", 1300.0, 1821, 52345, 87.0, 1998.0, 2024.0, "Imaginario", "Republic", "Yhenson Gervacio", 2980, "IM");
        countryRepository.save(country);
    }
}
