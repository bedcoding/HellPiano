package com.example.ggavi.newpii;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button a, b, c, d, e, f, g, h, i, j;
    Button aup,bup,cup,dup,eup,fup,gup;

    private SoundPool soundPool;
    private int sound_a, sound_b, sound_c, sound_d, sound_e, sound_f, sound_g, sound_h, sound_i, sound_j;
    private int sound_aup, sound_bup, sound_cup, sound_dup, sound_eup, sound_fup, sound_gup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // button2를 누르면 경고창이 뜨게 만듬
        findViewById(R.id.button2).setOnClickListener(this);

        // button1을 누르면 다시 처음 화면으로 넘어가게 만듬
        ImageButton bb = (ImageButton) findViewById(R.id.button1);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        SubActivity.class);      // 다음 넘어갈 클래스 지정
                startActivity(intent);           // 다음 화면으로 넘어간다
                finish();
            }
        });
        /////////////////////////////////////////////////


        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);
        f = (Button) findViewById(R.id.f);
        g = (Button) findViewById(R.id.g);
        h = (Button) findViewById(R.id.h);
        i = (Button) findViewById(R.id.i);
        j = (Button) findViewById(R.id.j);
        aup = (Button) findViewById(R.id.a_up);
        bup = (Button) findViewById(R.id.b_up);
        cup = (Button) findViewById(R.id.c_up);
        dup = (Button) findViewById(R.id.d_up);
        eup = (Button) findViewById(R.id.e_up);
        fup = (Button) findViewById(R.id.f_up);
        gup = (Button) findViewById(R.id.g_up);


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound_a = soundPool.load(this, R.raw.a, 1);
        sound_b = soundPool.load(this, R.raw.b, 1);
        sound_c = soundPool.load(this, R.raw.c, 1);
        sound_d = soundPool.load(this, R.raw.d, 1);
        sound_e = soundPool.load(this, R.raw.e, 1);
        sound_f = soundPool.load(this, R.raw.f, 1);
        sound_g = soundPool.load(this, R.raw.g, 1);
        sound_h = soundPool.load(this, R.raw.h, 1);
        sound_i = soundPool.load(this, R.raw.i, 1);
        sound_j = soundPool.load(this, R.raw.j, 1);

        sound_aup = soundPool.load(this, R.raw.a_up, 1);
        sound_bup = soundPool.load(this, R.raw.c_up, 1);
        sound_cup = soundPool.load(this, R.raw.d_up, 1);
        sound_dup = soundPool.load(this, R.raw.f_up, 1);
        sound_eup = soundPool.load(this, R.raw.g_up, 1);
        sound_fup = soundPool.load(this, R.raw.h_up, 1);
        sound_gup = soundPool.load(this, R.raw.j_up, 1);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_a, 1, 1, 0, 0, 1);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_b, 1, 1, 0, 0, 1);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_c, 0.5f, 0.5f, 0, 0, 1);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_d, 1, 1, 0, 0, 1);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_e, 1, 1, 0, 0, 1);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_f, 1, 1, 0, 0, 1);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_g, 1, 1, 0, 0, 1);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_h, 1, 1, 0, 0, 1);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_i, 1, 1, 0, 0, 1);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_j, 1, 1, 0, 0, 1);
            }
        });

        aup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_aup, 1, 1, 0, 0, 1);
            }
        });

        bup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_bup, 1, 1, 0, 0, 1);
            }
        });

        cup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_cup, 1, 1, 0, 0, 1);
            }
        });

        dup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_dup, 1, 1, 0, 0, 1);
            }
        });

        eup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_eup, 1, 1, 0, 0, 1);
            }
        });

        fup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_fup, 1, 1, 0, 0, 1);
            }
        });

        gup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_gup, 1, 1, 0, 0, 1);
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                new AlertDialog.Builder(this)
                        .setTitle("ceci n'est pas une 'menu'")
                        .setMessage("해석: 이것은 '메뉴'가 아니다. \n - 현대 미술의 거장 르네 마그리트(René Magritte)")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dig, int sumthin) {
                            }
                        })
                        .show();    // 팝업창 보여줌
                break;
        }
    }


    // 뒤로가기 누를때 종료
    public void onBackPressed()
    {
        android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(MainActivity.this);

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

        android.app.AlertDialog dialog = alert.create();
        dialog.show();
    }
}