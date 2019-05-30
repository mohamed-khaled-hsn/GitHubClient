package m.khaled.githubclient.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_repo.view.*
import m.khaled.githubclient.R
import m.khaled.githubclient.vo.Repo

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 6:51 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
class RepoAdapter(val repoList: ArrayList<Repo>) : RecyclerView.Adapter<RepoAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_repo, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(repoList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return repoList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(repo: Repo) {
            itemView.repoName.text = repo.full_name

        }
    }
    fun replace(data: List<Repo>) {
        repoList.clear()
        repoList.addAll(data)
        notifyDataSetChanged()
    }

}