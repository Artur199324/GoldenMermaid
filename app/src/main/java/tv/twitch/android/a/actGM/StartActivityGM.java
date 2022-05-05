package tv.twitch.android.a.actGM;

import static tv.twitch.android.a.AppGM.vmGM;
import static tv.twitch.android.a.actGM.BUActivityGM.decodeGM;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import tv.twitch.android.a.R;
import tv.twitch.android.a.modGM.GM;

public class StartActivityGM extends AppCompatActivity {

    TextView textViewLoading, textViewIn;
    int vsdvdaqgj;
    Handler nngdd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startgm);

        textViewLoading = findViewById(R.id.textViewLoading);
        textViewIn = findViewById(R.id.textViewIn);
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId("1a99966b-7fca-4bdb-a4b7-bca14c85647d");
        nngdd = new Handler();
        nngdd.post(new Runnable() {
            @Override
            public void run() {
                vsdvdaqgj++;
                switch (vsdvdaqgj) {
                    case 1:
                        textViewLoading.setText("Loading.");
                        break;
                    case 2:
                        textViewLoading.setText("Loading..");
                        break;
                    case 3:
                        textViewLoading.setText("Loading...");
                        break;
                    case 4:
                        textViewLoading.setText("Loading....");
                        break;
                    case 5:
                        textViewLoading.setText("Loading.....");
                        vsdvdaqgj = 0;
                        break;

                }

                nngdd.postDelayed(this::run, 1000);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    GM.nnfdv = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                } catch (Exception e) {
                }
            }
        }).start();

        GM.vdbds = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        String vdds = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(decodeGM("c2F2ZWRVcmw="), decodeGM("bnVsbA=="));
        if (fhs()) {

            if (!vdds.equals(decodeGM("bnVsbA=="))) {
                Intent intent = new Intent(getApplicationContext(), BUActivityGM.class);
                intent.putExtra("buuul", true);
                intent.putExtra("urr", vdds);
                startActivity(intent);
            } else {

                vmGM.gd(this);
                vmGM.con(this);
                vmGM.hf();
                nngdd.post(new Runnable() {
                    @Override
                    public void run() {
                        if (!GM.vdsvduv.equals("q")) {
                            nngdd.postDelayed(this::run, 10);
                        } else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    vmGM.kfkf(StartActivityGM.this);
                                }
                            });
                        }


                    }
                });
            }

        } else {
            textViewLoading.setVisibility(View.INVISIBLE);
            textViewIn.setVisibility(View.VISIBLE);
            textViewIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), StartActivityGM.class));
                    finishAffinity();
                }
            });
        }
    }


    private boolean fhs() {
        String vdsjs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager) getSystemService(vdsjs);
        if (cm.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }
}
