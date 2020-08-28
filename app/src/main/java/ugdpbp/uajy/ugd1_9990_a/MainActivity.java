package ugdpbp.uajy.ugd1_9990_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Button btnMenu = (Button) findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String choice = "";

                int radioId = radioGroup.getCheckedRadioButtonId();
                findRadioButton(radioId);

            }
        });

    }

    private void findRadioButton(int radioId) {
        Intent intent;
        switch  (radioId) {
            case R.id.radioProfil :
                intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
                break;

            case R.id.radioKalkulator :
                intent = new Intent(MainActivity.this, KalkulatorActivity.class);
                startActivity(intent);
                break;
        }
    }

}