package m.khaled.githubclient.vo

import m.khaled.githubclient.api.DataResponse

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 5:37 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
data class RepoResponse(val items: List<Repo>): BaseApiResponse<Repo>(), DataResponse<List<Repo>> {
    override fun retrieveData(): List<Repo> = items
}