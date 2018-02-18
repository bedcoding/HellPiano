package com.example.ggavi.newpii;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


// 내가 뭔 정신으로 이걸 만들 생각을 한걸까
public class SubActivity extends Activity {
    private static MediaPlayer mp;   // 배경음악 출력에 넣을 변수
    private ImageButton buttonHELL;  // 이미지 버튼 만들려고 추가
    private ImageButton buttonNEXT;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        // 이미지 버튼 삽입
        buttonHELL = (ImageButton)findViewById(R.id.buttonHELL);

        buttonHELL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this, Pop.class);
                startActivity(intent);
            }
        });

        // 배경음악 삽입
        mp = MediaPlayer.create(this, R.raw.sad);

        // 소리가 너무 커서 반으로 줄임 (갑툭튀해서 내가 놀램)
        mp.setVolume(0.5f, 0.5f);
        mp.start();
        // mp.setLooping(true); 이걸 넣으면 무한루프


        // 누르면 다음 화면으로 넘어가는 버튼
        buttonNEXT = (ImageButton) findViewById(R.id.button);
        buttonNEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);

                mp.stop();  // 음악 끄기
                finish();
            }
        });

        /*
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class);     // 다음 넘어갈 클래스 지정
                startActivity(intent);           // 다음 화면으로 넘어간다

                mp.stop();  // 음악 끄기
                finish();
            }
        });
        */
    }


    // 뒤로가기 누를때 종료
    public void onBackPressed()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(SubActivity.this);

        alert
                .setTitle("종료 확인")
                .setMessage("종료 하시겠습니까?")
                .setPositiveButton("종료", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(true);
                        finish();

                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog dialog = alert.create();
        dialog.show();
    }
}