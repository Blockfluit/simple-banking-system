package nl.nielsb.banking.shared.entities.auditing;

import jakarta.persistence.Column;
import lombok.Getter;
import nl.nielsb.banking.shared.entities.ManagementUser;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Getter
public abstract class Auditable {

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;
    @LastModifiedDate
    @Column(name = "last_modified_at")
    private Instant lastModifiedAt;
    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private ManagementUser createdBy;
    @LastModifiedBy
    @Column(name = "last_modified_by")
    private ManagementUser lastModifiedBy;
}