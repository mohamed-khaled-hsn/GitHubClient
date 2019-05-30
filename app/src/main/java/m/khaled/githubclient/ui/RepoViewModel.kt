package m.khaled.githubclient.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import m.khaled.githubclient.repository.UserRepoRepository
import m.khaled.githubclient.vo.Repo
import m.khaled.githubclient.vo.Resource

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 5:34 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
class RepoViewModel(val repo: UserRepoRepository): ViewModel(){

    fun getRepos(query: String): MutableLiveData<Resource<List<Repo>>> {
       return repo.getRepos(query)
    }
}