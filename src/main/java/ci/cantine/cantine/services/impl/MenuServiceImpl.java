package ci.cantine.cantine.services.impl;

import ci.cantine.cantine.models.Menu;
import ci.cantine.cantine.repositories.MenuRepository;
import ci.cantine.cantine.services.MenuService;
import ci.cantine.cantine.services.dto.MenuDTO;
import ci.cantine.cantine.services.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;

    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        Menu menu = menuMapper.toEntity(menuDTO);
        Menu saveMenu = menuRepository.save(menu);
        return menuMapper.toDto(saveMenu);
    }

    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        return null;
    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<MenuDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
