package top.bienvenido.date_24323;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/g4.class */
public final class g4 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ IBinder f116;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ j4 f117;

    public g4(IBinder iBinder, j4 j4Var) {
        this.f116 = iBinder;
        this.f117 = j4Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f116.unlinkToDeath(this, 0);
            this.f117.f185 = null;
        } catch (Exception unused) {
        }
    }
}
