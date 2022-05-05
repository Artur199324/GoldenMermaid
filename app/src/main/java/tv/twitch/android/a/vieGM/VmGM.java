package tv.twitch.android.a.vieGM;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import tv.twitch.android.a.actGM.StartActivityGM;
import tv.twitch.android.a.modGM.GM;

public class VmGM extends AndroidViewModel {
    GM gm;
    public VmGM(@NonNull Application application) {
        super(application);
        gm = new GM(application);
    }

    public void con(StartActivityGM startActivityGM){
        gm.connectGM(startActivityGM);
    }

    public void gd(StartActivityGM startActivityGM){
        gm.setStartActivityGM(startActivityGM);
    }

    public void fd(){
        gm.kfd();
    }

    public void hf(){
        gm.gf();
    }

    public void kfkf(StartActivityGM startActivityGM){
        gm.fgd(startActivityGM);
    }

}
