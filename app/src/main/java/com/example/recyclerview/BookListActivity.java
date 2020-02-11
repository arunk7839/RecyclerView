package com.example.recyclerview;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BookListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Book> bookList = new ArrayList<Book>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        recyclerView = findViewById(R.id.recycler_view);

        prepareBookData();


        //vertical RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        //provides basic animations on remove, add, and move events that happen to the items in a RecyclerView.
        //RecyclerView uses a DefaultItemAnimator by default.
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(new BookAdapter(bookList, this));
    }

    //preparing bookList data
    private void prepareBookData() {
        Book book = new Book("Munshi Premchand", "Nirmala", R.drawable.nirmala, "The melodramatic novel is centered on Nirmala, a young girl who was forced to marry a widower of her father's age. The plot unfolds to reveal her husband’s suspicion of a relationship between her and his eldest son, a suspicion that leads to the son’s death.");
        bookList.add(book);
        book = new Book("Harivansh Rai Bachchan", "Madhushala", R.drawable.madhushala, "The poet tries to explain the complexity of life with his four instruments, which appear in almost every verse: madhu, madira or haala (wine), saaki (server), pyaala (cup or glass) and of course madhushala, madiralaya (pub/bar).");
        bookList.add(book);
        book = new Book("Ramdhari Singh Dinkar", "Rashmirathi", R.drawable.rashmirathi, "Rashmirathi, which means \"charioteer of the sun”. It has a total of 4 cantos, in which all aspects of Karna's character are depicted live. In Rashmirathi, Dinkar elevated Karna from the Mahabharata story and raised him to a new land of morality and loyalty and honored him with pride. ");
        bookList.add(book);
        book = new Book("Dharamvir Bharti", "Gunahon Ka Devta", R.drawable.gunahokedevta, "It is primarily the story of \"non expressive love and romance between two characters (Chandar and Sudha)\" showing various trappings of love in urban middle-class, pre-independence India and the emotional conflicts of enthusiastic, ambitious and idealistic youth.");
        bookList.add(book);
        book = new Book("Munshi Premchand", "Shatranj Ke Khiladi", R.drawable.shatranj, "The two main characters are the aristocrats Mirza Sajjad Ali and Mir Raushan Ali who are deeply immersed into playing chess. Their desire for the game destroys the competency of the characters, and makes them irresponsible in their duties towards their families and society. ");
        bookList.add(book);
        book = new Book("Bhisham Sahni", "Tamas", R.drawable.tamas, "Tamas by Bhisham Sahni is a novel about the 1947 riots in Pakistan preceding the Partition of India. Based on Sahni’s first-hand experience, Tamas (Hindi for “Darkness, Ignorance”) is a fictionalized version of the riots, which pitted Muslims, Hindus and Sikhs against each other. ");
        bookList.add(book);
        book = new Book("Dharamvir Bharti", "Suraj Ka Satva Ghoda", R.drawable.suraj, "The storyteller Manek Mulla (played by Rajit Kapur) tells his friends three stories of three women he had known at different points of time in his life: Rajeshwari Sachdev (a metaphor for the middle class), Pallavi Joshi (the intellectual and affluent), and Neena Gupta (the poor).");
        bookList.add(book);
        book = new Book("Munshi Premchand", "Karmabhumi", R.drawable.karmabhumi, "Greatly influenced by Gandhi's satyagraha movement, Karmabhumi is set in the Uttar Pradesh of the 1930s. By the beginning of the 20th century, Islam and Hinduism had coexisted in India for over a thousand years, and barring the occasional outbursts of violence, the two religious communities had lived together peacefully and shared strong social bonds except marriage.");
        bookList.add(book);
        book = new Book("Kashinath Singh", "Kassi Ka Assi", R.drawable.kashi_ka_assi, "Kashi Ka Assi by Kashinath Singh is an epic novel that brings out the life and times of Assi – a neighborhood on the southernmost ghat at Varanasi. It was the epicenter of life in Kashi – where people used to come and spend their ‘fursat’ or free time. There would be professors, student leaders, religious gurus who would consume their poison and speak their mind in a language that best describes their opinions and feelings.");
        bookList.add(book);
        book = new Book("Bhagwati Charan Verma", "Chitralekha", R.drawable.chitralekha, "Chitralekha is a slim volume of literary work that explores the very essence of the universal truths of human life in a social set up. Woven around an intense love story that reflects on and flashes out not just the various aspects of human nature but also the myriad dilemmas faced by us in our lifetime, Chitralekha - the novel and protagonist - is riveting from the first sight and word.");
        bookList.add(book);

    }
}
