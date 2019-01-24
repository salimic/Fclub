package com.example.salimic.fclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] ligs ={"Английская Премьер лига",
            "Испанская Ла лига","Итальянская Серия А","Немецкая Бундеслига","Французкая Лига 1"};

    String[] apl = {"Ливерпуль","Манчестер Сити","Тоттенхэм","Челси","Арсенал","Манчестер Юнайтед",
            "Уотфорд","Вулверхэмптон","Лестер","Вест Хэм","Эвертон","Борнмут","Брайтон","Кристал Пэлас",
            "Саутгемптон","Бернли","Ньюкасл","Кардифф","Фулхэм","Хаддерсфилд"};

    String[] laliga = {"Барселона","Атлетико","Реал Мадрид","Севилья","Алавес","Хетафе","Бетис",
            "Реал Сосьедад","Валенсия","Леванте","Эйбар","Жирона","Эспаньол","Атлетик","Леганес",
            "Вальядолид","Сельта","Райо Вальекано","Вильярреал","Уэска" };

    String[] seriaa = {"Ювентус","Наполи","Интер","Милан","Рома","Лацио","Аталанта","Сампдория",
            "Парма","Фиорентина","Торино","Сассуоло","Кальяри","Дженоа","Удинезе","СПАЛ",
            "Эмполи","Болонья","Фрозиноне","Кьево" };

    String[] bundeslig = {"Боруссия Д","Бавария","Боруссия М","РБ Лейпциг","Айнтрахт Ф",
            "Вольфсбург","Герта","Хоффенхайм","Вердер","Байер","Майнц","Шальке","Фрайбург",
            "Фортуна","Аугсбург","Штутгарт","Ганновер","Нюрнберг" };

    String[] liga1 = {"ПСЖ","Лилль","Лион","Сент-Этьен","Страсбур","Монпелье","Марсель","Ницца",
            "Ренн","Бордо","Реймс","Ним","Тулуза","Нант","Анжер","Кан","Амьен","Дижон","Монако",
            "Генгам" };

    Spinner spinner1, spinner2;
    private ArrayAdapter<String> adapter1, adapter2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        // адаптер
        adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ligs);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);

        // устанавливаем обработчик нажатия
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int ItemSelected, long selectedId) {

                if (spinner1.getSelectedItem().equals("Английская Премьер лига")) {
                    adapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item, apl);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);

                } else if (spinner1.getSelectedItem().equals("Испанская Ла лига")) {

                    adapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item, laliga);

                    adapter2.notifyDataSetChanged();
                    spinner2.setAdapter(adapter2);

                } else if (spinner1.getSelectedItem()
                        .equals("Итальянская Серия А")) {

                    adapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item, seriaa);

                    adapter2.notifyDataSetChanged();
                    spinner2.setAdapter(adapter2);

                } else if (spinner1.getSelectedItem().equals(
                        "Немецкая Бундеслига")) {

                    adapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item, bundeslig);
                    adapter2.notifyDataSetChanged();
                    spinner2.setAdapter(adapter2);

                } else if (spinner1.getSelectedItem().equals(
                        "Французкая Лига 1")) {

                    adapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item, liga1);

                    adapter2.notifyDataSetChanged();
                    spinner2.setAdapter(adapter2);

                } else {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
}
