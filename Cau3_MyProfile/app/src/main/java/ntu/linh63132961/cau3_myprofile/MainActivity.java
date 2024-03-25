package ntu.linh63132961.cau3_myprofile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button xemChiTiet = (Button) findViewById(R.id.btn);
    TextView textView3 =(TextView) findViewById(R.id.txt3);
    TextView textView4 =(TextView) findViewById(R.id.txt4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xemChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText(textView3.getText()+"Lớp: 63CNTT.3");
                textView4.setText(textView4.getText()+"Trường: NTU");
            }
        });
    }
}