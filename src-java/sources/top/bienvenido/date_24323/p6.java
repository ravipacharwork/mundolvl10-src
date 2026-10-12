package top.bienvenido.date_24323;

import android.app.NotificationChannel;
import java.lang.reflect.Method;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/p6.class */
public final class p6 extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final int f273;

    public p6() {
        boolean z = AbstractC0065x6082d607.f498;
        this.f273 = AbstractC0065x6082d607.f504xb7bf1d91 ? 3 : 1;
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (!f4.f91) {
                return super.mo1(obj, method, objArr);
            }
            int length = objArr.length;
            int i = this.f273;
            if (length > i) {
                objArr[i] = AbstractC0020.m616(f4.f92, String.valueOf(objArr[i]));
            }
            Object objMo1 = super.mo1(obj, method, objArr);
            if (objMo1 instanceof NotificationChannel) {
                p2 p2Var = AbstractC0064.f492;
                AbstractC0064.m666((NotificationChannel) objMo1, f4.f92);
            }
            return objMo1;
        } catch (Exception unused) {
        }
    }
}
