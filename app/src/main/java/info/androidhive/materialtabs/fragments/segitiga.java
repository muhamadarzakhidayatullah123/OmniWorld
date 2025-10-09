package info.androidhive.materialtabs.fragments;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class segitiga extends AppCompatActivity {
    EditText a;
    EditText t;
    Button hitung;
    Button keliling;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segitiga);
        a = (EditText)findViewById(R.id.alas);
        t = (EditText)findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.button);
        keliling = (Button) findViewById(R.id.buttonkeliling);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (t.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

        hasil = (TextView)findViewById(R.id.txt_hasil);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (t.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
        }
                else{
            String isipanjang = a.getText().toString();
            String isilebar = t.getText().toString();
            double a = Double.parseDouble(isipanjang);
            double t = Double.parseDouble(isilebar);
            double hs = KelilingSegitiga(a,t);
            String output = String.valueOf(hs);
            hasil.setText(output.toString());
        }

    }
        });
    }


    public double LuasSegitiga(double a, double t) {
        return  0.5*a*t;}
        public double KelilingSegitiga(double a, double t) {
        return  a+2*t;
    }
}



