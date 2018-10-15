package com.sipeg.apap.service;

import com.sipeg.apap.model.Provinsi;
import com.sipeg.apap.repository.ProvinsiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by esak on 10/15/2018.
 */

@Service
@Transactional
public class ProvinsiServiceImp implements ProvinsiService {
    @Autowired
    private ProvinsiDb provinsiDb;

    @Override
    public List<Provinsi> findAll() {
        return provinsiDb.findAll();
    }
}
