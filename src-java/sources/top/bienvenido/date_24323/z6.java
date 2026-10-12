package top.bienvenido.date_24323;

import android.app.ActivityClient;
import android.app.ActivityTaskManager;
import android.app.ActivityThread;
import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z6.class */
public final class z6 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final z6 f442 = new z6();

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            if (f4.f91 && (obj2 instanceof IBinder)) {
                h6.f130.getClass();
                ActivityThread.ActivityClientRecord activityClient = h6.f131.getActivityClient((IBinder) obj2);
                if (activityClient != null) {
                    Intent intent = (Intent) f9.f104xaa30c2c7.f270.mo393(activityClient);
                    if (intent != null && Intrinsics.areEqual("android.intent.action.MAIN", intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER") && intent.getCategories().size() == 1 && intent.getData() == null && intent.getType() == null) {
                        if (AbstractC0065x6082d607.f5065) {
                            ActivityClient.getInstance().moveActivityTaskToBack((IBinder) obj2, false);
                            return null;
                        }
                        ActivityTaskManager.getService().moveActivityTaskToBack((IBinder) obj2, false);
                        return null;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return method.invoke(obj, objArr);
    }
}
