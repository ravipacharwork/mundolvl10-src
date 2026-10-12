package top.bienvenido.date_24323;

import android.content.Intent;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.我对这你彪子小后妈就是一顿乱操操得血肉模糊后被我一套武士刀连招带走在你妈火化前先砍掉头颅使你妈死不得安宁最后一颗大伊万瞄准坐在你妈丧礼前的一家亲你妈顺势带着你全家下地狱, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/我对这你彪子小后妈就是一顿乱操操得血肉模糊后被我一套武士刀连招带走在你妈火化前先砍掉头颅使你妈死不得安宁最后一颗大伊万瞄准坐在你妈丧礼前的一家亲你妈顺势带着你全家下地狱.class */
public final class C0053xf522ba2d extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                Intent intent = (Intent) d2.m119(objArr, Intent.class);
                if (intent != null && (intent.getPackage() != null || intent.getComponent() != null)) {
                    ExecutorService executorService = AbstractC0030.f466;
                    AbstractC0030.f467.execute(() -> {
                        m653(r0);
                    });
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m652(Intent intent, f0 f0Var) {
        return f0Var.mo87(intent, f4.f94);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m653(Intent intent) {
        e4.f76xaa30c2c7.m222((v1) -> {
            return m652(r1, v1);
        });
    }
}
