package tv.twitch.android.a;

import android.app.Application;

import androidx.lifecycle.ViewModelProvider;

import tv.twitch.android.a.vieGM.ViewMoGM;
import tv.twitch.android.a.vieGM.VmGM;

public class AppGM extends Application {

   public static VmGM vmGM;
    @Override
    public void onCreate() {
        super.onCreate();

        vmGM = new ViewModelProvider
                .AndroidViewModelFactory(this)
                .create(VmGM.class);
        vmGM.fd();
    }
}
