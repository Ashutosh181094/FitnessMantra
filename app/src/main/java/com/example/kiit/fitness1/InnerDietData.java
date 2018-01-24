package com.example.kiit.fitness1;

import java.util.ArrayList;

public class InnerDietData {

    static String [] Categories;

    public ArrayList<information> getdata(int position) {


        if (position == 0) {
            ArrayList<information> data1 = new ArrayList<>();
            int images[] = {
                    R.drawable.asparagus,
                    R.drawable.artichoke,
                    R.drawable.spinach,
                    R.drawable.carrot,
                    R.drawable.celery,
                    R.drawable.broccoli,
                    R.drawable.zucchini,
                    R.drawable.cauliflower,
                    R.drawable.parsley,
                    R.drawable.brinjal,
                    R.drawable.spring,
                    R.drawable.pea,
                    R.drawable.potato


            };

            Categories = new String[]{"Asparagus", "Artichoke Heart", "Spinach", "Carrot", "Celery", "Broccoli", "Zucchini", "Cauliflower","Parsley","Brinjal","Spring Onion","Peas","Potato"};
            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data1.add(current);

            }
            return data1;
        } else if (position == 1) {
            ArrayList<information> data2 = new ArrayList<>();

            int images[] = {
                    R.drawable.apple,
                    R.drawable.avocado,
                    R.drawable.mulberry,
                    R.drawable.papaya,
                    R.drawable.peach,
                    R.drawable.prunches,
                    R.drawable.guava,
                    R.drawable.apricot,
                    R.drawable.banana,
                    R.drawable.strawberry,
                    R.drawable.muskmelon,
                    R.drawable.litchii,
                    R.drawable.kiwi,
                    R.drawable.watermelon,

            };

            Categories = new String[]{"Apple","Avocado","Mulberry","Papaya","Peach","Plum","Guava","Apricot","Fig","Banana","Strawberry","Muskmelon","Lychee","Kiwi","Watermelon"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data2.add(current);
            }
            return data2;
        } else if (position == 2) {
            ArrayList<information> data3 = new ArrayList<>();
            int images[] = {
                    R.drawable.chicken,
                    R.drawable.pork,
                    R.drawable.lamb,
                    R.drawable.rabbit,
                    R.drawable.veal,
                    R.drawable.bacon,
                    R.drawable.beef,
                    R.drawable.buffalo,

            };
            Categories = new String[]{"Chicken Breast","Pork","Lamb and Mutton","Rabbit","Veal","Bacon","Beef","Buffalo"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data3.add(current);

            }
            return data3;
        } else if (position == 3) {
            ArrayList<information> data4 = new ArrayList<>();
            int images[] = {
                    R.drawable.cheese,
                    R.drawable.condensedmilk,
                    R.drawable.whippedcream,
                    R.drawable.evaporatedmilk,
                    R.drawable.egg,
                    R.drawable.greenyoghurt,
                    R.drawable.paneer,


            };
            Categories = new String[]{"Cheese","Condensed Milk","Whipped Cream","Evaporated Milk","Egg","Green Yoghurt","Paneer"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data4.add(current);

            }
            return data4;
        } else if (position == 4) {
            ArrayList<information> data5 = new ArrayList<>();
            int images[] = {
                    R.drawable.almonds,
                    R.drawable.cashewnuts,
                    R.drawable.hazelnuts,
                    R.drawable.pinenuts,
                    R.drawable.pumpkinseeds,
                    R.drawable.dates,
                    R.drawable.sunfloweroil,
                    R.drawable.driedapricot,
                    R.drawable.driedfigs,
                    R.drawable.walnuts,


            };
            Categories = new String[]{"Almonds","Cashewnuts","Hazelnuts","Pine Nuts","Pumpkins seeds","Dates","Sunflower Seeds","Dried Apricot","Dried Figs","Walnut"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data5.add(current);

            }
            return data5;
        } else if (position == 5) {
            ArrayList<information> data5 = new ArrayList<>();
            int images[] = {
                    R.drawable.crab,
                    R.drawable.crayfish,
                    R.drawable.shrimp,
                    R.drawable.lobster,
                    R.drawable.oyster,
                    R.drawable.salmon,
                    R.drawable.sardine,
                    R.drawable.tuna,
                    R.drawable.mackerel,
                    R.drawable.prawn,


            };
            Categories = new String[]{"Crab", "Crayfish", "Shrimp", "Lobster", "Oyster", "Salmon", "Sardine", "Tuna", "Mackerel", "Prawn"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data5.add(current);

            }
            return data5;
        }
        else

        {
            ArrayList<information> data6 = new ArrayList<>();
            int images[] = {
                    R.drawable.coconutoil,
                    R.drawable.oliveoil,
                    R.drawable.macadamia,
                    R.drawable.sunfloweroil,
                    R.drawable.avocadooil,
                    R.drawable.ghee,
                    R.drawable.butter,
                    R.drawable.fishoil,
                    R.drawable.peanut

            };
            Categories = new String[]{"Coconut Oil","Olive Oil","Macadamia Oil","Sunflower Oil","Avocado Oil","Ghee","Butter","Fish Oil","Peanut Oil"};
            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data6.add(current);

            }
            return data6;
        }
    }
    public static String[] send() {
        return Categories;
    }

}
