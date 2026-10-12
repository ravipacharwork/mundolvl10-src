package top.bienvenido.date_24323;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c1.class */
public final class c1 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m96(Class cls, o9 o9Var) {
        CollectionsKt.addAll(o9Var, cls.getInterfaces());
        Class superclass = cls.getSuperclass();
        if (Object.class.equals(superclass)) {
            superclass = null;
        }
        if (superclass != null) {
            m96(superclass, o9Var);
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m95(Object obj, d2 d2Var) {
        InvocationHandler invocationHandler = (v2, v3, v4) -> {
            return m94(r1, r2, v2, v3, v4);
        };
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        o9 o9Var = new o9(2);
        m96(cls, o9Var);
        return Proxy.newProxyInstance(classLoader, (Class[]) o9Var.toArray(i.f159), invocationHandler);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m94(d2 d2Var, Object obj, Object obj2, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = i.f160;
        }
        return d2Var.mo1(obj, method, objArr);
    }
}
