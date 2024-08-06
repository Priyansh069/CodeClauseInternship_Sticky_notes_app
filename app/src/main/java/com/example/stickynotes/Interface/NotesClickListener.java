package com.example.stickynotes.Interface;

import androidx.cardview.widget.CardView;

import com.example.stickynotes.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}
