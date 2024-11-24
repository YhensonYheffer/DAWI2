package pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202311582.cl1_jpa_data_gervacio_yhenson.entity.Country;

public interface CountryRepository extends CrudRepository<Country, String> {
}
