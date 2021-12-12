package com.example.hf4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdatoAdapter  {
    private Activity mContext;
    private List<Adatok> mContacts;


    public AdatoAdapter(Activity mContext, List<Adatok> mContacts) {
        this.mContext = mContext;
        this.mContacts = mContacts;
    }

    @NonNull
    public AdatoAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new VH(itemView, mContext);
    }

    public void onBindViewHolder(@NonNull AdatoAdapter.VH holder, int position) {
        Adatok contact = mContacts.get(position);
    }

    public int getItemCount() {
        return mContacts.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        View rowView;

        ImageView imgFlag = rowView.findViewById(R.id.zaszlok);
        TextView twCurrency = rowView.findViewById(R.id.symbol);
        TextView twExtraInformation = rowView.findViewById(R.id.symbolname);
        TextView twBuyValue = rowView.findViewById(R.id.cumpara);
        TextView twSellValue = rowView.findViewById(R.id.vinde);

        public VH(View itemView, final Context context) {
            super(itemView);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Adatok contact = (Adatok)v.getTag();
                    if (contact != null) {

                    }
                }
            });
        }
    }
}
