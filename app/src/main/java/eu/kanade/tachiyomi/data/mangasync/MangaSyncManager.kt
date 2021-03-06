package eu.kanade.tachiyomi.data.mangasync

import android.content.Context
import eu.kanade.tachiyomi.data.mangasync.anilist.Anilist
import eu.kanade.tachiyomi.data.mangasync.myanimelist.MyAnimeList

class MangaSyncManager(private val context: Context) {

    companion object {
        const val MYANIMELIST = 1
        const val ANILIST = 2
    }

    val myAnimeList = MyAnimeList(context, MYANIMELIST)

    val aniList = Anilist(context, ANILIST)

    // TODO enable anilist
    val services = listOf(myAnimeList)

    fun getService(id: Int) = services.find { it.id == id }

}
