package uz.mirsaidoff.testapp.ui.posts

interface IPostFragmentCtrl {

    fun onLoadPosts(progressListener: IProgressCtrl)

    fun onLoadNextTenPosts(lastPostId:Long)

    fun onNewPostLoad()

    fun onClearAllPosts()
}