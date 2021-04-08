package com.example.PTSGENAP10RPL132;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
        addData();
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainPage.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Budi", "08529599040", "Budi@gmail.com","Pelajar","Prambatan kudus"));
        mahasiswaArrayList.add(new Mahasiswa("Wahyu", "08556776445", "wahyu@gmail.com", "Dosen", "Kaliwungu kudus"));
        mahasiswaArrayList.add(new Mahasiswa("Alif", "07873597259", "Alif@gmail.com", "Alif@gmail.com", "peganjaran kudus"));
        mahasiswaArrayList.add (new Mahasiswa("Gani", "0849743252005" , "Gani", "Gani@gmail.com", "dawe kudus"));
    }
}