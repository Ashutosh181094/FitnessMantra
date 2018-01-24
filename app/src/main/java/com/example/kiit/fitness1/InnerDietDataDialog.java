package com.example.kiit.fitness1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class InnerDietDataDialog extends AppCompatActivity {

    String innerdietitem = "";
    ListView listView;
    String dietInfo[];
    TextView textView;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_diet_data_dialog);
        listView = (ListView) findViewById(R.id.listviewinnerdata);
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        InnerDataActionbarTitle innerdietdata = new InnerDataActionbarTitle();
        innerdietitem = innerdietdata.getActionBarTitle();
        linearLayout= (LinearLayout) findViewById(R.id.linearview);
        YoYo.with(Techniques.FadeIn).duration(700).playOn(linearLayout);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        getWindow().setLayout((int) (((double) dm.widthPixels) * 0.9d), (int) (((double) dm.heightPixels) * 0.4d));
        textView= (TextView) findViewById(R.id.textView6);
        if(innerdietitem=="Asparagus")
        {
            textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Asparagus);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Artichoke Heart")
        {
            textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.ArtichokeHeart);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Spinach")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Spinach);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Carrot")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Carrot);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Celery")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Celery);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Broccoli")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Broccoli);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Zucchini")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Zucchini);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Cauliflower")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Cauliflower);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Parsley")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Parsley);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Brinjal")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Brinjal);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Spring Onion")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.SpringOnion);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Peas")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.peas);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Potato")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Potato);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }

        if(innerdietitem=="Apple")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Apple);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Avocado")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Avacado);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Mulberry")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Mulberry);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Papaya")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Papaya);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Peach")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Peach);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Plum")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Plum);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Guava")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Guava);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Apricot")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Apricot);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Fig")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Fig);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Banana")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Banana);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Strawberry")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Strawberry);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Muskmelon")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Muskmelon);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Lychee")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Lychee);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Kiwi")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.kiwi);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Watermelon")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Watermelon);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Chiken Breast")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.ChickenBreast);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Pork")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Pork);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Lamb and Mutton")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Lamb);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Rabbit")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Rabbit);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Veal")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Veal);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Bacon")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Bacon);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Cheese")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Cheese);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Condensed Milk")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.CondensedMilk);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Whipped Cream")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.WhippedCream);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Evaporated Milk")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.EvaporatedMilk);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Egg")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Egg);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Green Yoghurt")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.GreenYoghurt);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Paneer")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Paneer);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Almonds")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Almonds);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Cashewnuts")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Cashewnuts);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Hazelnuts")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Hazelnuts);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Pecans")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Pecans);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Pine Nuts")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Pinenuts);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Pumpkin seeds")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.PumpkinSeeds);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Dates")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Dates);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Sunflower Seeds")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Sunflower);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Dried Apricot")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.DriedApricot);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Dried Figs")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.DriedFigs);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Crab")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Crab);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Crayfish")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Crayfish);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Shrimp")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Shrimp);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Clam")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Clam);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Lobster")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Lobster);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Oyster")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Oyster);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Salmon")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Salmon);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Sardine")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Sardine);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Tuna")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Tuna);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Mackerel")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Mackerel);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Prawn")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Prawn);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Coconut Oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.CoconutOil);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Olive Oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Oliveoil);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Macadamia Oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Macadamiaoil);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Sunflower Oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Sunfloweroil);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Avocado Oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Avocadooil);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Ghee")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Ghee);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Butter")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Butter);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Fish Oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Fishoil);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }
        else
        if(innerdietitem=="Peanut oil")
        {textView.setText(innerdietitem);
            Resources resources=getResources();
            dietInfo=resources.getStringArray(R.array.Potato);
            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,dietInfo);
            listView.setAdapter(adapter);
        }

    }
}

