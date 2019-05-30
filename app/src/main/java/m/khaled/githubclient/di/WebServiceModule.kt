package m.khaled.githubclient.di

import m.khaled.githubclient.api.GithubService
import org.koin.dsl.module.module
import retrofit2.Retrofit

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 6:09 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
val webServicesModule = module {
    factory { provideGithubService(get()) }
}

fun provideGithubService(retrofit: Retrofit): GithubService {
    return retrofit.create(GithubService::class.java)
}