package com.startng.newsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class HeadlinesAdapter extends RecyclerView.ViewHolder {
    View mView;
    TextView tv_title, tv_time;
    CardView cardView;


    public HeadlinesAdapter(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
        tv_time = mView.findViewById(R.id.note_time);
        tv_title = mView.findViewById(R.id.note_title);
        cardView = mView.findViewById(R.id.cardView);

    }

    public void setNoteTitle(String title){
        tv_title.setText(title);

    }

    public void setNoteTime(String time){
        tv_time.setText(time);

    }

}
//    private String[] mDataset;
//    private Context mContext;
//
//    // Provide a suitable constructor (depends on the kind of dataset)
//    public HeadlinesAdapter(Context context, String[] myDataset) {
//        mDataset = myDataset;
//        mContext = context;
//    }
//
//    // Create new views (invoked by the layout manager)
//    @Override
//    public HeadlinesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
//                                                     int viewType) {
//        // create a new view
//        TextView v = (TextView) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.headline_item, parent, false);
//        MyViewHolder vh = new MyViewHolder(v);
//        return vh;
//    }
//
//    // Replace the contents of a view (invoked by the layout manager)
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, final int position) {
//        // - get element from your dataset at this position
//        // - replace the contents of the view with that element
//        holder.textView.setText(mDataset[position]);
//        holder.textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(mContext, MainActivity.class);
//                intent.putExtra("headline", mDataset[position]);
//                mContext.startActivity(intent);
//            }
//        });
//    }
//
//    // Return the size of your dataset (invoked by the layout manager)
//    @Override
//    public int getItemCount() {
//        return mDataset.length;
//    }
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//        // each data item is just a string in this case
//        public TextView textView;
//
//
//        public MyViewHolder(TextView v) {
//            super(v);
//            textView = v;
//        }
//    }
//}