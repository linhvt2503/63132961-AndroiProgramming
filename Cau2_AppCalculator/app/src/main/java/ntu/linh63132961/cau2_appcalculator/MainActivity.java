package ntu.linh63132961.cau2_appcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button nutCong, nutTru, nutNhan, nutChia, nutMu2, nutPi, nutDel,
            nutAm, nutPhantram, nutPhay, nutBang, nutAc,
            nut1, nut2, nut3, nut4, nut5, nut6, nut7, nut8, nut9, nut0;
    double v1, v2, ans;
    boolean cong=false, tru= false, nhan=false, chia=false;
    public void timDieuKien(){
        editText1 =(EditText) findViewById(R.id.edt1);
        editText2 =(EditText) findViewById(R.id.edt2);
        nutAm = (Button) findViewById(R.id.btnAm);
        nutPhantram = (Button) findViewById(R.id.btnptram);
        nutPhay = (Button) findViewById(R.id.btnphay);
        nutBang = (Button) findViewById(R.id.btnbang);
        nutAc = (Button) findViewById(R.id.btnAC);
        nutCong = (Button) findViewById(R.id.btncong);
        nutTru = (Button) findViewById(R.id.btntru);
        nutNhan = (Button) findViewById(R.id.btnnhan);
        nutChia = (Button) findViewById(R.id.btnchia);
        nutPi = (Button) findViewById(R.id.btnpi);
        nutMu2 = (Button) findViewById(R.id.btnmu2);
        nutDel = (Button) findViewById(R.id.btnDel);
        nut0 = (Button) findViewById(R.id.btn0);
        nut1 = (Button) findViewById(R.id.btn1);
        nut2 = (Button) findViewById(R.id.btn2);
        nut3 = (Button) findViewById(R.id.btn3);
        nut4 = (Button) findViewById(R.id.btn4);
        nut5 = (Button) findViewById(R.id.btn5);
        nut6 = (Button) findViewById(R.id.btn6);
        nut7 = (Button) findViewById(R.id.btn7);
        nut8 = (Button) findViewById(R.id.btn8);
        nut9 = (Button) findViewById(R.id.btn9);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDieuKien();


        nut0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"0");

            }
        });
        nut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"1");
            }
        });
        nut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"2");
            }
        });
        nut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"3");
            }
        });
        nut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"4");
            }
        });
        nut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"5");
            }
        });
        nut6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"6");
            }
        });
        nut7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"7");
            }
        });
        nut8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"8");
            }
        });
        nut9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"9");
            }
        });
        nutPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+".");
            }
        });
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}