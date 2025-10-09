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

public class persegi extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText s;
    Button hitung;
    TextView hasil;
    Button keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);

        toolbar = findViewById((R.id.toolbar));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        s = (EditText)findViewById(R.id.sisi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        keliling = (Button) findViewById(R.id.buttonkeliling);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0){
                    Toast.makeText(getApplication(),"SISI TIDAK BOLEH KOSONG",Toast.LENGTH_LONG).show();
                }

                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = LuasPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0){
                    Toast.makeText(getApplication(),"SISI TIDAK BOLEH KOSONG",Toast.LENGTH_LONG).show();
                }

                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = KelilingPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });


    }
public double LuasPersegi(double s){return s*s;}
public double KelilingPersegi(double s){return 4*s;}


    public  boolean onSupportNavigateUp() {

        finish();
        return true;
    }
}


