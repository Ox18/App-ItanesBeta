package com.example.mapbox.interfaces;

import com.example.mapbox.model.LugarRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LugarAPIService {
    @GET("lugar/only/paquete/12")
    Call<LugarRespuesta> obtenerListaLugares();
}
