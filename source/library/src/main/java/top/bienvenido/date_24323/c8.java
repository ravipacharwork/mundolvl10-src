package top.bienvenido.date_24323;

import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c8.class */
public final class c8 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            ProviderInfo providerInfo = (ProviderInfo) e5.f77xaa30c2c7.m222((v1) -> {
                return m108(r1, v1);
            });
            ProviderInfo providerInfo2 = providerInfo;
            if (providerInfo == null) {
                d2.m120(objArr, 1);
                Unit unit = Unit.INSTANCE;
                providerInfo2 = (ProviderInfo) method.invoke(obj, objArr);
            }
            if (providerInfo2 == null) {
                return null;
            }
            ProviderInfo providerInfo3 = providerInfo2;
            C0051.m649(((ComponentInfo) providerInfo3).applicationInfo);
            return providerInfo3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ProviderInfo m108(Object[] objArr, p0 p0Var) {
        return p0Var.mo277(String.valueOf(objArr[0]));
    }
}
