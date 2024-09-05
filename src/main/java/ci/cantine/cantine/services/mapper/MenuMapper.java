package ci.cantine.cantine.services.mapper;

import ci.cantine.cantine.models.Menu;
import ci.cantine.cantine.services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu>{
}
