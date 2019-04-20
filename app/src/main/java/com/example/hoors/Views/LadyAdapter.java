package com.example.hoors.Views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hoors.Entities.Lady;
import com.example.hoors.R;

import java.util.List;

public class LadyAdapter extends RecyclerView.Adapter<LadyAdapter.LadyHolder> {

   private Context context ;
   private List<Lady> myLadyData ;
    private ItemClickListener mClickListener;

    public LadyAdapter(Context context, List<Lady> myLadyData) {
        this.context = context;
        this.myLadyData = myLadyData;
    }

    @NonNull
    @Override
    public LadyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview = LayoutInflater.from(context).inflate(R.layout.row_item,viewGroup,false);
        return  new LadyHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull LadyHolder ladyHolder, int i) {
        Lady data = myLadyData.get(i);
        ladyHolder.ladyNameTextview.setText(data.name);

    }

    @Override
    public int getItemCount() {
        return myLadyData.size();
    }

    Lady  getItem(int id) {
        return myLadyData.get(id);
    }



    class  LadyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView ladyNameTextview;
        LinearLayout parentLayout ;


        public LadyHolder(@NonNull View itemView) {
            super(itemView);
            ladyNameTextview=itemView.findViewById(R.id.lady_name_textview);
            parentLayout=itemView.findViewById(R.id.parentlayout);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}
