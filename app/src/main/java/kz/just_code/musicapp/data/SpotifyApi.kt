package kz.just_code.musicapp.data

import kz.just_code.musicapp.AlbumsResponse
import kz.just_code.musicapp.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface SpotifyApi {
    @GET("search/?type=tracks")
    @Headers(
        "X-RapidAPI-Key: 8f41e30c1emshf912ca809a7dcc9p1593d5jsnd63c6c141314",
        "X-RapidAPI-Host: spotify23.p.rapidapi.com"
    )
    suspend fun searchMusic(
        @Query("q") search: String

    ): Response<SearchResponse>

    @GET("/albums/?ids=3IBcauSj5M2A6lTeffJzdv,33Ek6daAL3oXyQIV1uoItD,7IouDrXPdAZwT1NzVV3vef,41GuZcammIkupMPKH2OJ6I,0HS8aknH0JQdMIiBVhyOCW")
    @Headers(
        "X-RapidAPI-Key: 8475dfb7b0msh039ee1a3acd302ap195110jsn3c1720bebf1a",
        "X-RapidAPI-Host: spotify23.p.rapidapi.com"
    )
    suspend fun getAlbums(): Response<AlbumsResponse>

}