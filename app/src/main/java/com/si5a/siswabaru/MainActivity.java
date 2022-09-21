package com.si5a.siswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaring the variables
    EditText etNoDaftar, etNama;
    Button btnDaftar;
    String noPendaftaran, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting the id from activity_main
        etNoDaftar = findViewById(R.id.et_no_daftar);
        etNama = findViewById(R.id.et_nama);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noPendaftaran = etNoDaftar.getText().toString();
                nama = etNama.getText().toString();

                if(noPendaftaran.trim().equals("")){
                    etNoDaftar.setError("Isi dulu ya gan");
                }

                else if(nama.trim().equals("")){
                    etNama.setError("Isi dulu gan mengoke?");
                }

                else{
                    Toast.makeText(MainActivity.this, "Pendaftaran Antum yang bernama " + nama  + " Berhasil!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}