package com.hensatekno.projects.kyc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "mst_produk")
public class Produk extends BaseModel{
    @JsonProperty("id_produk")
    @Column(name = "id_produk")
    @Override
    public Long getId(){
        return super.getId();
    }

    @Column(name = "id_produk_bmi")
    private Integer idProdukBmi;
    private String judul;
    private String deskripsi;
    private String link;
    @Lob
    private byte[] img;
}
