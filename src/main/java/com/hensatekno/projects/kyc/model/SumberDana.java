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
@Table(name = "mst_sumber_dana")
public class SumberDana extends BaseModel{
    @JsonProperty("id_sumber_dana")
    @Column(name = "id_sumber_dana")
    @Override
    public Long getId(){
        return super.getId();
    }

    @Column(name = "sumber_dana")
    private String sumberDana;
}
