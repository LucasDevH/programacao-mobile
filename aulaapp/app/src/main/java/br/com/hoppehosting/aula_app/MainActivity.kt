package br.com.hoppehosting.aula_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.hoppehosting.aula_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Infla o layout usando View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura o BottomNavigationView
        val navView: BottomNavigationView = binding.navView

        // Encontra o NavController associado ao nav_host_fragment
        val navController = findNavController(R.id.nav_host_fragment)

        // Define as páginas do menu como destinos de topo (Top-Level Destinations)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )

        // Configura a ActionBar para funcionar com o NavController
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Configura o BottomNavigationView para funcionar com o NavController
        navView.setupWithNavController(navController)
    }
}
