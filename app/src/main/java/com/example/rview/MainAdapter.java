package com.example.rview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private ArrayList<String> content;
    private ArrayList<String> image;
    private ArrayList<String> title;
    private ArrayList<String> logo;
    private Context mcontext;

    private ItemClickListener itemClickListener;



    public MainAdapter(ArrayList<String> content, ArrayList<String> image, ArrayList<String> title, ArrayList<String> logo, Context context){
        super();
        this.content = content;
        this.image = image;
        this.title = title;
        this.logo = logo;
        this.mcontext = context;
        this.itemClickListener = itemClickListener;

    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_item_view, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {

        Glide.with(mcontext)
                .load(image.get(position))
                .into(holder.imageView);

        Glide.with(mcontext)
                .load(logo.get(position))
                .into(holder.circleImageView);

        holder.textViewContentName.setText(content.get(position));
        holder.textViewTitleName.setText(title.get(position));
        final String text = content.get(position).toString();
        holder.setItemClick(content.get(position));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mSharingIntent = new Intent(Intent.ACTION_SEND);
                mSharingIntent.setType("text/plain");
                mSharingIntent.putExtra(Intent.EXTRA_SUBJECT, text);
                mSharingIntent.putExtra(Intent.EXTRA_TEXT, content);
                view.getContext().startActivity(Intent.createChooser(mSharingIntent,"Share text via"));

            }
        });

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + title.get(position));

                Toast.makeText(mcontext, title.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mcontext, SecondActivity.class);
                intent.putExtra("image", image.get(position));
                intent.putExtra("logo", logo.get(position));
                intent.putExtra("title", title.get(position));
                intent.putExtra("content", content.get(position));

                mcontext.startActivity(intent);
            }

        });



    }



    @Override
    public int getItemCount() {
        return content.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewContentName;
        private ImageView imageView;
        private TextView textViewTitleName;
        private CircleImageView circleImageView;
        private Button button;
        LinearLayout parent;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewContentName = itemView.findViewById(R.id.text_list_item);
            imageView = itemView.findViewById(R.id.image_view);
            textViewTitleName = itemView.findViewById(R.id.textView2);
            circleImageView = itemView.findViewById(R.id.circleimage);
            parent = itemView.findViewById(R.id.parent);
            button = itemView.findViewById(R.id.button);
        }

        public void setItemClick(final String item) {
            textViewContentName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(item, getAdapterPosition());
                    }
                }
            });
        }
    }

    interface ItemClickListener {
        void onItemClick(String item, int position);
    }


}
