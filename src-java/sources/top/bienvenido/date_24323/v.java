package top.bienvenido.date_24323;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/v.class */
public final class v extends n1 {
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    @Override // top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        Object objNewInstance;
        try {
            return super.mo1(obj, method, objArr);
        } catch (Exception unused) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isPrimitive()) {
                n9 n9Var = C0082.f528;
                if (Intrinsics.areEqual(returnType, Void.TYPE)) {
                    objNewInstance = null;
                } else {
                    Object objM385 = C0082.f528.m385(returnType.hashCode());
                    objNewInstance = objM385;
                    if (objM385 == null) {
                        Class<?> componentType = returnType.getComponentType();
                        if (componentType != null) {
                            objNewInstance = Array.newInstance(componentType, 0);
                        } else {
                            objNewInstance = null;
                        }
                    }
                }
            } else {
                objNewInstance = null;
            }
            return objNewInstance;
        }
    }
}
