package linhvothuy.l63132961.onthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau3Fragment extends Fragment {
    Land1Adapter landAdapter;
    ArrayList<Land1> list;
    RecyclerView recyclerView;
    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance() {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<Land1>(); //KHởi tạo list
        Land1 land = new Land1("heo1","Con mèo đáng yêu");
        list.add(land);
        list.add(new Land1("heo2", "Con mèo đáng yêu vô cùng tận"));
        list.add(new Land1("heo3","Con mèo đáng yêu số 1"));
        list.add(new Land1("heo4","quá tuyệt vời"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerView = viewCau3.findViewById(R.id.ryc);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(viewCau3.getContext());
        recyclerView.setLayoutManager(layoutManager);
        landAdapter = new Land1Adapter(viewCau3.getContext(),list);
        recyclerView.setAdapter(landAdapter);
        return viewCau3;
    }
}