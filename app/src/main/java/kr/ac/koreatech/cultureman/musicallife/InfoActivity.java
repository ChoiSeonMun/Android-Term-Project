package kr.ac.koreatech.cultureman.musicallife;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InfoActivity extends AppCompatActivity {
    //변수
    ImageView mImgInfo;
    TextView mTextSimple;
    TextView mTextInfo;
    //이미지 경로
    String imgpath = "img";
    //예매 사이트 경로
    String reservepath;
    //상세정보 사이트 경로
    String morepath;

    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        reservepath = "http://ticket.interpark.com/Ticket/Goods/GoodsInfo.asp?GoodsCode=18012338";
        morepath = "http://www.playdb.co.kr/playdb/playdbDetail.asp?sReqPlayno=131089";

        mImgInfo = (ImageView)findViewById(R.id.image_info);
        mTextSimple = (TextView)findViewById(R.id.textview_simpleinfo);
        mTextInfo = (TextView)findViewById(R.id.textview_info);

        mTextSimple.setText("\n" +
                "세부장르\t뮤지컬 > 라이선스\n" +
                "일시\t2018/11/17 ~ 2019/02/10\n" +
                "장소\t블루스퀘어 인터파크홀 (구 삼성전자홀)\n" +
                "출연\t옥주현, 김소현, 신영숙, 김준수, 박형식, 정택운(빅스 레오), 이지훈, 강홍석, 박강현, 민영기, 손준호, 이소유(이정화), 이태원, 윤소호, 최우혁, 최병광, 한지연, 신지섭...");
        mTextInfo.setText("3년간의 기다림, 대한민국을 뒤흔든 황후가 온다!거부할 수 없는 명작 뮤지컬 〈엘리자벳〉SENSATION27년간 총 12개국, 누적 관객 1,100만전 세계가 인정한 독보적 스테디셀러2012년 국내 초연 누적관객 15만명 돌파2013년 앙코르 공연 97% 객석 점유율2015년 10주간 예매율 1위뮤지컬 ‘엘리자벳’은 역사와 판타지적 요소가 결합된 매혹적인 스토리를 바탕으로 ‘귀에 감기는 킬링 넘버와 650년 전통을 가진 합스부르크 왕가의 고전미를 담은 의상과 세트까지 환상적으로 어우러져 관객들로 하여금 웅장했던 역사에 빠져들게 한다.서사, 음악, 무대예술의 3박자가 완벽..");
    }
    public void onClick(View v){
        Intent intent;
        //사이트 연결
        switch(v.getId()){
            case R.id.button_more:
                Toast. makeText (getApplicationContext(),morepath,Toast. LENGTH_SHORT ).show();
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(morepath));
                startActivity(intent);
                break;
            case R.id.button_reserve:
                Toast. makeText (getApplicationContext(),reservepath,Toast. LENGTH_SHORT ).show();
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(reservepath));
                startActivity(intent);
                break;
        }
    }

}
