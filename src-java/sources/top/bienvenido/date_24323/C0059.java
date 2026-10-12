package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.text.StringsKt;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.我看你妈生你的时候是不是羊水把你的煞笔脑子堵住了这么不好使, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/我看你妈生你的时候是不是羊水把你的煞笔脑子堵住了这么不好使.class */
public final class C0059 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            String strValueOf = String.valueOf(objArr[1]);
            C0046 c0046 = C0046.f480;
            p9 p9Var = C0046.f481;
            if (a.m2(p9Var.f276, p9Var.f277, strValueOf.hashCode()) >= 0 || StringsKt.startsWith$default(strValueOf, "com.google.android.", false, 2, (Object) null)) {
                String str = "Assume application obtained permission state -> " + strValueOf;
                return 0;
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
