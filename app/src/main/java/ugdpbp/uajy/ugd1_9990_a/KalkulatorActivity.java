package ugdpbp.uajy.ugd1_9990_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    private EditText input1, input2;
    private Button buttonKembali, tambah, kurang, bagi, kali;
    private TextView hasil;
    private Float a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        input1 = (EditText) findViewById(R.id.Input1);
        input2 = (EditText) findViewById(R.id.Input2);
        hasil = (TextView) findViewById(R.id.HasilCal);

        tambah = (Button) findViewById(R.id.buttonTambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.valueOf(input1.getText().toString());
                b = Float.valueOf(input2.getText().toString());

                hasil.setText(functionTambah(a,b));
            }
        });

        kurang = (Button) findViewById(R.id.buttonKurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.valueOf(input1.getText().toString());
                b = Float.valueOf(input2.getText().toString());

                hasil.setText(functionKurang(a,b));
            }
        });

        kali = (Button) findViewById(R.id.buttonKali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.valueOf(input1.getText().toString());
                b = Float.valueOf(input2.getText().toString());

                hasil.setText(functionKali(a,b));
            }
        });

        bagi = (Button) findViewById(R.id.buttonBagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.valueOf(input1.getText().toString());
                b = Float.valueOf(input2.getText().toString());

                hasil.setText(functionBagi(a,b));
            }
        });

        buttonKembali = (Button) findViewById(R.id.buttonKembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KalkulatorActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    String functionTambah(float angka1, float angka2){
        float hasil_kalkulasi= angka1 + angka2;

        return String.valueOf(hasil_kalkulasi);
    }

    String functionKurang(float angka1, float angka2){
        float hasil_kalkulasi= angka1 - angka2;

        return String.valueOf(hasil_kalkulasi);
    }

    String functionKali(float angka1, float angka2){
        float hasil_kalkulasi= angka1 * angka2;

        return String.valueOf(hasil_kalkulasi);
    }

    String functionBagi(float angka1, float angka2){
        float hasil_kalkulasi= (float) angka1 / angka2;

        return String.valueOf(hasil_kalkulasi);
    }
}