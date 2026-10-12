package top.bienvenido.date_24323;

import android.util.Singleton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: top.bienvenido.date_24323.本野爹我用虎式坦克击落然后后空翻落地之后子宫炸裂一堆蛆虫看你妈的血逼很银荡便在你妈的血逼里筑了个巢, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/本野爹我用虎式坦克击落然后后空翻落地之后子宫炸裂一堆蛆虫看你妈的血逼很银荡便在你妈的血逼里筑了个巢.class */
public final class C0063 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final C0063 f491 = new C0063();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m664() {
        u2 s2Var;
        r2 r2Var;
        try {
            Field declaredField = Class.forName("android.app.ActivityClient").getDeclaredField("INTERFACE_SINGLETON");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            } else {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        Object objMo393 = s2Var.mo393(null);
        if (objMo393 != null && (objMo393 instanceof Singleton)) {
            l9.f215.mo394(objMo393, (Object) null);
            p2 p2Var = new p2("mKnownInstance");
            Object objMo394 = p2Var.f270.mo393(objMo393);
            if (objMo394 == null) {
                return;
            }
            d1 d1Var = new d1(objMo394, u4.f340);
            d1Var.f54.m386(463520714, new C0033());
            d1Var.f54.m386(1293072352, new C0014());
            d1Var.f54.m386(-1666360360, AbstractC0019.f456);
            d1Var.f54.m386(1770569149, AbstractC0019.f457);
            d1Var.f54.m386(1349683719, new C0086b());
            d1Var.f54.m386(1985825802, new C0039());
            d1Var.f54.m386(-1111243300, z6.f442);
            p2Var.f270.mo394(objMo393, d1Var.f57);
        }
    }
}
