package info.androidhive.materialtabs.fragments;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;


public class TwoFragment extends Fragment{
    Button btnpersegi;
    Button btnpersegipanjang;
    Button btnsegitiga;
    Button btnlingkaran;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        btnpersegi = (Button) view.findViewById(R.id.btnpersegi);
        // Inflate the layout for this fragment
        btnpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), persegi.class);
                startActivity(in);
            }
        });
        btnpersegipanjang = (Button) view.findViewById(R.id.btnpersegipanjang);
        // Inflate the layout for this fragment
        btnpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), persegipanjang.class);
                startActivity(in);
            }
        });
        btnsegitiga = (Button) view.findViewById(R.id.btnsegitiga);
        // Inflate the layout for this fragment
        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), segitiga.class);
                startActivity(in);
            }
        });
        btnlingkaran = (Button) view.findViewById(R.id.btnlingkaran);
        // Inflate the layout for this fragment
        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), lingkaran.class);
                startActivity(in);
            }
        });

        return view;
    }

}



