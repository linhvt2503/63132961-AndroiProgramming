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

public class MainActivity extends AppCompatActivity{
    double v1, v2;
    Double ans ;
    EditText editText1;
    EditText editText2;
    Button nutCong, nutTru, nutNhan, nutChia, nutMu2, nutPi, nutLog10,
            nutAm, nutPhantram, nutPhay, nutBang, nutAc,
            nut1, nut2, nut3, nut4, nut5, nut6, nut7, nut8, nut9, nut0;
    Boolean cong=false, tru=false, nhan=false, chia=false,
            ptram=false,am=false,mu2=false,log10=false,pi=false;
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
        nutLog10 = (Button) findViewById(R.id.btnLog10);
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
                v1 = Double.parseDouble(editText1.getText().toString());
                nutFalse();
                cong = true;
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                nutFalse();
                tru = true;
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                nutFalse();
                nhan = true;
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                nutFalse();
                chia = true;
            }
        });
        nutMu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                ans = v1 * v1;
                nutBang.setEnabled(false);
                editText2.setText(ans.toString());
                nutFalse();
            }
        });

        nutPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                ans = v1 * 3.14;
                nutBang.setEnabled(false);
                editText2.setText(ans.toString());
                nutFalse();
            }
        });
        nutPhantram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                ans = v1 * 0.01;
                nutBang.setEnabled(false);
                editText2.setText(ans.toString());
                nutFalse();
            }
        });
        nutAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                ans = v1 * (-1);
                nutBang.setEnabled(false);
                editText2.setText(ans.toString());
                nutFalse();
            }
        });
        nutLog10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editText1.getText().toString());
                ans = Math.log10(v1);
                nutBang.setEnabled(false);
                editText2.setText(ans.toString());
                nutFalse();
            }
        });
        nutAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
            }
        });
        nutBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Double.parseDouble(editText1.getText().toString());
                if(cong){
                    ans = v1 + v2;
                }else if (tru){
                    ans = v1 - v2;
                } else if (nhan) {
                    ans = v1 * v2;
                } else if (chia) {
                    ans = v1 / v2;
                }else ans = ans + 0;
                editText2.setText(ans.toString());
                nutBang.setEnabled(false);
            }
        });
    }
    public void nutFalse(){
        nutCong.setEnabled(false);
        nutTru.setEnabled(false);
        nutNhan.setEnabled(false);
        nutChia.setEnabled(false);
        editText1.setText("");
    }
}