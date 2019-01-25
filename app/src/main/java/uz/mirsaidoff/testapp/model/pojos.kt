package uz.mirsaidoff.testapp.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "post_table")
class Post {
    @ColumnInfo(name = "post_id")
    @PrimaryKey(autoGenerate = true)
    private var id: Long = 0

    @ColumnInfo(name = "title")
    var title: String? = null

    @ColumnInfo(name = "author")
    var author: String? = null

    @ColumnInfo(name = "published_at")
    var publishedAt: Date? = null
}