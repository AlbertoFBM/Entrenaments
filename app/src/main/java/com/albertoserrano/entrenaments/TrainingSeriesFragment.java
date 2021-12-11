package com.albertoserrano.entrenaments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TrainingSeriesFragment extends ListFragment{

    private ListView listView;
    private final ArrayList<String> deports = new ArrayList<>();

    public TrainingSeriesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();

        for(int i=0; i<Entrenament.entrenaments.length; i++){
            deports.add(Entrenament.entrenaments[0].toString());
        }
        setListAdapter(new ArrayAdapter<String>(getActivity(), R.layout.fragment_training_series, deports));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_training_series, container, false);


        return view;
    }

    static interface Listener{
        void itemClicked(long id);
    };
}