package linhvothuy.l63132961.onthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau2Fragment extends Fragment {
    //Khai báo đối tượng
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    public Cau2Fragment() {
        // Required empty public constructor
    }
    public static Cau2Fragment newInstance() {
        Cau2Fragment fragment = new Cau2Fragment();
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
        View viewCau2 = inflater.inflate(R.layout.fragment_cau2,container,false);
        editTextSo1 = viewCau2.findViewById(R.id.edtSo1);
        editTextSo2 = viewCau2.findViewById(R.id.edtSo2);
        editTextKQ = viewCau2.findViewById(R.id.edtKQ);

        nutCong = viewCau2.findViewById(R.id.btnCong);
        nutTru = viewCau2.findViewById(R.id.btnTru);
        nutNhan = viewCau2.findViewById(R.id.btnNhan);
        nutChia = viewCau2.findViewById(R.id.btnChia);
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float hieu = A + B;
                //in kq ra
                String Kq = String.valueOf(hieu);
                editTextKQ.setText(Kq);
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float hieu = A - B;
                //in kq ra
                String Kq = String.valueOf(hieu);
                editTextKQ.setText(Kq);
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float tich = A * B;
                //in kq ra
                String Kq = String.valueOf(tich);
                editTextKQ.setText(Kq);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float thuong = A / B;
                //in kq ra
                String Kq = String.valueOf(thuong);
                editTextKQ.setText(Kq);
            }
        });

        // Inflate the layout for this fragment
        return viewCau2;
    }
}