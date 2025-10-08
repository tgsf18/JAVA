package com.exemplo.conversor.service;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;
import java.util.Locale;

@Service
public class ConversorService {

    public double converter(double valor, String de, String para) {
        double celsius;

        // Converte tudo para Celsius primeiro
        switch (de.toUpperCase()) {
            case "F":
                celsius = (valor - 32) * 5 / 9;
                break;
            case "K":
                celsius = valor - 273.15;
                break;
            default:
                celsius = valor;
        }

        // Agora converte de Celsius para o destino
        switch (para.toUpperCase()) {
            case "F":
                return (celsius * 9 / 5) + 32;
            case "K":
                return celsius + 273.15;
            default:
                return celsius;
        }
    }

    public String formatar(double valor) {
        Locale.setDefault(new Locale("pt", "BR"));
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }
}