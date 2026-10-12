package top.bienvenido.date_24323;

import android.database.IContentObserver;
import android.net.Uri;
import java.lang.reflect.Method;
import kotlin.Unit;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d.class */
public final class d extends C0082 {
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Unit m116(Uri uri, IContentObserver iContentObserver, boolean z, i0 i0Var) {
        i0Var.mo155(uri, iContentObserver != null ? iContentObserver.asBinder() : null, z);
        return Unit.INSTANCE;
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (objArr.length >= 6) {
                objArr[5] = 22;
            }
            IContentObserver iContentObserver = (IContentObserver) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (AbstractC0065x6082d607.f505) {
                Uri[] uriArr = (Uri[]) objArr[0];
                if (uriArr != null) {
                    for (Uri uri : uriArr) {
                        p4.f271xaa30c2c7.m222((v3) -> {
                            return m115(r1, r2, r3, v3);
                        });
                    }
                }
            } else {
                Uri uri2 = (Uri) objArr[0];
                if (uri2 != null) {
                    p4.f271xaa30c2c7.m222((v3) -> {
                        return m116(r1, r2, r3, v3);
                    });
                }
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m115(Uri uri, IContentObserver iContentObserver, boolean z, i0 i0Var) {
        i0Var.mo155(uri, iContentObserver != null ? iContentObserver.asBinder() : null, z);
        return Unit.INSTANCE;
    }
}
