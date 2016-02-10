package collector;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by szabolcs on 04/02/16.
 */
public interface FileDataCollector<T> {

    Collection<T> read() throws IOException;
}
