package ci.cantine.cantine.repositories;

import ci.cantine.cantine.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long > {
}
