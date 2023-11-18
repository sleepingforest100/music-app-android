package kz.just_code.musicapp.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val baseUrl = "https://spotify23.p.rapidapi.com/"
    @Singleton
    @Provides
    fun getRetrofit(): Retrofit{
      return Retrofit.Builder()
          .baseUrl(baseUrl)
          .addConverterFactory(GsonConverterFactory.create())
          .build()
    }
    @Provides
     fun getSpotifyApi(retrofit: Retrofit): SpotifyApi{
        return retrofit.create(SpotifyApi::class.java)
    }

}