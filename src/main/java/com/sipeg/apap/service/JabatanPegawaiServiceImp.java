package com.sipeg.apap.service;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.Pegawai;
import com.sipeg.apap.repository.JabatanPegawaiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by esak on 10/14/2018.
 */

@Service
@Transactional
public class JabatanPegawaiServiceImp implements JabatanPegawaiService {
    @Autowired
    private JabatanPegawaiDb jabatanPegawaiDb;

    @Override
    public Jabatan getJabatanByPegawai(Pegawai pegawai) {
        return jabatanPegawaiDb.getJabatanByPegawai(pegawai);
    }
}
