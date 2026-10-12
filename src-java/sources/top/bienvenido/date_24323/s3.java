package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/s3.class */
public final class s3 implements Function2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ u2 f302;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ u2 f303;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final /* synthetic */ u2 f304;

    public s3(u2 u2Var, u2 u2Var2, u2 u2Var3) {
        this.f302 = u2Var;
        this.f303 = u2Var2;
        this.f304 = u2Var3;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m476(Object obj, IBinder iBinder) {
        try {
            Intent intent = (Intent) this.f302.mo393(obj);
            if (intent == null) {
                return;
            }
            Triple tripleM570 = xxx.m570(intent);
            if (tripleM570 == null) {
                return;
            }
            Intent intent2 = (Intent) tripleM570.getFirst();
            k1 k1Var = k1.f194;
            ComponentName component = intent2.getComponent();
            ActivityInfo activityInfo = component != null ? (ActivityInfo) k1.f195.m385(component.getClassName().hashCode()) : null;
            if (activityInfo == null) {
                ActivityInfo activityInfoM487 = t3.m487(intent2);
                activityInfo = activityInfoM487;
                if (activityInfoM487 == null) {
                    return;
                }
            }
            this.f303.mo394(obj, activityInfo);
            this.f304.mo394(obj, tripleM570.getThird());
            this.f302.mo394(obj, intent2);
            IBinder iBinder2 = (IBinder) tripleM570.getSecond();
            if (iBinder2 != null) {
                ExecutorService executorService = AbstractC0030.f466;
                AbstractC0030.f466.execute(() -> {
                    m475(r0, r1);
                });
            }
        } catch (Exception unused) {
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m476(obj, (IBinder) obj2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m475(IBinder iBinder, IBinder iBinder2) {
        l6.f212xaa30c2c7.m222((v2) -> {
            return m474(r1, r2, v2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m474(IBinder iBinder, IBinder iBinder2, s0 s0Var) {
        s0Var.mo332(iBinder, iBinder2);
        return Unit.INSTANCE;
    }
}
