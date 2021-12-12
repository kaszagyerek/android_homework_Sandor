package com.example.hff7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
/*https://github.com/bumptech/glide*/
import java.time.Instant;
import java.util.ArrayList;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.VH> {

    private Activity contex;
    private ArrayList<Animal> listAn;
    private Instant Glide;

    public AnimalsAdapter(Activity contex, ArrayList<Animal> mAnimals) {
         this.contex = contex;
         this.listAn = mAnimals;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new VH(itemView, contex);
    }

    @Override
    public int getItemCount() {
        return listAn.size();
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Animal animal = listAn.get(position);
        holder.VIEW.setTag(animal);

        holder.namee.setText(animal.getName());
        holder.description.setText(animal.getDescription());

        Glide.with(contex).load(animal.getImage()).centerCrop().into(holder.swaprofile); // profilkepek valtasa
    }



    public class VH extends RecyclerView.ViewHolder {

        public View VIEW;
        public ImageView swaprofile;
        public TextView namee;
        public TextView description;

        public VH(@NonNull View itemView, final Context context) {
            super(itemView);
            this.VIEW = itemView;
            this.swaprofile = itemView.findViewById(R.id.swapimage);
            this.namee = itemView.findViewById(R.id.swapname);
            this.description = itemView.findViewById(R.id.swapdesc);
        }
    }
}
