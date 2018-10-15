package com.sipeg.apap.repository;

import com.sipeg.apap.model.Provinsi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by esak on 10/15/2018.
 */

@Repository
public interface ProvinsiDb extends JpaRepository<Provinsi, Long> {

    @Override
    List<Provinsi> findAll();
}
