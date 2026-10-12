package top.bienvenido.date_24323;

import com.android.internal.infra.AndroidFuture;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/j9.class */
public final class j9 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final j9 f191 = new j9();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        C0082 c0082;
        boolean z = AbstractC0065x6082d607.f5065;
        if (!z || AbstractC0065x6082d607.f507) {
            c0082 = u4.f341;
        } else {
            c0082 = g9Var;
            g9 g9Var = new g9();
        }
        this.f485 = c0082;
        d1 d1VarM71 = b9.m71("shortcut", c0082, null);
        if (d1VarM71 == null) {
            return;
        }
        if (AbstractC0065x6082d607.f507) {
            d1VarM71.f54.m386(451961580, new h9());
            d1VarM71.f54.m386(532289435, new i9());
            d1VarM71.m118(new int[]{-822057436, 501628912, -658792913}, u4.f345xb7bf1d91);
            Function1 function1 = g1.f114;
            d1VarM71.m118(new int[]{-2037178825, -329985383}, new t4(j.f178));
            return;
        }
        if (z) {
            d2 d2Var = u4.f339;
            Function1 function2 = g1.f114;
            d1VarM71.m118(new int[]{-329985383, -2037178825}, new t4(AndroidFuture.completedFuture(j.f178)));
            d1VarM71.m118(new int[]{-658792913, 501628912, 451961580, -822057436}, new t4(AndroidFuture.completedFuture(Boolean.FALSE)));
        }
    }
}
