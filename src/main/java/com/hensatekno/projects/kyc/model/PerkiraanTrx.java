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
@Table(name = "mst_perkiraan_trx")
public class PerkiraanTrx extends BaseModel{
    @JsonProperty("id_perkiraan_trx")
    @Column(name = "id_perkiraan_trx")
    @Override
    public Long getId(){
        return super.getId();
    }

    @Column(name = "perkiraan_trx")
    private String perkiraanTrx;
}
