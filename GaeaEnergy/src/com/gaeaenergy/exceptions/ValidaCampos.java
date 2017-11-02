/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.exceptions;

import com.gaeaenergy.stream.WriteToFile;
import java.util.InputMismatchException;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jean
 */
public class ValidaCampos {

    WriteToFile arquivo = new WriteToFile();

    public ValidaCampos() {
    }

    public void ValidacaoSimples(JInternalFrame frame, String param1, String param2,
            String param3, String param4, String param5) throws ExceptionLabel {

        if (param1.equals("")) {
            System.out.println("errouuuuuuuuuuuuuuuuuuu");
        }

        if (param2.equals("")) {
            throw new ExceptionLabel(param2);
        }

        if (param3.equals("")) {
            throw new ExceptionLabel(param3);
        }

        if (param4.equals("")) {
            throw new ExceptionLabel(param4);
        }

        if (param5.equals("")) {
            throw new ExceptionLabel(param5);
        }

    }

    public boolean ValidaNome(String nome) {
        if (nome.equals("")) {
            return true;
        }
        return false;
    }

    public boolean ValidaCPF_CPNJ(String info) {
        if (info.length() > 11) {
            if (isCNPJ(info)) {
                return true;
            } else {
                return false;
            }
        }

        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (info.equals("00000000000") || info.equals("11111111111")
                || info.equals("22222222222") || info.equals("33333333333")
                || info.equals("44444444444") || info.equals("55555555555")
                || info.equals("66666666666") || info.equals("77777777777")
                || info.equals("88888888888") || info.equals("99999999999")
                || (info.length() != 11)) {
            return true;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (info.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (info.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

// Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == info.charAt(9)) && (dig11 == info.charAt(10))) {
                return false;
            } else {
                return true;
            }
        } catch (InputMismatchException erro) {
            arquivo.jogaPilhaNoArquivo(erro, true);
            return true;
        }
    }

    public static String imprimeCPF(String CPF) {
        return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "."
                + CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
        //return false;
    }

    private boolean isCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return true;
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return false;
            } else {
                return true;
            }
        } catch (InputMismatchException erro) {
            arquivo.jogaPilhaNoArquivo(erro, true);
            return true;
        }
    }

    public static String imprimeCNPJ(String CNPJ) {
// máscara do CNPJ: 99.999.999.9999-99
        return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "."
                + CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-"
                + CNPJ.substring(12, 14));
    }

    public int validaSenha(String param1, String param2) {
        if (param1.length() < 4) {
            return 1;
        } else if (!param1.equals(param2)) {
            return 2;
        }
        return 0;
    }
}
