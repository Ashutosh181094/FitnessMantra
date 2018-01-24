package com.example.kiit.fitness1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kiit on 30/6/17.
 */


public class MyDietAdapter extends RecyclerView.Adapter<MyDietAdapter.MyViewHolder> {
    Context context;
    ArrayList<information> data;
    LayoutInflater inflater;

    public  MyDietAdapter(Context context, ArrayList<information> data)
    {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public  MyDietAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.single_diet_item,parent,false);
        MyDietAdapter.MyViewHolder holder=new  MyDietAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( MyDietAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.textcardview);
            imageView= (ImageView) itemView.findViewById(R.id.imagecardview);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {

            int position=getAdapterPosition();
            Intent intent=new Intent(context,Innerdiet.class);
            intent.putExtra("position",position);
            context.startActivity(intent);
        }
    }
}
