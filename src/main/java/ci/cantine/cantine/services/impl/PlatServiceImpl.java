package ci.cantine.cantine.services.impl;

import ci.cantine.cantine.models.Plat;
import ci.cantine.cantine.repositories.PlatRepository;
import ci.cantine.cantine.services.PlatService;
import ci.cantine.cantine.services.dto.PlatDTO;
import ci.cantine.cantine.services.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    private final PlatMapper platMapper;

    @Override
    public PlatDTO save(PlatDTO platDTO) {
        Plat plat = platMapper.toEntity(platDTO);
        Plat savePlat = platRepository.save(plat);
        return platMapper.toDto(savePlat);

    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        return null;
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream().map(plat -> {
            return platMapper.toDto(plat);
        }).toList();

    }

    @Override
    public void delete(Long id) {

    }
}
