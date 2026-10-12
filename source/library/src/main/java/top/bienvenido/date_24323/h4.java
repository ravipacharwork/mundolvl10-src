package top.bienvenido.date_24323;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/h4.class */
public final class h4 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ IBinder f128;

    public h4(IBinder iBinder) {
        this.f128 = iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f128.unlinkToDeath(this, 0);
            if (f4.f91) {
                ((s0) l6.f212xaa30c2c7.m221()).mo338(h6.f130, f4.f92, f4.f93, f4.f94, f4.f97xb7bf1d91);
            }
        } catch (Exception unused) {
        }
    }
}
