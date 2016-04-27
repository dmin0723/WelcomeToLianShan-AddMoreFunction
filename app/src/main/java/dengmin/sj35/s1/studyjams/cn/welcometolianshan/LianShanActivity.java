package dengmin.sj35.s1.studyjams.cn.welcometolianshan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import dengmin.sj35.s1.studyjams.cn.welcometolianshan.custom.CustomActivity;
import dengmin.sj35.s1.studyjams.cn.welcometolianshan.travel.TravelActivity;

public class LianShanActivity extends AppCompatActivity {
    private TextView introduce;
    private TextView travel;
    private TextView custom;
    private TextView cate;
    private TextView traffic;
    private TextView accommodation;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lian_shan);

        introduce = (TextView) findViewById(R.id.introduce);
        travel = (TextView) findViewById(R.id.travel);
        custom = (TextView) findViewById(R.id.custom);
        cate = (TextView) findViewById(R.id.cate);
        traffic = (TextView) findViewById(R.id.traffic);
        accommodation = (TextView) findViewById(R.id.accommodation);

        introduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LianShanActivity.this,IntroduceActivity.class);
                startActivity(intent);
            }
        });

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LianShanActivity.this,TravelActivity.class);
                startActivity(i);
            }
        });

        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LianShanActivity.this,TrafficeActivity.class);
                startActivity(intent);
            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LianShanActivity.this,CustomActivity.class);
                startActivity(intent);
            }
        });

        cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LianShanActivity.this,CateActivity.class);
                startActivity(intent);
            }
        });

        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LianShanActivity.this,AccommodationActivity.class);
                startActivity(intent);
            }
        });
    }
}
