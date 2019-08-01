package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText number1;
    EditText number2;
    Button btnplus;
    Button btnminus;
    Button btnkali;
    Button btnbagi;
    TextView result;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_one, container, false);
        super.onCreate(savedInstanceState);
        number1 = view.findViewById(R.id.txtangka1);
        number2 = view.findViewById(R.id.txtAngka2);
        btnplus = view.findViewById(R.id.tettambah);
        btnminus = view.findViewById(R.id.tetkurang);
        btnkali = view.findViewById(R.id.tetkali);
        btnbagi = view.findViewById(R.id.textbagi);
        result = view.findViewById(R.id.text_view_hasil);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = number1.getText().toString();
                String angka2 = number2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();
                } else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(number1.getText().toString());
                    angkas2 = Double.parseDouble(number2.getText().toString());
                    hasill = angkas1 + angkas2;
                    result.setText("hasil dari " + angka1 + "+" + angka2 + "=" + hasill);
                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = number1.getText().toString();
                String angka2 = number2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();

                }
                else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(number1.getText().toString());
                    angkas2 = Double.parseDouble(number2.getText().toString());
                    hasill = angkas1 / angkas2;
                    if (angkas2 != 0) {

                        result.setText("hasil dari " + angka1 + ":" + angka2 + "=" + hasill);
                    }
                    else
                    {
                        Toast.makeText(getContext(), ": dilarang 0", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = number1.getText().toString();
                String angka2 = number2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();

                } else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(number1.getText().toString());
                    angkas2 = Double.parseDouble(number2.getText().toString());
                    hasill = angkas1 * angkas2;
                    result.setText("hasil dari " + angka1 + "x" + angka2 + "=" + hasill);
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = number1.getText().toString();
                String angka2 = number2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();

                } else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(number1.getText().toString());
                    angkas2 = Double.parseDouble(number2.getText().toString());
                    hasill = angkas1 - angkas2;
                    result.setText("hasil dari " + angka1 + "-" + angka2 + "=" + hasill);
                }

            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
