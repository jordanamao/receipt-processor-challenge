package examples.demo.requestToObjectMapper;

import examples.demo.databaseModel.ItemDatabaseModel;
import examples.demo.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MapItemDTOItemDatabaseModelMapper {

    MapItemDTOItemDatabaseModelMapper INSTANCE = Mappers.getMapper(MapItemDTOItemDatabaseModelMapper.class);

//    @Mapping(source = "shortDescription", target = "shortDescription")
//    @Mapping(source = "price", target = "price")
    ItemDatabaseModel toItemDatabaseModel (Item item);

}
