package ntu.linh63132961.cau3_myprofile;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button xemChiTiet = findViewById(R.id.btn);
        View.OnClickListener bolangnghe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }
}