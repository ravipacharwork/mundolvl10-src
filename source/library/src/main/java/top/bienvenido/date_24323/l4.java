package top.bienvenido.date_24323;

import android.os.Parcelable;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/l4.class */
public abstract class l4 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m255(Class cls, Function1 function1) {
        u2 s2Var;
        r2 r2Var;
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            } else {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        s2Var.mo394((Object) null, new m4((Parcelable.Creator) s2Var.mo393(null), function1));
    }
}
