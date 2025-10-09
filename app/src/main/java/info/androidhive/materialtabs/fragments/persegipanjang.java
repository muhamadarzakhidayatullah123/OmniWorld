package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class persegipanjang extends AppCompatActivity {
    EditText p, l;
    Button hitung;
    TextView hasil;
    Button keliling;
    private Toolbar toolbar;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);
        p = (EditText) findViewById(R.id.panjang);
        l = (EditText) findViewById(R.id.lebar);

        toolbar = findViewById((R.id.toolbar));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        hitung = (Button) findViewById(R.id.button);
        keliling = (Button) findViewById(R.id.buttonkeliling);
        hasil = (TextView) findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (p.length() == 0 && l.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan lebar tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (l.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = LuasPersegiPanjang(p, l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

        hasil = (TextView) findViewById(R.id.txt_hasil);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (p.length() == 0 && l.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan lebar tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (l.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = KelilingPersegiPanjang(p, l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });
    }

    public double LuasPersegiPanjang(double p, double l) {
        return p * l;
    }

    public double KelilingPersegiPanjang(double p, double l) {
        return 2 * p + 2 * l;
    }

    public boolean onSupportNavigateUp() {

        finish();
        return true;
    }
}


