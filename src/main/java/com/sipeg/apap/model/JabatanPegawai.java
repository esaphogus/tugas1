package com.sipeg.apap.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by esak on 10/12/2018.
 */

@Entity
@Table(name = "jabatan_pegawai")
@DynamicUpdate
public class JabatanPegawai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_jabatan")
    private Jabatan jabatan;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_pegawai")
    private Pegawai pegawai;

    public Jabatan getJabatan() {
        return jabatan;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

}
