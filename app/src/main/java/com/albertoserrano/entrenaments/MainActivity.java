package com.albertoserrano.entrenaments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TrainingSeriesFragment.Listener{

    private boolean landscape;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.contenedor_detalle) != null){
            landscape = true;
        }

        ArrayList<Entrenament> entrenaments = new ArrayList<>();

        lista = (ListView) findViewById(R.id.listaDeportes);
        lista.setAdapter(new ArrayAdapter<String>(this, R.layout.fragment_training_series, entrenaments.size()));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemClicked(id);
            }
        });
    }

    @Override
    public void itemClicked(long id) {
        if(landscape){


        }else{
            Intent activityInfo = new Intent(this, TrainingInfoActivity.class);
            startActivity(activityInfo);
        }
    }
}