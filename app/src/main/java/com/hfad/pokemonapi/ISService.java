package com.hfad.pokemonapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ISService {
    @GET("api")
    Call<RecipeResponse> searchByIngredient(
            @Query("i") String ingredients,
            @Query("q") String recipeKeywords);
}
