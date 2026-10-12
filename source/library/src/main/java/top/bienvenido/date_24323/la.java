package top.bienvenido.date_24323;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/la.class */
public final class la extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final la f216 = new la();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() throws ClassNotFoundException {
        Object obj;
        d1 d1VarM657;
        Function2 function2;
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
        Class[] clsArr = i.f159;
        Object objMo432 = t2.m484(cls, "getWindowSession", clsArr).mo432((Object) null, new Object[0]);
        if (objMo432 != null) {
            d1 d1Var = new d1(objMo432, c0082);
            t2.m483(cls, "sWindowSession").mo394((Object) null, d1Var.f57);
            int[] iArr = {96417, -52475205, -920924064, -554281187, -1246845601, -129352154, 716732643};
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                p9 p9Var = new p9(0);
                p9Var.f277 = 5;
                p9Var.f276 = new int[]{2002, 2003, 2006, 2007, 2010};
                Unit unit = Unit.INSTANCE;
                function2 = (v1, v2) -> {
                    return m260(r0, v1, v2);
                };
            } else {
                function2 = jaVar;
                ja jaVar = new ja(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.ka
                    public final Object get(Object obj2) {
                        return ((WindowManager.LayoutParams) obj2).packageName;
                    }

                    public final void set(Object obj2, Object obj3) {
                        ((WindowManager.LayoutParams) obj2).packageName = (String) obj3;
                    }
                });
            }
            d1Var.m118(iArr, new z4(WindowManager.LayoutParams.class, function2));
            obj = d1Var.f57;
        } else {
            obj = null;
        }
        Object objMo433 = t2.m484(cls, "getWindowManagerService", clsArr).mo432((Object) null, new Object[0]);
        if (objMo433 == null || (d1VarM657 = m657("window", objMo433)) == null) {
            return;
        }
        t2.m483(cls, "sWindowManagerService").mo394((Object) null, d1VarM657.f57);
        Object obj2 = obj;
        t2.m482((AbstractC0065x6082d607.f499 ? "com.android.internal.policy." : "com.android.internal.policy." + "impl.") + "PhoneWindow$WindowManagerHolder", "sWindowManager").mo394((Object) null, d1VarM657.f57);
        if (obj2 != null) {
            d1VarM657.f54.m386(1788161260, new t4(obj));
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m260(p9 p9Var, WindowManager.LayoutParams layoutParams, String str) {
        layoutParams.packageName = str;
        if (a.m2(p9Var.f276, p9Var.f277, layoutParams.type) >= 0) {
            layoutParams.type = 2038;
        }
        return Unit.INSTANCE;
    }
}
