package tv.twitch.android.a.vieGM;

import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import tv.twitch.android.a.modGM.GameGM;

public class ViewMoGM extends AndroidViewModel {
    GameGM gameGM;
    public ViewMoGM(@NonNull Application application) {
        super(application);
        gameGM = new GameGM();
    }

    public void ugd(ImageView bfds){
        gameGM.setVdsv(bfds);
    }

    public void goSp(int aa){
        gameGM.goo(aa);
    }

    public void gotop(){
        gameGM.goTo();
    }

    public void gobott(){
        gameGM.goBott();
    }

    public void goR(){
        gameGM.goRight();
    }

    public void goL(){
        gameGM.goLeft();
    }

    public void siiz(int w,int h){
        gameGM.sizD(w,h);
    }

    public void uyj(ImageView bfd){
        gameGM.jfh(bfd);
    }

}
