package top.bienvenido.date_24323;

import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w0.class */
public final class w0 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final w0 f370 = new w0();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        z4 z4Var = new z4(EditorInfo.class, new u0(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.v0
            public final Object get(Object obj) {
                return ((EditorInfo) obj).packageName;
            }

            public final void set(Object obj, Object obj2) {
                ((EditorInfo) obj).packageName = (String) obj2;
            }
        }));
        this.f485 = z4Var;
        d1 d1VarM71 = b9.m71("input_method", z4Var, null);
        if (d1VarM71 == null) {
            return;
        }
        if (AbstractC0065x6082d607.f508) {
            t2.m482("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "sServiceCache").mo394((Object) null, d1VarM71.f57);
            return;
        }
        new p2("mService").f270.mo394(b3.f17.getSystemService("input_method"), d1VarM71.f57);
    }
}
