package top.bienvenido.date_24323;

import android.app.NotificationChannel;
import android.content.pm.ParceledListSlice;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q6.class */
public final class q6 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    List<NotificationChannel> listM157 = g1.m157(obj2);
                    if (listM157 != null) {
                        for (NotificationChannel notificationChannel : listM157) {
                            p2 p2Var = AbstractC0064.f492;
                            String str = f4.f92;
                            p2 p2Var2 = AbstractC0064.f492;
                            p2Var2.f270.mo394(notificationChannel, AbstractC0020.m616(str, notificationChannel.getId()));
                            if (notificationChannel.getSound() != null) {
                                notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, notificationChannel.getAudioAttributes());
                            }
                        }
                        Function1 function1 = g1.f114;
                        if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                            g1.m158(listM157);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
