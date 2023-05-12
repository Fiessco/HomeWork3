package com.example.a5lesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Planet> planets = new ArrayList<Planet>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.RSV);
        PlanetAdapter adapter = new PlanetAdapter(planets, this);
        recyclerView.setAdapter(adapter);

    }

private  void  setInitialData(){
    planets = new ArrayList<>();

    planets.add(new Planet("Меркурий", "Планета находится ближе всех к солнцу. Ни воды, ни воздуха на Меркурии нет. Из-за того что Меркурий так близок к светилу, дневная температура на этой планете почти +450°С.",
            R.drawable.merkurii));
    planets.add(new Planet("Венера", "Ближайшая к Солнцу планета. Ни воды, ни воздуха на Меркурии нет. Из-за того что Меркурий так близок к светилу, дневная температура на этой планете почти +450°С.",
            R.drawable.venus));
    planets.add(new Planet("Земля", "Oдна из планет, которые вращаются вокруг Солнца. Она почти в 110 раз меньше этого светила по диаметру. Попробуй представить, что Солнце превратилось в дыню. Земля тогда со своими огромными городами, деревнями, горами и морями стала бы размером с маленькую фруктовую косточку.",
            R.drawable.earth));
    planets.add(new Planet("Марс", "Марс называют красной планетой из-за ржаво-красного цвета его поверхности. Температура на Марсе очень низкая и в дневное время суток, и в ночное",
            R.drawable.mars));
    planets.add(new Planet("Юпитер", "Самая большая планета Солнечной системы. Она больше Земли в 1000 раз. Юпитер находится на огромном расстоянии от Солнца, отчего температура на этом газовом гиганте жоло -140°С.",
            R.drawable.yupiter));
    planets.add(new Planet("Сатурн", "Планета, которая по размерам чуть меньше Юпитера. Внешне Сатурн отличается от остальных планет тем, что окружен множеством светящихся колец. Каждое кольцо Сатурна состоит из еще более тонких колец. Это «украшение» представляет собой миллиарды каменных обломков, покрытых льдом.",
            R.drawable.saturn));
    planets.add(new Planet("Уран", "Удален от Солнца на расстояние в 19 раз большее, чем Земля, поэтому получает очень мало тепла.",
            R.drawable.uran));
    planets.add(new Planet("Нептун", "По виду и размерам похож на Уран. Он сильно сжат и быстро вращается. Нептун удален от Солнца на 2,8 миллиардов километров.",
            R.drawable.neptun));
    planets.add(new Planet("Плутон", "Карликовая планета Солнечной системы. До недавнего времени он считался девятой планетой нашей звездной системы, сейчас же это просто малая планета.",
            R.drawable.pluton));
}

}