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
@Table(name = "mst_jabatan")
public class Jabatan extends BaseModel{
    @JsonProperty("id_jabatan")
    @Column(name = "id_jabatan")
    @Override
    public Long getId(){
        return super.getId();
    }

    private String jabatan;
    @Column(name = "is_aktif")
    private Integer isAktif;
}
