package pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.entity.CountryLanguage;

import java.util.List;
import java.util.Optional;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage,String> {

    List<CountryLanguage> findByCountryCode(String countryCode);

}
