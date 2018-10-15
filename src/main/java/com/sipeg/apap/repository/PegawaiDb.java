package com.sipeg.apap.repository;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.Pegawai;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

/**
 * Created by esak on 10/12/2018.
 */

@Repository
public interface PegawaiDb extends JpaRepository<Pegawai, BigInteger> {
    Pegawai findByNip(String nip);

    @Override
    List<Pegawai> findAll();

    @Modifying
    @Transactional
    Pegawai save(Pegawai pegawai);

    Jabatan findJabatanByNip(String nip);


}
