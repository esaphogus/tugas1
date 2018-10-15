package com.sipeg.apap.controller;

import com.sipeg.apap.model.Jabatan;
import com.sipeg.apap.model.Pegawai;
import com.sipeg.apap.service.JabatanPegawaiService;
import com.sipeg.apap.service.PegawaiService;
import com.sipeg.apap.service.ProvinsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by esak on 10/12/2018.
 */

@Controller
public class PegawaiController {
    @Autowired
    private PegawaiService pegawaiService;

    @Autowired
    private JabatanPegawaiService jabatanPegawaiService;

    @Autowired
    private ProvinsiService provinsiService;

    @RequestMapping(value = "/")
    private String home() {
        return "home";
    }

    @RequestMapping(value = "/pegawai", method = RequestMethod.GET)
    private String viewPegawai(@RequestParam("nip") String nip, Model model) {
        Pegawai pegawai = pegawaiService.getDataByNIP(nip);
        model.addAttribute("pegawai", pegawai);
        model.addAttribute("gaji", pegawai.getGaji());
        model.addAttribute("jabatan", pegawai.getJabatan());

        model.addAttribute("tanggal", pegawai.getTanggalLahir());
        return "view-pegawai";
    }

    @RequestMapping(value = "/pegawai/tambah", method = RequestMethod.GET)
    private String buatPegawai(Model model) {
        model.addAttribute("pegawai", new Pegawai());
        model.addAttribute("provinsi", provinsiService.findAll());

        return "tambah-pegawai";
    }

    @RequestMapping(value = "/pegawai/tambah", method = RequestMethod.POST, params = "submit")
    private String tambahPegawai(@ModelAttribute Pegawai pegawai) {
        pegawaiService.addPegawai(pegawai);

        return "tambah-pegawai-berhasil";
    }

//    @RequestMapping(value = "/pegawai/tambah", method = RequestMethod.POST)
//    private String tambahPegawaiDropdown(@ModelAttribute Pegawai pegawai, Model model) {
//        model.addAttribute("pegawai", pegawai);
//        model.addAttribute("provinsi", pegawai.get);
//
//        return "tambah-pegawai";
//    }
}
