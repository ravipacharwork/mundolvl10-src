package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n1.class */
public class n1 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo1(Object obj, Method method, Object[] objArr) {
        if (f4.f91) {
            String str = f4.f92;
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                if (Intrinsics.areEqual(str, objArr[i])) {
                    objArr[i] = b3.f18;
                }
            }
        }
        return method.invoke(obj, objArr);
    }
}
