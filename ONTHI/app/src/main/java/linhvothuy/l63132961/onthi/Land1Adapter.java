package linhvothuy.l63132961.onthi;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Land1Adapter extends RecyclerView.Adapter<Land1Adapter.ItemHolder> {
    Context context;
    ArrayList<Land1> lsDanhsach;

    public Land1Adapter(Context context, ArrayList<Land1> lsDanhsach) {
        this.context = context;
        this.lsDanhsach = lsDanhsach;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vItem = LayoutInflater.from(context).inflate(R.layout.item_land,parent,false);
        return new ItemHolder(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        Land1 landHienthi =lsDanhsach.get(position);
        String caption = landHienthi.getCaptionland();
        String image = landHienthi.getImageland();

        holder.tvCap.setText(caption);
        int Image =context.getResources().getIdentifier(image,"mipmap",context.getPackageName());
        holder.ivLand.setImageResource(Image);
    }

    @Override
    public int getItemCount() {
        return lsDanhsach.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCap;
        ImageView ivLand;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tvCap = itemView.findViewById(R.id.textViewCaption);
            ivLand = itemView.findViewById(R.id.imageViewLand);
        }

        @Override
        public void onClick(View v) {
            int vitriduowcClick = getAdapterPosition();
            Land1 phantuduocClick =lsDanhsach.get(vitriduowcClick);
            //Lấy thông tin
            String ten = phantuduocClick.getCaptionland();
            String tenfile = phantuduocClick.getImageland();
            //Toast
            String chuoithongbao = "Bạn vừa chọn" + ten;
            Toast.makeText(v.getContext(),chuoithongbao,Toast.LENGTH_LONG).show();
        }
    }
}
