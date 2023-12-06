package kz.just_code.musicapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kz.just_code.musicapp.PlaylistSecondList
import kz.just_code.musicapp.data.MusicRepository
import kz.just_code.musicapp.data.db.TrackEntity
import kz.just_code.musicapp.repository.TrackRepository
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: MusicRepository,
    private val tracksRepository: TrackRepository
) : BaseViewModel() {
    val getAlbumsLiveData: LiveData<List<PlaylistSecondList>> = repository.homeAlbumsLiveData
    val tracksLiveData: LiveData<List<TrackEntity>> = tracksRepository.tracksFlow.asLiveData()

    fun getAlbums() {
        launch(
            request = {
                repository.getAlbums()
            }
        )
    }
}