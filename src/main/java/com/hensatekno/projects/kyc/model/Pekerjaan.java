package com.hensatekno.projects.kyc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mst_pekerjaan")
public class Pekerjaan extends BaseModel{


    private String pekerjaan;
    @Column(name = "is_aktif")
    private Integer isAktif;

    @JsonProperty("id_pekerjaan")
    @Column(name = "id_pekerjaan")
    @Override
    public Long getId(){
        return super.getId();
    }
}
