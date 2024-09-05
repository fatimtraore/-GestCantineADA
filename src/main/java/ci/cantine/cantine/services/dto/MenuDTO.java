package ci.cantine.cantine.services.dto;

import ci.cantine.cantine.models.Plat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MenuDTO {


    private Long id;


    private Date creationDate;


    private Plat plat;
}
