package tv.twitch.android.a.modGM;

import android.os.Handler;
import android.widget.ImageView;

public class GameGM {

    private ImageView vdsv;
    private int a = 1;
    private int b = 0;
    private int vdsgh = 0;
    private Handler vdsas;
    private int vdsvdu;
    private int vdvfaf;

    public GameGM() {
    }

    public ImageView getVdsv() {
        return vdsv;
    }

    public void setVdsv(ImageView vdsv) {
        this.vdsv = vdsv;
    }

    public void goo(int f) {
        a += f;
    }

    public void sizD(int w, int h) {
        vdsvdu = w;
        vdvfaf = h;
    }

    public void goTo() {
        vdsas = new Handler();
        vdsas.post(new Runnable() {
            @Override
            public void run() {
                vdsv.setY(vdsv.getY() - 20);
                if (vdsv.getY() <=0){
                    vdsv.setY(vdvfaf);
                }
                vdsgh++;
                if (vdsgh != a) {
                    vdsas.postDelayed(this::run, 10);
                } else {
                    vdsgh = 0;
                    a = 1;
                }
            }
        });
    }

    public void goBott() {
        vdsas = new Handler();
        vdsas.post(new Runnable() {
            @Override
            public void run() {
                vdsv.setY(vdsv.getY() + 20);
                if (vdsv.getY()>= vdvfaf){
                    vdsv.setY(0);
                }
                vdsgh++;
                if (vdsgh != a) {
                    vdsas.postDelayed(this::run, 10);
                } else {
                    vdsgh = 0;
                    a = 1;
                }
            }
        });
    }

    public void goRight() {
        vdsas = new Handler();
        vdsas.post(new Runnable() {
            @Override
            public void run() {
                vdsv.setX(vdsv.getX() + 20);
                if (vdsv.getX() >= vdsvdu){
                    vdsv.setX(0);
                }
                vdsgh++;
                if (vdsgh != a) {
                    vdsas.postDelayed(this::run, 10);
                } else {
                    vdsgh = 0;
                    a = 1;
                }
            }
        });
    }

    public void goLeft() {
        vdsas = new Handler();
        vdsas.post(new Runnable() {
            @Override
            public void run() {
                vdsv.setX(vdsv.getX() - 20);
                if (vdsv.getX() <= 0){
                    vdsv.setX(vdsvdu);
                }
                vdsgh++;
                if (vdsgh != a) {
                    vdsas.postDelayed(this::run, 10);
                } else {
                    vdsgh = 0;
                    a = 1;
                }
            }
        });
    }

    public void jfh(ImageView imageView){

        imageView.setY((float) ((Math.random() * ++vdvfaf -200) + 200));
        imageView.setX((float) ((Math.random() * ++vdsvdu) + 0));
    }

}
