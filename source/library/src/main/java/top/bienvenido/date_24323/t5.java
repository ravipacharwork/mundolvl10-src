package top.bienvenido.date_24323;

import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/t5.class */
public final class t5 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ IBinder f330;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ s5 f331;

    public t5(IBinder iBinder, s5 s5Var) {
        this.f330 = iBinder;
        this.f331 = s5Var;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m488(IBinder iBinder, t5 t5Var, s5 s5Var) {
        try {
            iBinder.unlinkToDeath(t5Var, 0);
            u5.m509(s5Var);
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ExecutorService executorService = AbstractC0030.f466;
        IBinder iBinder = this.f330;
        s5 s5Var = this.f331;
        AbstractC0030.f467.execute(() -> {
            m488(r0, r1, r2);
        });
    }
}
