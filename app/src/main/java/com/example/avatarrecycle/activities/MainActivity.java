package com.example.avatarrecycle.activities;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatarrecycle.adapters.CharacterAdapter;
import com.example.avatarrecycle.R;
import com.example.avatarrecycle.classes.myData;
import com.example.avatarrecycle.models.Character;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Character> characters;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private CharacterAdapter characterAdapter;
    private EditText searchBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Context context = this;
        searchBox = findViewById(R.id.editTextText);
        searchBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                String filter = searchBox.getText().toString();
                if (!filter.isEmpty()){
                    characters = new ArrayList<Character>();
                    for (Character character : myData.getCharacters()){
                        if (character.name.contains(filter))
                        {
                            characters.add(character);
                        }
                    }
                    characterAdapter = new CharacterAdapter(context, characters);
                    recyclerView.setAdapter(characterAdapter);
                }else{
                    characters = myData.getCharacters();
                    characterAdapter = new CharacterAdapter(context, characters);
                    recyclerView.setAdapter(characterAdapter);
                }
            }
        });

        recyclerView = findViewById(R.id.rvcon);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        characters = myData.getCharacters();
        characterAdapter = new CharacterAdapter(this, characters);
        recyclerView.setAdapter(characterAdapter);
    }
}