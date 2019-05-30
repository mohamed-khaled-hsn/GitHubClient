package m.khaled.githubclient.di

import m.khaled.githubclient.repository.UserRepoRepository
import org.koin.dsl.module.module

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 6:05 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
val reposModule= module{
    factory { UserRepoRepository()}
}