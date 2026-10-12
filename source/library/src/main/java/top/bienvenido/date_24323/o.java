package top.bienvenido.date_24323;

import android.app.Notification;
import java.lang.reflect.Method;
import kotlin.Unit;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/o.class */
public final class o extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final o f256 = new o();

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                int i = 0;
                int length = objArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Notification.class.isInstance(objArr[i])) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    int i2 = i;
                    Notification notificationClone = ((Notification) objArr[i]).clone();
                    p2 p2Var = AbstractC0064.f492;
                    AbstractC0064.m668(notificationClone, f4.f92);
                    Unit unit = Unit.INSTANCE;
                    objArr[i2] = notificationClone;
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
