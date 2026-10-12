package top.bienvenido.date_24323;

import android.database.IContentObserver;
import android.net.Uri;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b.class */
public final class b extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Uri uri = (Uri) objArr[0];
            IContentObserver iContentObserver = (IContentObserver) objArr[2];
            if (uri != null && iContentObserver != null) {
                p4.f271xaa30c2c7.m222((v3) -> {
                    return m23(r1, r2, r3, v3);
                });
            }
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                objArr[4] = 22;
                if (AbstractC0065x6082d607.f509dj && Intrinsics.areEqual(objArr[objArr.length - 2], -2)) {
                    objArr[objArr.length - 2] = Integer.valueOf(b3.f20);
                }
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m23(Uri uri, Object[] objArr, IContentObserver iContentObserver, i0 i0Var) {
        i0Var.mo153(uri, iContentObserver.asBinder(), ((Boolean) objArr[1]).booleanValue());
        return Unit.INSTANCE;
    }
}
