package top.bienvenido.date_24323;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.List;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/r6.class */
public final class r6 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        Object objMo1 = super.mo1(obj, method, objArr);
        try {
            if (f4.f91) {
                List listM157 = g1.m157(objMo1);
                if (listM157 != null) {
                    p2 p2Var = AbstractC0064.f492;
                    AbstractC0064.m667(listM157, f4.f92);
                    return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? g1.m158(listM157) : listM157;
                }
            }
        } catch (Exception unused) {
        }
        return objMo1;
    }
}
