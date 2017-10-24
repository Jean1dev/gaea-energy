/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Jean
 */
public class WriteToFile {

    public WriteToFile() {

    }

    public void escrever(String mensagem, String logFile) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em quest�o.
        FileOutputStream escritorArquivos = new FileOutputStream(logFile, true);
        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        while (tamanho < msg.length()) {
            escritorArquivos.write((int) msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }

//    public static void main( String[] args ) {
//
//        try {
//            WriteToFile.escrever("Testeeeeeeeeeee", "login.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
