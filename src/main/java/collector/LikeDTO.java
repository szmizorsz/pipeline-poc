package collector;

import org.joda.time.DateTime;

/**
 * Created by szabolcs on 04/02/16.
 */
public class LikeDTO {

    private Integer performerId;
    private Integer memberId;
    private String contentType;
    private Integer documentPrivacyStatus;
    private DateTime createdAt;

    public LikeDTO(Integer performerId, Integer memberId, String contentType, Integer documentPrivacyStatus, DateTime createdAt) {
        this.performerId = performerId;
        this.memberId = memberId;
        this.contentType = contentType;
        this.documentPrivacyStatus = documentPrivacyStatus;
        this.createdAt = createdAt;
    }

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

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
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
        return "LikeDTO{" +
                "performerId=" + performerId +
                ", memberId =" + memberId +
                ", contentType ='" + contentType + '\'' +
                ", documentPrivacyStatus='" + documentPrivacyStatus + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
