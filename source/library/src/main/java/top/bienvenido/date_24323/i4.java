package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.common.initialize.MNative;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/i4.class */
public abstract class i4 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m211() {
        try {
            Bundle bundleCall = b3.f17.getContentResolver().call(Uri.parse("content://" + b3.f18 + ".service.provider"), "method", (String) null, (Bundle) null);
            if (bundleCall != null) {
                m210(bundleCall);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, java.util.ArrayList] */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m210(Bundle bundle) {
        try {
            Iterator it = j4.f182.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(bundle);
            }
        } catch (Exception unused) {
        }
        try {
            IBinder binder = bundle.getBinder("https://www.62v.net/jnative/binder");
            if (binder != null) {
                binder.linkToDeath(new h4(binder), 0);
                String strValueOf = String.valueOf(bundle.getInt(Integer.TYPE.getName(), 0));
                ?? r0 = new Object[2];
                r0[0] = binder;
                r0[1] = strValueOf;
                ?? r1 = j4.f182;
                synchronized (r1) {
                    try {
                        MNative.m687(1001, r0);
                    } catch (Throwable th) {
                        throw r1;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
