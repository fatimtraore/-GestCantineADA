package ci.cantine.cantine.services.mapper;

public interface EntityMapper <D, E>{

    D toDto (E Entity);

    E toEntity (D toDto);
}
