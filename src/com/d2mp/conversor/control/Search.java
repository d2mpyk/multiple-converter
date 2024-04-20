package com.d2mp.conversor.control;

import com.d2mp.conversor.model.Result;
import com.d2mp.conversor.model.ResultRecord;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.Gson;

public class Search {
    public Search() {
    }
    public Result getConversion(String base, String target){
        Result resultado = new Result();
        var uri = "https://v6.exchangerate-api.com/v6/e668abd659d89658db2c4817/pair/"+base+"/"+target;
        HttpResponse<String> response;
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // Obtenemos un String del response
            String json = response.body();
            // Convertimos a JSON
            Gson gson = new Gson();
            // Convertimos el JSON al Record (clase Intermedia)
            ResultRecord resultRecord = gson.fromJson(json, ResultRecord.class);
            // Creamos la instancia de la clase Resultado usando el Record
            resultado = new Result(resultRecord);
            //System.out.println("El resultRecord es: "+Double.toString(resultado));
        } catch (Exception e) {
            System.out.println(" Error: "+e);
        }
        return resultado;
    }

    public String optionToCode(int option){
        return switch (option) {
            case 1 -> "ARS";
            case 2 -> "BRL";
            case 3 -> "BOB";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "EUR";
            case 7 -> "MXN";
            case 8 -> "PEN";
            case 9 -> "PYG";
            case 10 -> "USD";
            case 11 -> "UYU";
            case 12 -> "VES";
            default -> "ERROR";
        };
    }

    public String unixToDate(int unix_time){
        Date date = new Date((long)unix_time*1000);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        return sdf.format(date);
    }
}
