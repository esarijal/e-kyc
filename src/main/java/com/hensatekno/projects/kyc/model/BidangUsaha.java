package com.hensatekno.projects.kyc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mst_bidang_usaha")
public class BidangUsaha extends BaseModel{
    @JsonProperty("id_bidang_usaha")
    @Column(name = "id_bidang_usaha")
    @Override
    public Long getId(){
        return super.getId();
    }

    @Column(name = "bidang_usaha")
    private String bidangUsaha;
}
