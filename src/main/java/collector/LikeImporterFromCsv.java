package collector;

import org.apache.commons.csv.CSVRecord;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;

/**
 * Created by szabolcs on 08/02/16.
 */
public class LikeImporterFromCsv extends CsvFileDataCollector {

    private final DateTimeParser[] parsers = {
            DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm:ss" ).getParser(),
            DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm" ).getParser() };
    private final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().append( null, parsers ).toFormatter();

    public LikeImporterFromCsv(String fileName) {
        setFileName(fileName);
        setDelimiter(';');
        String[] headers = {"performer_id","member_id","content_type","document_privacy_status","created_at"};
        setHeaders(headers);
        setSkipHeaderRecords(true);
    }

    @Override
    public LikeDTO recordProcessor(CSVRecord record) {
        Integer performerId = Integer.parseInt(record.get("performer_id"));
        Integer memberId = Integer.parseInt(record.get("member_id"));
        String contentType = record.get("content_type");
        Integer documentPrivacyStatus = Integer.parseInt(record.get("document_privacy_status"));
        DateTime createdAt = FORMATTER.parseDateTime(record.get("created_at"));

        return new LikeDTO(performerId, memberId, contentType, documentPrivacyStatus, createdAt);
    }
}
