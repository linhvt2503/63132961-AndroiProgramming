package linhvothuy.l63132961.linhck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class BookAdapter extends BaseAdapter {
    //Nguồn du lieu cho adapter
    ArrayList<BOOK> list;
    //context hoạt đongk
    Context context;
    //layout
    LayoutInflater inflater;

    public BookAdapter(ArrayList<BOOK> list, Context context) {
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        bookview view;
        if(convertView ==null){
            convertView=inflater.inflate(R.layout.list_item_book,null);
            view=new bookview();
            view.tvName=convertView.findViewById(R.id.bookNameTextView);
            view.tvPage=convertView.findViewById(R.id.pageCountTextView);
            view.tvGia=convertView.findViewById(R.id.priceTextView);
            view.tvDes=convertView.findViewById(R.id.descriptionTextView);
            convertView.setTag(view);
        }
        else {
            view=(bookview) convertView.getTag();
        }
        BOOK b=list.get(position);
        String bookname=b.getBookName();
        int bookpage = b.getPage();
        float bookPrice = b.getPrice();
        String bookDes = b.getDescription();

        view.tvName.setText("Tên sách: " + bookname);
        view.tvPage.setText("Số trang: " + bookpage);
        view.tvGia.setText("Đơn giá: " + bookPrice);
        view.tvDes.setText("Mô tả: " + bookDes);
        return convertView;
    }
    static class  bookview{
        TextView tvName, tvGia, tvDes, tvPage;
    }
}

