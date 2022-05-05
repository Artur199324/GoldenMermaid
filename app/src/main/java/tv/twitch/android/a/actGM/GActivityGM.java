package tv.twitch.android.a.actGM;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import tv.twitch.android.a.R;
import tv.twitch.android.a.vieGM.ViewMoGM;

public class GActivityGM extends AppCompatActivity {

    private Display vdf;
    private ImageView vfdbfd, nnghd, bbnfd, nnhfd, xxda, bbgfds;
    private ViewMoGM viewMoGM;
    private ConstraintLayout vdssa;
    private ArrayList<ImageView> vvda;
    private int vdss = 0;
    private int vdvc = 30;
    private int vdsa = 0;
    int rec;
    int vdsfex = 3;
    private TextView vsvdsfe, vdsfscd, vdfaef, vvtydq, grdfwe;
    private Button vsvfh, uiytt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        viewMoGM = new ViewModelProvider
                .AndroidViewModelFactory(getApplication())
                .create(ViewMoGM.class);
        vvda = new ArrayList<>();
        vdf = getWindowManager().getDefaultDisplay();
        viewMoGM.siiz(vdf.getWidth(), vdf.getHeight());
        grdfwe = findViewById(R.id.textViewCountdown);
        uiytt = findViewById(R.id.buttonStart);
        vfdbfd = findViewById(R.id.imageViewtop);
        nnghd = findViewById(R.id.imageViewbottom);
        bbnfd = findViewById(R.id.imageViewleft);
        nnhfd = findViewById(R.id.imageViewright);
        xxda = findViewById(R.id.imageViewrun);
        bbgfds = findViewById(R.id.imageViewBox);
        vsvdsfe = findViewById(R.id.textViewballs);
        vdsfscd = findViewById(R.id.textViewtime);
        vdfaef = findViewById(R.id.textViewrecord);
        vvtydq = findViewById(R.id.textViewGameover);
        vsvfh = findViewById(R.id.buttonrestart);
        vdssa = findViewById(R.id.cons);
        viewMoGM.ugd(bbgfds);
        rec = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("rec", 0);
        vdfaef.setText("record : " + rec);
        vfdbfd.setClickable(false);
        nnghd.setClickable(false);
        bbnfd.setClickable(false);
        nnhfd.setClickable(false);
        xxda.setClickable(false);

        uiytt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uiytt.setVisibility(View.INVISIBLE);
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        vdsfex--;
                        grdfwe.setText(vdsfex +"");
                        if (vdsfex != 0) {
                            handler.postDelayed(this::run, 1000);

                        } else {
                            grdfwe.setVisibility(View.INVISIBLE);
                            startGameGM();
                        }
                    }
                });
            }
        });
        vsvfh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GActivityGM.class));
                finishAffinity();
            }
        });
        vfdbfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMoGM.gotop();
            }
        });

        nnghd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMoGM.gobott();
            }
        });

        bbnfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMoGM.goL();
            }
        });

        nnhfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMoGM.goR();
            }
        });

        xxda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMoGM.goSp(5);
            }
        });


    }


    private void startGameGM() {
        bbgfds.setVisibility(View.VISIBLE);
        vfdbfd.setClickable(true);
        nnghd.setClickable(true);
        bbnfd.setClickable(true);
        nnhfd.setClickable(true);
        xxda.setClickable(true);
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                ifjd();
                if (vdsa != 1) {
                    handler.postDelayed(this::run, 1500);
                }

            }
        });

        handler.post(new Runnable() {
            @Override
            public void run() {
                ifh();
                if (vdsa != 1) {
                    handler.postDelayed(this::run, 2000);
                }

            }
        });

        handler.post(new Runnable() {
            @Override
            public void run() {

                kfhh();
                if (vdsa != 1) {
                    handler.postDelayed(this::run, 10);
                }

            }
        });


        handler.post(new Runnable() {
            @Override
            public void run() {
                vdvc--;
                vdsfscd.setText("time : " + vdvc);
                if (vdvc != 0) {
                    handler.postDelayed(this::run, 1000);
                } else {
                    vdsa = 1;
                    if (rec < vdss) {
                        getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("rec", vdss).apply();
                    }

                    vfdbfd.setClickable(false);
                    nnghd.setClickable(false);
                    bbnfd.setClickable(false);
                    nnhfd.setClickable(false);
                    xxda.setClickable(false);
                    vsvfh.setVisibility(View.VISIBLE);
                    vvtydq.setVisibility(View.VISIBLE);
                    bbgfds.setVisibility(View.INVISIBLE);
                }

            }
        });

    }

    private void kfhh() {

        for (int i = 0; i < vvda.size(); i++) {
            ImageView vvdaq = vvda.get(i);
            Rect cscs = new Rect();
            vvdaq.getHitRect(cscs);
            Rect cdgt = new Rect();
            bbgfds.getHitRect(cdgt);
            if (Rect.intersects(cscs, cdgt)) {
                int isa = (int) vvdaq.getTag();
                switch (isa) {
                    case 0:
                        vdss += 50;
                        vsvdsfe.setText("balls " + vdss);
                        break;
                    case 1:
                        if (vdss == 0) {
                            vdss = 100;
                        } else {
                            vdss += vdss;
                        }
                        vsvdsfe.setText("balls " + vdss);
                        break;
                }

                vdssa.removeView(vvdaq);
                vvda.remove(i);



            }
        }
    }

    private void ifjd() {
        Random vdsvd = new Random();
        int re = vdsvd.nextInt(5);
        ImageView vvvds = new ImageView(this);
        if (re == 0) {
            vvvds.setImageResource(R.drawable.s1);
            vvvds.setTag(0);
        }
        if (re == 1) {
            vvvds.setImageResource(R.drawable.s2);
            vvvds.setTag(0);
        }
        if (re == 2) {
            vvvds.setImageResource(R.drawable.s3);
            vvvds.setTag(0);
        }
        if (re == 3) {
            vvvds.setImageResource(R.drawable.s4);
            vvvds.setTag(0);
        }
        if (re == 4) {
            vvvds.setImageResource(R.drawable.s5);
            vvvds.setTag(1);
        }

        ConstraintLayout.LayoutParams imageViewLayoutParamsGM =
                new ConstraintLayout.LayoutParams(vdf.getWidth() / 7, vdf.getWidth() / 7);
        vdssa.addView(vvvds);
        vvvds.setLayoutParams(imageViewLayoutParamsGM);
        viewMoGM.uyj(vvvds);
        vvda.add(vvvds);
    }

    private void ifh() {
        for (int i = 0; i < vvda.size(); i++) {
            ImageView bbfds = vvda.get(i);
            vdssa.removeView(bbfds);
            vvda.remove(bbfds);
        }
    }

}