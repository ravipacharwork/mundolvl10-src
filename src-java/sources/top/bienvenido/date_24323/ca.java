package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/ca.class */
public abstract class ca {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unsafe f51;

    static {
        Method declaredMethod = Unsafe.class.getDeclaredMethod("getUnsafe", i.f159);
        declaredMethod.setAccessible(true);
        f51 = (Unsafe) declaredMethod.invoke(null, i.f160);
    }
}
