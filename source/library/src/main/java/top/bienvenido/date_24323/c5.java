package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c5.class */
public final class c5 implements Callable, Comparable {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public Object f39;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f39;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        try {
            if (obj instanceof Class) {
                this.f39 = obj;
                return 1;
            }
            if (!(obj instanceof String)) {
                return 0;
            }
            if (StringsKt.startsWith$default((String) obj, "deps:", false, 2, (Object) null)) {
                this.f39 = "30687";
                return 1;
            }
            if (StringsKt.startsWith$default((String) obj, "marco:", false, 2, (Object) null)) {
                fa faVar = fa.f108;
                fa.m151(((String) obj).substring(6));
                this.f39 = obj;
                return 1;
            }
            for (Method method : ((Class) this.f39).getDeclaredMethods()) {
                if (Intrinsics.areEqual(method.getName(), obj) && (method.getModifiers() & 256) != 0) {
                    this.f39 = method;
                    return 1;
                }
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
