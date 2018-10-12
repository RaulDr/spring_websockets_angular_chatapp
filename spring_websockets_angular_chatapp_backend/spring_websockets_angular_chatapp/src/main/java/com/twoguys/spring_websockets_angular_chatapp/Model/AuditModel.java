package com.twoguys.spring_websockets_angular_chatapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)
@Setter
public abstract class AuditModel implements Serializable {

    @Column(name = "created_at", insertable = true, updatable = false)
    @CreatedDate
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false, updatable = true)
    @LastModifiedDate
    private Timestamp updatedAt;

    @PrePersist
    void onCreate() {
        this.setCreatedAt(new Timestamp((new Date()).getTime()));
    }

    @PreUpdate
    void onPersist() {
        this.setUpdatedAt(new Timestamp((new Date()).getTime()));
    }

}