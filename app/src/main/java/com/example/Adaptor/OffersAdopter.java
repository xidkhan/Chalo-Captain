package com.example.Adaptor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Model.OfferRowModel;
import com.example.chalo_captain.R;
import com.example.chalo_captain.OfferDetails;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class OffersAdopter extends RecyclerView.Adapter<OffersAdopter.MyHolder> {

    Context context;
    List<OfferRowModel> offerModelList;

    public OffersAdopter(Context context, List<OfferRowModel> offerModelList) {
        this.context = context;
        this.offerModelList = offerModelList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OffersAdopter.MyHolder holder, int position) {

        final OfferRowModel temp = offerModelList.get(position);

        String name = offerModelList.get(position).getName();
        String message = offerModelList.get(position).getMessage();
        int image = offerModelList.get(position).getImage();

        holder.name.setText(name);
        holder.message.setText(message);
        holder.imageView.setImageResource(R.drawable.profile);

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, OfferDetails.class);
                intent.putExtra("name",temp.getName());
                intent.putExtra("message",temp.getMessage());
                intent.putExtra("image",temp.getImage());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return offerModelList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CircleImageView imageView;
        TextView name, message;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.message);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
//            Toast.makeText(context, "position"+position,Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(context, RequestDetails.class);
//            intent.putExtra("name",modelList.get(position).getName());

//            context.startActivity(intent);

        }
    }
}
