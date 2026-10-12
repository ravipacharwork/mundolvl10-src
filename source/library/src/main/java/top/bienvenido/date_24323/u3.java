package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.app.ActivityManagerNative;
import android.util.Singleton;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/u3.class */
public abstract class u3 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Singleton f338;

    static {
        u2 s2Var;
        Singleton singleton;
        r2 r2Var;
        u2 s2Var2;
        r2 r2Var2;
        if (AbstractC0065x6082d607.f502xaa30c2c7) {
            try {
                Field declaredField = ActivityManager.class.getDeclaredField("IActivityManagerSingleton");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var2 = r2Var2;
                    r2Var2 = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var2 = u2.f337;
            }
            singleton = (Singleton) s2Var2.mo393(null);
        } else {
            try {
                Field declaredField2 = ActivityManagerNative.class.getDeclaredField("gDefault");
                declaredField2.setAccessible(true);
                if ((declaredField2.getModifiers() & 8) == 0 && !declaredField2.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField2));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField2);
                }
            } catch (Exception unused2) {
                s2Var = u2.f337;
            }
            singleton = (Singleton) s2Var.mo393(null);
        }
        f338 = singleton;
    }
}
