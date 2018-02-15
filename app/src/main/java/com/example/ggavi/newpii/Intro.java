package com.example.ggavi.newpii;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        // 생성한 비디오 뷰를 선언
        VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        // 비디오 뷰를 커스텀하기 위해 미디어 컨트롤러 객체 생성
        MediaController mediaController = new MediaController(this);

        // 비디어 뷰에 연결
        mediaController.setAnchorView(videoView);

        // 안드로이드 res 폴더에 raw 폴더를 생성 후 재생할 동영상 파일을 넣습니다.
        Uri video = Uri.parse("android.resource://"+getPackageName() + "/raw/ahnmovie");

        // 비디오 뷰의 컨트롤러를 미디어 컨트롤러로 사용
        videoView.setVideoURI(video);

        // 비디오 뷰를 포커스하도록 지정
        videoView.requestFocus();

        // 동영상 재생
        videoView.start();



        // 핸들러: 일정 시간동안 이동하는 것에 대한 기능을 포함하고 있음
        Handler handler = new Handler();

        // 처음에 SubActivity 위에 인트로가 떠 있다가 5초 뒤에 인트로가 사라집니다.
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(Intro.this, SubActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);   // 5초를 의미
    }
}