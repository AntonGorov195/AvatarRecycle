package com.example.avatarrecycle.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatarrecycle.R;
import com.example.avatarrecycle.models.Character;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.myViewHolder> {

    private Context context;
    private ArrayList<Character> characters;

    public CharacterAdapter(Context context,ArrayList<Character> characters) {
        this.context = context;
        this.characters = characters;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView username;
        TextView nameVersion;
        ImageView imageViewItem;
        View parent;

        public myViewHolder(View itemView) {
            super(itemView);
            parent = itemView;
            username = itemView.findViewById(R.id.charName);
            nameVersion = itemView.findViewById(R.id.charDesc);
            imageViewItem = itemView.findViewById(R.id.imageView);
        }

    }

    @NonNull
    @Override
    public CharacterAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        myViewHolder MyViewHolder = new myViewHolder(view);
        return MyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterAdapter.myViewHolder holder, int position) {
        Character character = characters.get(position);
        holder.username.setText(character.name);
        holder.nameVersion.setText(character.description);
        holder.imageViewItem.setImageResource(character.profilePic);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setIcon(character.profilePic);
                builder.setTitle(character.name);
                builder.setMessage(character.description);
                builder.setPositiveButton("Close", (dialog, which) -> dialog.dismiss());
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }


}
