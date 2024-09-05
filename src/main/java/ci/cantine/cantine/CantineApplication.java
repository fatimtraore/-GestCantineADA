package ci.cantine.cantine;

import ci.cantine.cantine.services.MenuService;
import ci.cantine.cantine.services.PlatService;
import ci.cantine.cantine.services.dto.MenuDTO;
import ci.cantine.cantine.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class CantineApplication implements CommandLineRunner {

	private final MenuService menuService;
	private final PlatService platService;

	public static void main(String[] args) {

		SpringApplication.run(CantineApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

		MenuDTO menuDTO = new MenuDTO();
		menuDTO.setCreationDate((Date.from(Instant.now())));
		menuService.save(menuDTO);


		PlatDTO platDTO = new PlatDTO();
		platDTO.setName("Alloco");
		platDTO.setSummary("Somaire");
		platService.save(platDTO);





	}
}
