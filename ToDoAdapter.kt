package com.example.todolist

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(
    private val todos: MutableList<ToDo>
) {

    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) // class inheriting from rv
}