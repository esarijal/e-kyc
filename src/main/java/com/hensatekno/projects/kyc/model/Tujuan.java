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
@Table(name = "mst_tujuan")
public class Tujuan extends BaseModel{
    @JsonProperty("id_tujuan")
    @Column(name = "id_tujuan")
    @Override
    public Long getId(){
        return super.getId();
    }

    private String tujuan;
}
