package top.bienvenido.date_24323;

import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import java.lang.reflect.Method;
import java.net.URI;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.跟你合作就像在操一只装满尿的靴子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子.class */
public final class C0080 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            String str = f4.f98;
            if (str.length() > 0 && Intrinsics.areEqual(objArr[0], ConnectivityManager.getProcessDefaultNetwork())) {
                URI uriCreate = URI.create(str);
                return ProxyInfo.buildDirectProxy(uriCreate.getHost(), uriCreate.getPort(), CollectionsKt.listOf(new String[]{"*.cn", "localhost", "127.*", "[::1]", "0.0.0.0", "[::0]"}));
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
