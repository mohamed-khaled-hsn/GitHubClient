package m.khaled.githubclient

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import m.khaled.githubclient.ui.RepoAdapter
import m.khaled.githubclient.ui.RepoViewModel
import m.khaled.githubclient.vo.Status.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    val repoViewModel: RepoViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = RepoAdapter(ArrayList())
        repoList.adapter = adapter
        repoList.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        repoViewModel.getRepos("kotlin").observe(this, Observer {
            when (it?.status) {
                LOADING -> {
                    Log.d("MainActivity", "--> Loading...")
                    loadingWrapper.visibility = View.VISIBLE
                    listWrapper.visibility = View.GONE
                }
                SUCCESS -> {
                    Log.d("MainActivity", "--> Success! | loaded ${it.data?.size ?: 0} records.")

                    loadingWrapper.visibility = View.GONE
                    listWrapper.visibility = View.VISIBLE
                    adapter.replace(it.data ?: ArrayList())
                }
                ERROR -> {
                    Log.d("MainActivity", "--> Error!")
                    Toast.makeText(this, "Error: ${it.message}", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
