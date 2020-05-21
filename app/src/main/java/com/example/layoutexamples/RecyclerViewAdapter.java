package com.example.layoutexamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<cardmodel> arrayList;//StoreNotice=ListData,mdata=listData.

    public RecyclerViewAdapter(Context mcontext,List<cardmodel> arrayList) {
        this.mcontext =  mcontext;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;   //=LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        LayoutInflater minflater=LayoutInflater.from(mcontext);
        view=minflater.inflate(R.layout.recyclerview_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        cardmodel sn=arrayList.get(position);
        holder.user_name.setText(sn.getUser_name());

        holder.message.setText(sn.getMessage());

        holder.time.setText(sn.getTime());


        holder.profile_pic.setImageResource(sn.getProfile_pic());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_pic;

        TextView user_name, message, time;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profile_pic = itemView.findViewById(R.id.profile_pic);

            user_name = itemView.findViewById(R.id.user_name);

            message = itemView.findViewById(R.id.message);

            time = itemView.findViewById(R.id.time);



        }
    }

}
