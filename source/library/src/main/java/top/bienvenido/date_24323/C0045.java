package top.bienvenido.date_24323;

import android.net.LinkProperties;
import android.net.ProxyInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import kotlin.collections.CollectionsKt;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.就你这微不足道的臭鸡巴别人帮你口都说你鸡巴臭你婊子妈当年帮爷口都说爷鸡巴香, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/就你这微不足道的臭鸡巴别人帮你口都说你鸡巴臭你婊子妈当年帮爷口都说爷鸡巴香.class */
public final class C0045 extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final u2 f479;

    public C0045() {
        u2 s2Var;
        r2 r2Var;
        try {
            Field declaredField = LinkProperties.class.getDeclaredField("mHttpProxy");
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
        this.f479 = s2Var;
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        Object objMo1 = super.mo1(obj, method, objArr);
        if (objMo1 == null) {
            return null;
        }
        String str = f4.f98;
        if (str.length() > 0 && (objMo1 instanceof LinkProperties)) {
            try {
                u2 u2Var = this.f479;
                URI uriCreate = URI.create(str);
                u2Var.mo394(objMo1, ProxyInfo.buildDirectProxy(uriCreate.getHost(), uriCreate.getPort(), CollectionsKt.listOf(new String[]{"*.cn", "localhost", "127.*", "[::1]", "0.0.0.0", "[::0]"})));
                return objMo1;
            } catch (Exception unused) {
            }
        }
        return objMo1;
    }
}
