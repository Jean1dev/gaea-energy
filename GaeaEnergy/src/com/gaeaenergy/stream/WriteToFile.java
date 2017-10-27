/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
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
        //String data = (new java.util.Date()).toString();
        String msg = mensagem;
        while (tamanho < msg.length()) {
            escritorArquivos.write((int) msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }

    public void geraLog(String mensagem, String logFile) throws IOException {
        FileOutputStream escritorArquivos = new FileOutputStream(logFile, true);
        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg = ":: " + data + " :: " + mensagem;

        while (tamanho < msg.length()) {
            escritorArquivos.write((int) msg.charAt(tamanho++));
        }

        escritorArquivos.flush();
        escritorArquivos.close();
    }

    public String recuperaLogin() throws IOException {
        String linha = null;

        if (arquivoExiste()) {
            FileReader fileReader = new FileReader("login.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.ready()) {
                linha = bufferedReader.readLine();
                System.out.println(linha);
            }

            bufferedReader.close();
            return linha;
        }else{
            return "";
        }

    }

    private boolean arquivoExiste() {
        File file = new File("login.txt");

        if (file.isFile()) {
            return true;
        } else {
            return false;
        }
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
