package m.khaled.githubclient

import android.app.Application
import m.khaled.githubclient.di.networkModule
import m.khaled.githubclient.di.reposModule
import m.khaled.githubclient.di.viewModelsModule
import m.khaled.githubclient.di.webServicesModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Mohamed Khaled on Thu, 30/May/2019 at 6:02 AM.
 * <p>
 * mohamed.khaled@apptcom.com
 * linkedin.com/in/mohamed5aled
 */
class App: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin(
            androidContext = this@App,
            modules = listOf(networkModule, reposModule, viewModelsModule, webServicesModule)
        )
    }
}