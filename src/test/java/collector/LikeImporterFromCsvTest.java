package collector;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by szabolcs on 07/02/16.
 */
public class LikeImporterFromCsvTest {

    private LikeImporterFromCsv likeImporterFromCsv;

    @Before
    public void setUp() throws Exception {
        likeImporterFromCsv = new LikeImporterFromCsv("src/test/resources/TestData.csv");
    }

    @Test
    public void testRead() throws Exception {
        Collection<LikeDTO> likeDTOs = likeImporterFromCsv.read();
        assertEquals(likeDTOs.size(), 23);
    }
}