package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {


    TextView authorName, bookName, bookDetail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Book book = (Book) getIntent().getSerializableExtra("Book");


        authorName = findViewById(R.id.detail_author_name);
        bookName = findViewById(R.id.detail_book_name);
        bookDetail = findViewById(R.id.book_detail);
        imageView = findViewById(R.id.detail_img_book);


        imageView.setImageResource(book.getImageResource());
        bookName.setText(book.getBookName());
        authorName.setText("By " + book.getAuthorName());
        bookDetail.setText(book.getDescription());
    }
}
