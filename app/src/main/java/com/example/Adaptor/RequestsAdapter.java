package com.example.Adaptor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Model.RequestRowModel;
import com.example.chalo_captain.R;
import com.example.chalo_captain.RequestDetails;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RequestsAdapter extends RecyclerView.Adapter<RequestsAdapter.MyHolder> {

    Context context;
    List<RequestRowModel> modelList;

    public RequestsAdapter(Context context, List<RequestRowModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestsAdapter.MyHolder holder, int position) {

        final RequestRowModel temp = modelList.get(position);

        String name = modelList.get(position).getName();
        String message = modelList.get(position).getMessage();
        int image = modelList.get(position).getImage();

        holder.name.setText(name);
        holder.message.setText(message);
        holder.imageView.setImageResource(R.drawable.profile);

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RequestDetails.class);
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
        return modelList.size();
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
