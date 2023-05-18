package com.grozziie.grozziiebluetooth;

public class Grozziie {
    String printdata,printInfo;

    public Grozziie() {
    }

    public Grozziie(String printdata, String printInfo) {
        this.printdata = printdata;
        this.printInfo = printInfo;
    }

    public String getPrintdata() {
        return printdata;
    }

    public void setPrintdata(String printdata) {
        this.printdata = printdata;
    }

    public String getPrintInfo() {
        return printInfo;
    }

    public void setPrintInfo(String printInfo) {
        this.printInfo = printInfo;
    }
}
