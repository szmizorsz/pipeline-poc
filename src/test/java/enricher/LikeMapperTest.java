package enricher;

import collector.LikeDTO;
import collector.LikeImporterFromCsv;
import domain.Like;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by szabolcs on 10/02/16.
 */
public class LikeMapperTest {

    private LikeImporterFromCsv likeImporterFromCsv;

    @Before
    public void setUp() throws Exception {
        likeImporterFromCsv = Mockito.mock(LikeImporterFromCsv.class);

        ArrayList<LikeDTO> mockLikeDTOs = new ArrayList<>();
        mockLikeDTOs.add(new LikeDTO(19754730, 40260120, "image", 1, new DateTime("2015-10-28T09:59:00.000+01:00")));
        mockLikeDTOs.add(new LikeDTO(19754731, 40260120, "note", 2, new DateTime("2015-10-28T09:59:00.000+01:00")));

        when(likeImporterFromCsv.read()).thenReturn(mockLikeDTOs);
    }

    @Test
    public void testLikeDTOtoLike() throws Exception {
        Collection<LikeDTO> likeDTOs = likeImporterFromCsv.read();
        ArrayList<Like> likes = new ArrayList<>();

        for(LikeDTO likeDTO : likeDTOs) {
            Like like = LikeMapper.INSTANCE.LikeDTOtoLike(likeDTO);
            likes.add(like);
        }

        assertEquals(likes.size(), 2);
    }


    @Test
    public void testLikeDTOsToLikes() throws Exception {
        Collection<LikeDTO> likeDTOs = likeImporterFromCsv.read();
        List<Like> likes = LikeMapper.INSTANCE.LikeDTOsToLikes(new ArrayList<LikeDTO>(likeDTOs));

        assertEquals(likes.size(), 2);
    }
}