package com.ricardocarvalho.mylibrary.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.ricardocarvalho.mylibrary.databinding.ItemBookBinding
import com.ricardocarvalho.mylibrary.entity.BookEntity

class BookViewHolder(private val item: ItemBookBinding) : RecyclerView.ViewHolder(item.root) {

    fun bind(book: BookEntity) {
        item.textviewTitle.text = book.title
        item.textviewAuthor.text = book.author
        item.textviewGenre.text = book.genre
    }

}