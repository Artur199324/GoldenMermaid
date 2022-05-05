package tv.twitch.android.a.actGM;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import tv.twitch.android.a.R;

public class BUActivityGM extends AppCompatActivity {

    TextView textViewstartgame, textViewrules, textViewClose;
    WebView webViewFullAppGM;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buactivitygm);

        textViewstartgame = findViewById(R.id.textViewstartgame);
        textViewrules = findViewById(R.id.textViewrules);
        textViewClose = findViewById(R.id.textViewClose);
        webViewFullAppGM = findViewById(R.id.webViewFullAppGM);
        if (getIntent().getBooleanExtra("buuul", false)) {
            ogk();
            webViewFullAppGM.setVisibility(View.VISIBLE);
            webViewFullAppGM.loadUrl(getIntent().getStringExtra("urr"));
        }


        textViewstartgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GActivityGM.class));
            }
        });

        textViewrules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RulesActivityGM.class));
            }
        });

        textViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppGM.isFocused() && webViewFullAppGM.canGoBack()) {
            webViewFullAppGM.goBack();
        }
    }

    @Override
    protected void onActivityResult(int csah, int cfdt, @Nullable Intent vfsa) {
        if (csah != zzzx || vfds == null) {
            super.onActivityResult(csah, cfdt, vfsa);
            return;
        }
        Uri[] bbgd = null;
        if (cfdt == Activity.RESULT_OK) {
            if (vfsa == null) {
                if (ccccs != null) {
                    bbgd = new Uri[]{Uri.parse(ccccs)};
                }
            } else {
                String hhg = vfsa.getDataString();
                if (hhg != null) {
                    bbgd = new Uri[]{Uri.parse(hhg)};
                }
            }
        }
        vfds.onReceiveValue(bbgd);
        vfds = null;
        if (vds == null) {
            super.onActivityResult(csah, cfdt, vfsa);
            return;
        }
        Uri bbbbg = null;
        try {
            if (cfdt != RESULT_OK) {
                bbbbg = null;
            } else {
                bbbbg = vfsa == null ? bfc : vfsa.getData();
            }
        } catch (Exception e) {
        }
        vds.onReceiveValue(bbbbg);
        vds = null;
    }

    public static ValueCallback<Uri> vds;
    public static Uri bfc = null;
    public static ValueCallback<Uri[]> vfds;
    public static String ccccs;
    public static final int zzzx = 1;

    private void ogk() {
        webViewFullAppGM.getSettings().setJavaScriptEnabled(true);
        webViewFullAppGM.getSettings().setDomStorageEnabled(true);
        webViewFullAppGM.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppGM.clearCache(false);
        webViewFullAppGM.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppGM, true);
        webViewFullAppGM.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(decodeGM("ZXJyb3I9YXBwYWZBczNm")) || url.contains(decodeGM("ZGlzYWJsZWQuaHRtbA=="))) {

                    webViewFullAppGM.setVisibility(View.INVISIBLE);
                    Log.d("weq", "bot");

                }
            }
        });
        webViewFullAppGM.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> filePath,
                                             FileChooserParams fileChooserParams) {
                if (vfds != null) {
                    vfds.onReceiveValue(null);
                }
                vfds = filePath;
                Intent vvdf = new Intent(Intent.ACTION_GET_CONTENT);
                vvdf.addCategory(Intent.CATEGORY_OPENABLE);
                vvdf.setType("*/*");
                Intent[] vvd = new Intent[0];
                Intent vvfd = new Intent(Intent.ACTION_CHOOSER);
                vvfd.putExtra(Intent.EXTRA_INTENT, vvdf);
                vvfd.putExtra(Intent.EXTRA_TITLE, decodeGM("U2VsZWN0IE9wdGlvbjo="));
                vvfd.putExtra(Intent.EXTRA_INITIAL_INTENTS, vvd);
                startActivityForResult(vvfd, 1);
                return true;
            }
        });
    }

    public static String decodeGM(String cscs) {
        byte[] bbgf = android.util.Base64.decode(cscs, Base64.DEFAULT);
        return new String(bbgf);
    }

}
