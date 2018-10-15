package com.sipeg.apap.repository;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.JabatanPegawai;
import com.sipeg.apap.model.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by esak on 10/14/2018.
 */

@Repository
public interface JabatanPegawaiDb extends JpaRepository<JabatanPegawai, Long>{
    Jabatan getJabatanByPegawai(Pegawai pegawai);
}
