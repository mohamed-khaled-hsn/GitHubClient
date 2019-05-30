package m.khaled.githubclient.api

import kotlinx.coroutines.Deferred
import m.khaled.githubclient.vo.RepoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 5:40 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
interface GithubService {
    @GET("search/repositories")
    fun getReposAsync(@Query("q") query: String): Deferred<Response<RepoResponse>>
}