package m.khaled.githubclient.di

import m.khaled.githubclient.ui.RepoViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 6:11 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
val viewModelsModule = module {
    viewModel { RepoViewModel(get()) }
}