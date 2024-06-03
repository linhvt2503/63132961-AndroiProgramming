package linhvothuy.l63132961.linhck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandAdapter extends RecyclerView.Adapter<LandAdapter.ItemHolder> {
    Context context;
    ArrayList<Land> lsData;

    public LandAdapter(Context context, ArrayList<Land> lsData) {
        this.context = context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vItem = LayoutInflater.from(context).inflate(R.layout.item_land,parent,false);
        return new ItemHolder(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        Land landHienthi = lsData.get(position);
        String caption = landHienthi.getLandCap();
        String tenAnh = landHienthi.getImageland();

        holder.tvCap.setText(caption);
        int image = context.getResources().getIdentifier(tenAnh,"mipmap",context.getPackageName());
        holder.ivLand.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCap;
        ImageView ivLand;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tvCap = itemView.findViewById(R.id.textViewCaption);
            ivLand = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int vtriduocClick = getAdapterPosition();
            Land phantuduocclick = lsData.get(vtriduocClick);
            //bóc thông tin
            String ten = phantuduocclick.getLandCap();
            String tenfile = phantuduocclick.getImageland();
            //toat
            String chuoithongbao = "Bạn vừa chọn" + ten;
            Toast.makeText(v.getContext(), chuoithongbao,Toast.LENGTH_LONG).show();
        }
    }
}
