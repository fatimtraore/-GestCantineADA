package ci.cantine.cantine.services.mapper;

import ci.cantine.cantine.models.Plat;
import ci.cantine.cantine.services.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PlatMapper extends EntityMapper<PlatDTO, Plat>{
}
