package com.example.kiit.fitness1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by kiit on 17/7/17.
 */

public class Favourites_Adapter extends RecyclerView.Adapter<Favourites_Adapter.MyViewHolder>
{
    Context context;
    ArrayList<information> data;
    LayoutInflater inflater;
    public Favourites_Adapter(Context context, ArrayList<information> data)
    {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public Favourites_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= inflater.inflate(R.layout.single_row,parent,false);
        Favourites_Adapter.MyViewHolder holder=new Favourites_Adapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Favourites_Adapter.MyViewHolder holder, int position)
    {
        holder.textView.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).imageId);
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView textView;
        ImageView imageView;
        public MyViewHolder(View itemView)
        {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.textView);
            imageView= (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {
         int position=getAdapterPosition();
            Intent intent=new Intent(context,Inner_Favourites_Activity.class);
            intent.putExtra("position",position);
            Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            context.startActivity(intent);
        }
    }
}
