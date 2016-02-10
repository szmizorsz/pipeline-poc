package domain;

import org.joda.time.DateTime;

/**
 * Created by szabolcs on 08/02/16.
 */
public class Like {

    private Integer performerId;
    private Integer memberId;
    private ContentType contentType;
    private Integer documentPrivacyStatus;
    private DateTime createdAt;

    public Integer getPerformerId() {
        return performerId;
    }

    public void setPerformerId(Integer performerId) {
        this.performerId = performerId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Integer getDocumentPrivacyStatus() {
        return documentPrivacyStatus;
    }

    public void setDocumentPrivacyStatus(Integer documentPrivacyStatus) {
        this.documentPrivacyStatus = documentPrivacyStatus;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Like{" +
                "performerId=" + performerId +
                ", memberId=" + memberId +
                ", contentType='" + contentType + '\'' +
                ", documentPrivacyStatus=" + documentPrivacyStatus +
                ", createdAt=" + createdAt +
                '}';
    }
}
