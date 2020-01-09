package com.example.transjogja;

    //Model

public class Bus {

    private String Nama;
    private String Rute;

    Bus(String Nama, String Rute){
            this.Nama = Nama;
            this.Rute = Rute;
    }

    public String getNama(){
            return Nama;
    }

    public void setNama(String Nama){
            this.Nama = Nama;
    }

    public String getRute(){
            return Rute;
    }

    public void setRute(String Rute){
            this.Rute = Rute;
    }
}
