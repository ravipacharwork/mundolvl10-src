package top.bienvenido.date_24323;

import android.app.AppCompatCallbacks;
import android.graphics.Compatibility;
import android.graphics.RecordingCanvas;
import android.os.StrictMode;
import dalvik.system.ZipPathValidator;
import java.security.Security;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/t9.class */
public abstract class t9 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m492() {
        try {
            if (AbstractC0065x6082d607.f500) {
                t2.m484(StrictMode.class, "disableDeathOnFileUriExposure", i.f159).mo432((Object) null, new Object[0]);
                if (AbstractC0065x6082d607.f503) {
                    Security.removeProvider("AndroidNSSP");
                    if (AbstractC0065x6082d607.f504xb7bf1d91) {
                        t2.m483(RecordingCanvas.class, "MAX_BITMAP_SIZE").mo394((Object) null, (Object) Integer.MAX_VALUE);
                        if (AbstractC0065x6082d607.f505) {
                            m493();
                            if (AbstractC0065x6082d607.f5065) {
                                Compatibility.setTargetSdkVersion(3);
                                if (AbstractC0065x6082d607.f508) {
                                    ZipPathValidator.clearCallback();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m493() {
        try {
            p2 p2Var = new p2("disabledCompatChanges");
            h6.f130.getClass();
            Object obj = h6.f134;
            long[] jArr = (long[]) p2Var.f270.mo393(obj);
            if (jArr == null) {
                return;
            }
            long[] jArrPlus = ArraysKt.plus(jArr, new long[]{218865702, 154726397, 241104082, 255371817, 160794467, 148963590, 171317480, 144027538, 148964793, 169887240, 147798919, 309578419, 270674727});
            ArraysKt.sort(jArrPlus);
            p2Var.f270.mo394(obj, jArrPlus);
            if (AbstractC0065x6082d607.f509dj) {
                AppCompatCallbacks.install(jArrPlus, (long[]) new p2("mLoggableCompatChanges").f270.mo393(obj));
            } else {
                AppCompatCallbacks.install(jArrPlus);
            }
        } catch (Throwable unused) {
        }
    }
}
