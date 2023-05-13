package com.grozziie.grozziiebluetooth;

/**
 * Created by Sureshkumar on 19-06-2015.
 */
public interface PrintFragmentCommunicator {
    public void respondOnPrintComplete();
    public void respondOnPrinterSelect();
    public void respondOnPrinterSelectCancelled();
}
