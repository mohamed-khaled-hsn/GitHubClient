package m.khaled.githubclient.vo

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 5:39 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
abstract class BaseApiResponse<T> {
    var total_count: Int = 0
    var incomplete_results: Boolean = false
}