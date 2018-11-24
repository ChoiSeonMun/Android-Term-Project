package kr.ac.koreatech.cultureman.musicallife;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InfoActivity extends AppCompatActivity {
    ImageView blobImg;
    String reservepath = "reserve";
    String morepath = "more";

    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

    }
    public void onClick(View v){
        Intent intent = null;
        switch(v.getId()){
            case R.id.button_more:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(morepath));
                break;
            case R.id.button_reserve:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(reservepath));
                break;
        }
    }

}
