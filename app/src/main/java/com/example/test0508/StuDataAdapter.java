package com.example.test0508;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StuDataAdapter extends RecyclerView.Adapter<StuDataAdapter.ViewHolder>{
    private ImageView img;
    private  TextView tvname1;
    private TextView tvheight1;
    private List<StuData> stuDataList;

    public StuDataAdapter(List<StuData> stuDataList) {
        this.stuDataList = stuDataList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.tvPic);
            tvname1 = itemView.findViewById(R.id.tvName);
            tvheight1 = itemView.findViewById(R.id.tvHeight);
        }
    }

    @NonNull
    @Override
    public StuDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = View.inflate(context, R.layout.activity_my_data_view, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StuDataAdapter.ViewHolder holder, int position) {
        StuData stuData = stuDataList.get(position);
        img.setImageResource(stuData.getId());
        tvname1.setText(stuData.getName());
        tvheight1.setText(stuData.getHeight());
    }

    @Override
    public int getItemCount() {
        return stuDataList.size();
    }
}
