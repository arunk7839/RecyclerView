package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private List<Book> bookList;
    Context context;


    public BookAdapter(List<Book> bookList, Context context) {
        this.bookList = bookList;
        this.context = context;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView authorName, bookName;
        public ImageView imageView;
        Button btn_detail;

        public MyViewHolder(View view) {
            super(view);

            authorName = view.findViewById(R.id.author_name);
            bookName = view.findViewById(R.id.book_name);
            imageView = view.findViewById(R.id.img_book);
            btn_detail = view.findViewById(R.id.btn_detail);
        }


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_row, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.authorName.setText(bookList.get(position).getAuthorName());
        holder.bookName.setText(bookList.get(position).getBookName());
        holder.imageView.setImageResource(bookList.get(position).getImageResource());
        holder.btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = bookList.get(position);
                Intent intent = new Intent(context, DetailsActivity.class);
                // sending our object
                intent.putExtra("Book", book);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


}
