package com.example.kiit.fitness1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kiit on 1/7/17.
 */

public class InnerDietAdapter  extends RecyclerView.Adapter<InnerDietAdapter.MyViewHolder>{
    Context context;
    ArrayList<information> data;
    LayoutInflater inflater;

    public  InnerDietAdapter(Context context, ArrayList<information> data)
    {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public  InnerDietAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.single_diet_item,parent,false);
        InnerDietAdapter.MyViewHolder holder=new  InnerDietAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(InnerDietAdapter.MyViewHolder holder, int position) {
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
            Intent intent=new Intent(context,InnerDietDataDialog.class);
            intent.putExtra("position",position);
            context.startActivity(intent);
            InnerDietData innerDietData=new InnerDietData();
            String Categories[]=innerDietData.send();
            InnerDataActionbarTitle innerdietdata=new InnerDataActionbarTitle();
            innerdietdata.positionle(position);
            innerdietdata.ActionBarTitle(Categories);

        }
    }
}
