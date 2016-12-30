package com.example.yeon.rererere;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Yeon on 2016. 12. 27..
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHoler> {

    ArrayList<Item> adapterItemList;
    Context context;


    public RecyclerAdapter(ArrayList<Item> adapterItemList, Context context) {
        super();
        this.adapterItemList = adapterItemList;
        this.context = context;
    }

    public void setAdapterItemList(ArrayList<Item> adapterItemList) {
        this.adapterItemList = adapterItemList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("MyTag", "onCreateViewHolder");
        return new ViewHoler(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_child,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHoler holder, int position) {
        Log.i("MyTag", "onBindViewHolder, position : " + Integer.toString(position));
//        holder.imageView.setImageResource(mItems.get(position).image);
     //   holder.textViewLocation.setText(adapterItemList.get(position).location);
      //  holder.textView.setText(adapterItemList.get(position).description);
        holder.ibtn1.setImageResource(R.drawable.aa);
        holder.ibtn2.setImageResource(R.drawable.beforecheck);
       // holder.ibtn2.setImageResource(R.drawable.aftercheck);
    }

    @Override
    public int getItemCount() {
        return adapterItemList.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textViewLocation;
        //ImageView imageView;
        ImageButton ibtn1,ibtn2;
        //boolean isImageChecked = false;

        public ViewHoler(final View itemView) {
            super(itemView);
          //  textView = (TextView) itemView.findViewById(R.id.info_text);
          //  textViewLocation = (TextView) itemView.findViewById(R.id.info_location);

            ibtn1 = (ImageButton)itemView.findViewById(R.id.imageButton1);
            ibtn2 = (ImageButton)itemView.findViewById(R.id.imageButton2);

            ibtn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"Big Picture",Toast.LENGTH_SHORT).show();
                }
            });

            ibtn2.setOnClickListener(new View.OnClickListener() {
               
                public void onClick(View v) {
                    Toast.makeText(context,"Small Picture",Toast.LENGTH_SHORT).show();
                        ibtn2.setImageResource(R.drawable.aftercheck);


                }
            });
        }

        public void setTextView(String data) {
            textView.setText(data);
        }
    }
}
