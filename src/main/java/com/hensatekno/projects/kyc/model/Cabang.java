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
@Table(name = "mst_cabang")
public class Cabang extends BaseModel{
    @JsonProperty("id_cabang")
    @Column(name = "id_cabang")
    @Override
    public Long getId(){
        return super.getId();
    }

    @Column(name = "kode_cabang")
    private String kodeCabang;
    private String cabang;
}
