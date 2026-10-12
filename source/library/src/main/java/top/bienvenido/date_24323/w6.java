package top.bienvenido.date_24323;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w6.class */
public final class w6 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f385;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean f386;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final /* synthetic */ x6 f387;

    public w6(x6 x6Var, IBinder iBinder, boolean z) {
        this.f387 = x6Var;
        this.f385 = iBinder;
        this.f386 = z;
        try {
            iBinder.linkToDeath(this, 0);
        } catch (Exception unused) {
            binderDied();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f387.m562(this.f385);
        } catch (Exception unused) {
        }
    }
}
