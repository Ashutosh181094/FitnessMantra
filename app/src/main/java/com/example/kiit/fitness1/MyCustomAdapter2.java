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
 * Created by kiit on 17/6/17.
 */

public class MyCustomAdapter2 extends RecyclerView.Adapter<MyCustomAdapter2.MyViewHolder>
{
    Context context;
    ArrayList<information> data;
    LayoutInflater inflater;
    String posifirst="";

    public MyCustomAdapter2(Context context, ArrayList<information> data)
    {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.single_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyCustomAdapter2.MyViewHolder holder, int position) {
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
            textView= (TextView) itemView.findViewById(R.id.textView);
            imageView= (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v)
        {
            posifirst="";
            int position=getAdapterPosition();
            Intent intent=new Intent(context,Main3Activity.class);
            intent.putExtra("position",position);
            Position position1=new Position();
          int pos=position1.giveposition();
            posifirst=posifirst+pos+position;
            Toast.makeText(context, ""+posifirst, Toast.LENGTH_SHORT).show();
            Data data=new Data();
            String[] categories=data.send();
            InnerDataActionbarTitle mtitle=new InnerDataActionbarTitle();
            mtitle.positionle(position);
            mtitle.ActionBarTitle(categories);
            context.startActivity(intent);

        }

    }
}
