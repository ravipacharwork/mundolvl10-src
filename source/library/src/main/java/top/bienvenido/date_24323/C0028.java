package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你爹菊花被肛烂了生出你这么个辣鸡玩意儿, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你爹菊花被肛烂了生出你这么个辣鸡玩意儿.class */
public final class C0028 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function2 f465;

    public C0028(Function2 function2) {
        this.f465 = function2;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            if (obj2 instanceof ComponentName) {
                String packageName = ((ComponentName) obj2).getPackageName();
                if (!Intrinsics.areEqual(packageName, b3.f18)) {
                    if (!f4.f96 && Intrinsics.areEqual(packageName, f4.f92)) {
                        d2.m120(objArr, 1);
                        Object objInvoke = method.invoke(obj, objArr);
                        if (objInvoke == null) {
                            return null;
                        }
                        C0051.m649(((ComponentInfo) objInvoke).applicationInfo);
                        return objInvoke;
                    }
                    ComponentInfo componentInfo = (ComponentInfo) e5.f77xaa30c2c7.m222((v2) -> {
                        return m622(r1, r2, v2);
                    });
                    if (componentInfo != null) {
                        C0051.m649(componentInfo.applicationInfo);
                        return componentInfo;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return method.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ComponentInfo m622(C0028 c0028, Object obj, p0 p0Var) {
        return (ComponentInfo) c0028.f465.invoke(p0Var, obj);
    }
}
