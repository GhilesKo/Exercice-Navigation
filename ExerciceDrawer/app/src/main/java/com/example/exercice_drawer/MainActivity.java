package com.example.exercice_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.exercice_drawer.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener {

    ActivityMainBinding binding;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
         View view = binding.getRoot();
        setContentView(view);
        setNavigationViewListener();





    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home: {
                //do somthing
                finish();
                System.exit(0);
                break;
            }
            case R.id.profil:
                {
                    Toast.makeText(MainActivity.this, "Ghiles Kouaou", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.Deconnexion:
            {
                Log.i("LOGTEST","Preuve que le LOG fonctionne");
                break;
            }
        }
        //close navigation drawer

        return true;
    }

    private void setNavigationViewListener() {
        NavigationView navigationView = (NavigationView) binding.navView;
        navigationView.setNavigationItemSelectedListener(this);
    }

}