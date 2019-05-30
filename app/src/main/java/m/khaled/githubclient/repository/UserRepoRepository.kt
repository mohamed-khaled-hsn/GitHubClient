package m.khaled.githubclient.repository

import m.khaled.githubclient.api.GithubService
import m.khaled.githubclient.api.networkCall
import m.khaled.githubclient.vo.Repo
import m.khaled.githubclient.vo.RepoResponse
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 5:33 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
class UserRepoRepository: KoinComponent {
    private val webService by inject<GithubService>()

    fun getRepos(query: String) = networkCall<RepoResponse, List<Repo>> {
        client = webService.getReposAsync(query)
    }
}