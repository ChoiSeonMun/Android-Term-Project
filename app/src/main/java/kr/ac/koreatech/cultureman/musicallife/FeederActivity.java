package kr.ac.koreatech.cultureman.musicallife;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class FeederActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeder_listview);

        ListView feeder;
        FeederListViewAdapter feederAdapter;

        feederAdapter = new FeederListViewAdapter();

        feeder = (ListView) findViewById(R.id.listview_newsfeed);
        feeder.setAdapter(feederAdapter);

        //임의로 넣은 값
        feederAdapter.addItem(ContextCompat.getDrawable(this,R.drawable.ic_launcher_background),"Phantom","Cheonan","2018/12/01~2018/12/31");
    }
}
