package enricher;

import collector.LikeDTO;
import domain.Like;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by szabolcs on 10/02/16.
 */
@Mapper
public interface LikeMapper {

    LikeMapper INSTANCE = Mappers.getMapper( LikeMapper.class );

    Like LikeDTOtoLike(LikeDTO likeDTO);

    List<Like> LikeDTOsToLikes(List<LikeDTO> likeDTOs);

}
