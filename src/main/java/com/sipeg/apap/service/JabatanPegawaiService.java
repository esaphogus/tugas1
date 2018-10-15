package com.sipeg.apap.service;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.Pegawai;

/**
 * Created by esak on 10/14/2018.
 */
public interface JabatanPegawaiService {
    Jabatan getJabatanByPegawai(Pegawai pegawai);
}
