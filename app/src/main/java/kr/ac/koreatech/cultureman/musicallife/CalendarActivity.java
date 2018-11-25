package kr.ac.koreatech.cultureman.musicallife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        com.applandeo.materialcalendarview.CalendarView calendarView
                = (com.applandeo.materialcalendarview.CalendarView) findViewById(R.id.calendarView);
        // 어느 날짜가 선택되었는지 메시지 띄움
        calendarView.setOnDayClickListener(eventDay ->
                Toast.makeText(getApplicationContext(), eventDay.getCalendar().getTime().toString() + " "
                                + eventDay.isEnabled(),
                        Toast.LENGTH_SHORT).show());


        // 리스트뷰에 들어갈 내용 임시 추가
        ArrayList<HashMap<String, String>> mArrayItems = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> mHashItem = new HashMap<String, String>();
        mHashItem.put("Item1", "뮤지컬 <엘리자벳>");
        mHashItem.put("Item2", "2018.11.17 - 2019.02.10");
        mArrayItems.add(mHashItem);
        setListViewText(mArrayItems);

        mHashItem = new HashMap<String, String>();
        mHashItem.put("Item1", "태양의서커스 <쿠자>");
        mHashItem.put("Item2", "2018.11.03 - 2019.01.06");
        mArrayItems.add(mHashItem);
        setListViewText(mArrayItems);

    }

    private void setListViewText(ArrayList<HashMap<String,String>> mArrayItems) {
        SimpleAdapter mSimpleAdapter = new SimpleAdapter(this, mArrayItems, android.R.layout.simple_list_item_2,
                new String[] {"Item1", "Item2"}, new int[] {android.R.id.text1, android.R.id.text2});
        ListView mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(mSimpleAdapter);
    }
}
