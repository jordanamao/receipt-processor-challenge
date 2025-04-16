package examples.demo.service.ObjectToDataObjectMapper;

import examples.demo.DatabaseModel.ItemDatabaseModel;
import examples.demo.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MapItemDTOItemDatabaseModelMapper {

    MapItemDTOItemDatabaseModelMapper INSTANCE = Mappers.getMapper(MapItemDTOItemDatabaseModelMapper.class);

//    @Mapping(source = "shortDescription", target = "shortDescription")
//    @Mapping(source = "price", target = "price")
    ItemDatabaseModel toItemDatabaseModel (Item item);

}
