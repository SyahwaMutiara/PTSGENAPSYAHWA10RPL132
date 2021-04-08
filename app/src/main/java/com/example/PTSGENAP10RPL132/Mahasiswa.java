package com.example.PTSGENAP10RPL132;

public class Mahasiswa {
    private String nama,nohp, email,status, Alamat;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public Mahasiswa(String nama, String nohp, String email, String status, String Alamat) {
        this.nama = nama;
        this.nohp = nohp;
        this.email = email;
        this.status = status;
        this.Alamat = Alamat;
    }

    public String getstatus() { return status; }

    public void setstatus(String status) { this.status = status; }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
