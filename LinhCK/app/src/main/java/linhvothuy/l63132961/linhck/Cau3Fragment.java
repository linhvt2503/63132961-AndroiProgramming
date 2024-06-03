package linhvothuy.l63132961.linhck;

import static android.content.Context.MODE_PRIVATE;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public Cau3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
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
//        // Bước 0. Tạo file cơ sở dữ liệu
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLBook.db",MODE_PRIVATE,null);
//        //buoc 1. tạo bảng
//            //câu lệnh tạo bảng
//        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS BOOKS;";
//
//        String sqlTaoBang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY,"+
//                                                "BookName Text," +
//                                                "Page integer," +
//                                                "Price Float," +
//                                                "Description Text);";
//        //thưc hiện sql
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBang);
//        //Thêm dữ liệu
//        String sqlthem1 = "INSERT INTO BOOKS VALUES(1,'Java',100,99000,'Sách về Java');";
//        String sqlthem2 = "INSERT INTO BOOKS VALUES(2,'KKK',100,9000,'Truyện cười');";
//        String sqlthem3 = "INSERT INTO BOOKS VALUES(3,'Loppy',50,99000,'Sách về nhân vật hoạt hình');";
//        String sqlthem4 = "INSERT INTO BOOKS VALUES(4,'TV',100,89000,'Sách về nhân sinh');";
//
//        db.execSQL(sqlthem1);
//        db.execSQL(sqlthem2);
//        db.execSQL(sqlthem3);
//        db.execSQL(sqlthem4);
//        // Để quan sát trực quan file .db ? ==> Dùng ứng dụng DB Browser for SQLite
//        // Để mở được, ta file save file từ điện thoại ra đĩa cứng
//       // Ta đóng lại để check
//        db.close();
        // TRUY VẤN SELECT
        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLBook.db",MODE_PRIVATE,null);
        //B2. Thực thi câu lệnh select
        String sqlSelect="Select*from BOOKS;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        // B3: Đổ vào biến nào đó để xử lý
        // 3.1. Xây dựng model/class cho bảng Books, vi dụ: Book.java
        // 3.2. Tạo biến ArrayList<Book> dsSach;
        ArrayList<BOOK> dsSach = new ArrayList<BOOK>();
 //       cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên
        //3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            String idSach = cs.getString(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            // Tạo một đối tượng sách và thêm vào danh sách
            BOOK b = new BOOK(idSach,tenSach,soTrang,gia,mota);
            dsSach.add(b);
        }
        //B4, Hiện lên listview, recylerview,..
        // để cho nhanh, ở đây thầy chỉ hiện tên sách
        View viewcau3= inflater.inflate(R.layout.fragment_cau3, container, false);
        ListView listView=viewcau3.findViewById(R.id.listviewcau3);
        BookAdapter adapter=new BookAdapter(dsSach,getActivity());
        listView.setAdapter(adapter);
        return viewcau3;
    }
}