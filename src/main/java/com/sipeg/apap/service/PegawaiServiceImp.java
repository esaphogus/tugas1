package com.sipeg.apap.service;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.Pegawai;
import com.sipeg.apap.repository.PegawaiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by esak on 10/12/2018.
 */
@Service
@Transactional
public class PegawaiServiceImp implements PegawaiService {
    @Autowired
    private PegawaiDb pegawaiDb;

    @Override
    public Pegawai getDataByNIP(String nip) {
        return pegawaiDb.findByNip(nip);
    }

    @Override
    public void addPegawai(Pegawai pegawai) {
        pegawaiDb.save(pegawai);
    }

    @Override
    public Jabatan getJabatanByNip(String nip) {
        return pegawaiDb.findJabatanByNip(nip);
    }
}
