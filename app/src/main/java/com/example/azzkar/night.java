package com.example.azzkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class night extends AppCompatActivity {
ListView night;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);
        night =(ListView)findViewById(R.id.night);
        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("قل هو الله احد*الله الصمد* لم يلد ولم يولد*ولم يكن له كفواً أحد*\nتكرار 3 مرات");
        arrayList.add("رضيت بالله رباً وبالأسلام ديناًوبمحمد صلى الله عليه وسلم نبياً ورسولا\nتكرار 3مرات");
        arrayList.add("أعوذ بكلمات الله التامات من شر ماخلق \nتكرار 3مرات ");
        arrayList.add("اللهم صلى وسلم وبارك على نبينا محمّد\nتكرار 3مرات");
        arrayList.add("قل أعوذ برب الفلق*من شر ماخلق*ومن شر غاسق إذا وقب *ومن شر النفثت في العقد*ومن شر حاسدٍ إذا حسد*\nتكرار 3مرات ");
        arrayList.add("قل أعوذ برب الناس *ملك الناس *إله الناس*من شر الوسواس الخناس* الذي يوسوس في صدور الناس *من الجنة والناس*\nتكرار 3مرات ");
        arrayList.add("حسبي الله لا إله الاهو عليه توكلت وهو رب العرش العظيم \nتكرار 7مرات");
        arrayList.add("اللهم بك أصبحنا وبك أمسينا وبك نحيا وبك نموت وإليك النشور\nتكرار مرة واحده ");
        arrayList.add("سبحان الله وبحمده عدد خلقه ورضا نفسه وزنة عرشه ومداد كلماته\nتكرار 3مرات");
        arrayList.add("سبحان الله وبحمده \nتكرار 100 مره ");
        arrayList.add("لاإله إلا الله وحده لاشريك له ؛له الملك وله الحمد وهو على كل شئٍ قدير\nتكرار 10 مرات ");
        arrayList.add("يارب ,لك الحمد كما ينبغي لجلال وجهك ولعظيم سلطانك\n تكرار 3مرات ");
        arrayList.add("أستغفر الله العظيم الذي لاإله إلا هو الحي القيوم واتوب إليه\n تكرار 3مرات");
        arrayList.add("بسم الله الذي لايضر مع اسمه شئ في الأرض ولا في السماء\n تكرار 3مرات");

        ArrayAdapter<String> ad =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        night.setAdapter(ad);
    }
}
