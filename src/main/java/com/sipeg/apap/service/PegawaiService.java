package com.sipeg.apap.service;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.Pegawai;

/**
 * Created by esak on 10/12/2018.
 */
public interface PegawaiService {
    Pegawai getDataByNIP(String nip);

    void addPegawai(Pegawai pegawai);

    Jabatan getJabatanByNip(String nip);
}
