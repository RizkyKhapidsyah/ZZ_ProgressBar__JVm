package com.rk.pb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar PB_1_IDJAVA, PB_2_IDJAVA;
    Button B_1_IDJAVA, B_2_IDJAVA;
    int Progresss = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inisialisasi ProgressBar */
        PB_1_IDJAVA = findViewById(R.id.PB_1_IDXML);
        PB_2_IDJAVA = findViewById(R.id.PB_2_IDXML);
        B_1_IDJAVA = findViewById(R.id.B_1_IDXML);
        B_2_IDJAVA = findViewById(R.id.B_2_IDXML);

        PB_1_IDJAVA.setVisibility(View.GONE);
    }

    public void PijitanUntukProgressBar1(View Tampil) {
        /* ProgressBar Atas Terlihat Ketika Button ini Di Klik */
        PB_1_IDJAVA.setVisibility(View.VISIBLE);
    }

    public void PijitanUntukProgressBar2(View Tampil) {
        /* Method untuk mengatur nilai value progress yang dimulai dari 0 */
        aturValueProgress(Progresss);
    }

    private void aturValueProgress(final int RizkyKhapidsyah) {
        PB_2_IDJAVA.setProgress(RizkyKhapidsyah);
        Thread T = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException PesanError) {
                    PesanError.printStackTrace();
                }
                aturValueProgress(RizkyKhapidsyah + 10);
            }
        });
        T.start();
    }

}
