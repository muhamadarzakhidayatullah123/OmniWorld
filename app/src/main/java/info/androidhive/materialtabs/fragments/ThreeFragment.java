package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import info.androidhive.materialtabs.R;


public class ThreeFragment extends Fragment{
    private RecyclerView recyclerView;
    private adaptor adaptor;
    private ArrayList<modelbangunruang> mahasiswaArrayList;

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        addData();

        recyclerView = view.findViewById(R.id.aaa);

        adaptor = new adaptor(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adaptor);
        return view;
    }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new modelbangunruang("kubus", "luas 6 x (sisi x sisi)"));
        mahasiswaArrayList.add(new modelbangunruang("bola", "Volume bola = 4/3 x π x r3"));
        mahasiswaArrayList.add(new modelbangunruang("tabung", "Volume = luas alas x tinggi atau V = π x r2 x t"));
        mahasiswaArrayList.add(new modelbangunruang("kerucut", "Volume kerucut = 1/3 x π x r2 x t."));


    }



}
