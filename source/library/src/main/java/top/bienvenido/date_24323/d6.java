package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d6.class */
public final class d6 implements Function1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final u2 f62;

    public d6() {
        u2 u2Var;
        q2 q2Var;
        try {
            try {
                Method declaredMethod = Class.forName("android.app.PropertyInvalidatedCache$CacheMap").getDeclaredMethod("clear", i.f159);
                declaredMethod.setAccessible(true);
                u2Var = q2Var;
                q2Var = new q2(declaredMethod);
            } catch (Exception unused) {
                u2Var = u2.f337;
            }
        } catch (Exception unused2) {
            u2Var = u2.f337;
        }
        this.f62 = u2Var;
    }

    public final Object invoke(Object obj) {
        this.f62.mo432(obj, new Object[0]);
        return Unit.INSTANCE;
    }
}
