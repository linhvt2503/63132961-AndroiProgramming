package linhvothuy.l63132961.linhck;

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
 * Use the {@link Cau2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau2Fragment extends Fragment {

    LandAdapter landAdapter;
    ArrayList<Land> list;
    RecyclerView recyclerView;
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
        list = new ArrayList<Land>();//khởi tạo list
        Land land = new Land("meo","Con mèo đáng yêu");
        list.add(land);
        list.add(new Land("meo1", "Con mèo đáng yêu vô cùng tận"));
        list.add(new Land("meo2","Con mèo đáng yêu số 1"));
        list.add(new Land("meo3","quá tuyệt vời"));
        list.add(new Land("meo","Baby Đuuuuudduuuu"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau2 = inflater.inflate(R.layout.fragment_cau2, container, false);
        recyclerView = viewCau2.findViewById(R.id.rcy);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(viewCau2.getContext());
        recyclerView.setLayoutManager(layoutManager);
        landAdapter = new LandAdapter(viewCau2.getContext(),list);
        recyclerView.setAdapter(landAdapter);
        return viewCau2;
    }
}