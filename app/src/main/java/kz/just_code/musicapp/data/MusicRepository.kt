package kz.just_code.musicapp.data

import androidx.lifecycle.LiveData
import kz.just_code.musicapp.AlbumData
import kz.just_code.musicapp.AlbumItem
import kz.just_code.musicapp.Albums

interface MusicRepository {
    suspend fun searchMusic(text: String)
    val albumlivedata: LiveData<List<AlbumItem>?>

    suspend fun getAlbums(albums: Albums)
    val getalbums: LiveData<List<AlbumData>?>
}