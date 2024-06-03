package linhvothuy.l63132961.linhck;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {
    EditText editText_M;
    EditText editText_Cm;
    Button btnBiendoi;
    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        //tìm điều khi
        editText_M = viewCau1.findViewById(R.id.edtM);
        editText_Cm = viewCau1.findViewById(R.id.edtCm);
        btnBiendoi = viewCau1.findViewById(R.id.btndoi);

        btnBiendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dulieuM = editText_M.getText().toString();
                String dulieuCm = editText_Cm.getText().toString();
                //
                if(dulieuCm.isEmpty()) //user có nhập dữ liệu M cần đổi sang cm
                {
                    float soM = Float.parseFloat(dulieuM);
                    float ans = soM * 100;
                    String kq = String.valueOf(ans);
                    editText_Cm.setText(kq);
                    Toast.makeText(viewCau1.getContext(),"m -> cm", Toast.LENGTH_LONG).show();
                }else
                {
                    float soCm = Float.parseFloat(dulieuCm);
                    float ans = soCm / 100;
                    String kq = String.valueOf(ans);
                    editText_M.setText(kq);
                    Toast.makeText(viewCau1.getContext(),"cm -> m", Toast.LENGTH_LONG).show();
                }
            }
        });
        return viewCau1;

    }
}