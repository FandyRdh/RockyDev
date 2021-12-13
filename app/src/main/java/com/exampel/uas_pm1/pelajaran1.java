package com.exampel.uas_pm1;

public class pelajaran1 {
    private String code,judul,deskripsi,tokenytb;
    private  int gambar;

    public pelajaran1() {
    }

    public pelajaran1(String code, String judul, String deskripsi, int gambar) {
        this.code = code;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tokenytb = tokenytb;
        this.gambar = gambar;
    }

    public String getTokenytb() {
        return tokenytb;
    }

    public void setTokenytb(String tokenytb) {
        this.tokenytb = tokenytb;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
