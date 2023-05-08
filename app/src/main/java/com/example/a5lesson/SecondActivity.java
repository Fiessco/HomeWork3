package com.example.a5lesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.RSV);
        AnimalAdapter adapter = new AnimalAdapter(animals, this);
        recyclerView.setAdapter(adapter);

    }

private  void  setInitialData(){
        animals = new ArrayList<>();
    animals.add(new Animal("Рысь", "Род хищных животных, семейства кошачьих",
            R.drawable.lynx, "Численность средняя"));
    animals.add(new Animal("Бобр", "Полуводное млекопитающее",
            R.drawable.beaver, "Численность большая"));
    animals.add(new Animal("Медведь", "Семейство млекопитающих",
            R.drawable.bear, "Численность большая"));
    animals.add(new Animal("Волк", "Вид хищных млекопитающих из семейства собачьих",
            R.drawable.wolf, "Численность большая"));
    animals.add(new Animal("Сова", "Хищная птица семейства совиных",
            R.drawable.owl, "Численность большая"));
}

}