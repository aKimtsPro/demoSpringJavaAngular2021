package bstorm.akimts.demoSpring.mapper;

public interface Mapper<DTO, ENTITY> {

    DTO toDTO(ENTITY entity);
    ENTITY toEntity(DTO entity);

}
