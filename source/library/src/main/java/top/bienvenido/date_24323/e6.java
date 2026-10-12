package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/e6.class */
public final class e6 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final u2 f78 = t2.m482("android.app.PropertyInvalidatedCache", "mCache");

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Function1 f79;

    public e6() {
        Function1 function1;
        if (AbstractC0065x6082d607.f510x541a43c1) {
            function1 = d6Var;
            d6 d6Var = new d6();
        } else {
            function1 = e6::m132;
        }
        this.f79 = function1;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m132(Object obj) {
        TypeIntrinsics.asMutableMap(obj).clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m133(Class cls, String str) {
        u2 s2Var;
        r2 r2Var;
        Function1 function1 = this.f79;
        u2 u2Var = this.f78;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            } else {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        Object objMo393 = s2Var.mo393(null);
        if (objMo393 == null) {
            return;
        }
        function1.invoke(u2Var.mo393(objMo393));
    }
}
