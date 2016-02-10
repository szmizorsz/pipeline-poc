package collector;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by szabolcs on 04/02/16.
 */
public abstract class CsvFileDataCollector<T> implements FileDataCollector {

    private String fileName;

    private char delimiter;

    private String[] headers;

    private boolean skipHeaderRecords;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void setSkipHeaderRecords(boolean skipHeaderRecords) {
        this.skipHeaderRecords = skipHeaderRecords;
    }

    public Collection<T> read() throws IOException {

        FileReader in = new FileReader(fileName);

        Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(delimiter).withHeader(headers).withSkipHeaderRecord(skipHeaderRecords).parse(in);
        List<T> dtoObjects = new ArrayList<T>();

        for (CSVRecord record : records) {
            dtoObjects.add(recordProcessor(record));
        }

        return dtoObjects;
    }

    public abstract T recordProcessor(CSVRecord record);

}
