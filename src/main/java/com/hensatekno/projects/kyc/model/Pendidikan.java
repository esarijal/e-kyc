package com.hensatekno.projects.kyc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mst_pendidikan")
public class Pendidikan extends BaseModel{
    @JsonProperty("id_pendidikan")
    @Column(name = "id_pendidikan")
    @Override
    public Long getId(){
        return super.getId();
    }

    private String pendidikan;
}
