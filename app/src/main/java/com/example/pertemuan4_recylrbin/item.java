package com.example.pertemuan4_recylrbin;

public class item {
        private String namaclub,pemilik,asal;
        private int logo;

        public item(String namaclub, String pemilik, String asal, int logo) {
            this.namaclub = namaclub;
            this.pemilik = pemilik;
            this.asal = asal;
            this.logo = logo;
        }

        public String getNamaclub() {
            return namaclub;
        }

        public void setNamaclub(String namaclub) {
            this.namaclub = namaclub;
        }

        public String getPemilik() {
            return pemilik;
        }

        public void setPemilik(String pemilik) {
            this.pemilik = pemilik;
        }

        public String getAsal() {
            return asal;
        }

        public void setAsal(String asal) {
            this.asal = asal;
        }

        public int getLogo() {
            return logo;
        }

        public void setLogo(int logo) {
            this.logo = logo;
        }
    }


