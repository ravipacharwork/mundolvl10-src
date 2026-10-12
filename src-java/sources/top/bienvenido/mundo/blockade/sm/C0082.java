package top.bienvenido.mundo.blockade.sm;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.date_24323.g1;
import top.bienvenido.date_24323.j;
import top.bienvenido.date_24323.n1;
import top.bienvenido.date_24323.n9;

/* JADX INFO: renamed from: top.bienvenido.mundo.blockade.sm.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/blockade/sm/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.class */
public class C0082 extends n1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final n9 f528;

    static {
        Pair pair = TuplesKt.to(Integer.valueOf(String.class.hashCode()), "0");
        Pair pair2 = TuplesKt.to(Integer.valueOf(Long.TYPE.hashCode()), 0L);
        Pair pair3 = TuplesKt.to(Integer.valueOf(Short.TYPE.hashCode()), (short) 0);
        Pair pair4 = TuplesKt.to(Integer.valueOf(Float.TYPE.hashCode()), Float.valueOf(0.0f));
        Pair pair5 = TuplesKt.to(Integer.valueOf(Character.TYPE.hashCode()), '0');
        Pair pair6 = TuplesKt.to(Integer.valueOf(Byte.TYPE.hashCode()), (byte) 0);
        Pair pair7 = TuplesKt.to(Integer.valueOf(Integer.TYPE.hashCode()), 0);
        Pair pair8 = TuplesKt.to(Integer.valueOf(Double.TYPE.hashCode()), Double.valueOf(0.0d));
        Pair pair9 = TuplesKt.to(Integer.valueOf(Boolean.TYPE.hashCode()), Boolean.FALSE);
        Pair pair10 = TuplesKt.to(Integer.valueOf(List.class.hashCode()), Collections.EMPTY_LIST);
        Integer numValueOf = Integer.valueOf(ParceledListSlice.class.hashCode());
        Function1 function1 = g1.f114;
        Pair[] pairArr = {pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, TuplesKt.to(numValueOf, j.f178)};
        n9 n9Var = new n9(11);
        for (int i = 0; i < 11; i++) {
            Pair pair11 = pairArr[i];
            n9Var.m386(((Number) pair11.getFirst()).intValue(), pair11.getSecond());
        }
        f528 = n9Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo1(Object obj, Method method, Object[] objArr) {
        Object objNewInstance;
        try {
            return super.mo1(obj, method, objArr);
        } catch (Throwable unused) {
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(returnType, Void.TYPE)) {
                objNewInstance = null;
            } else {
                Object objM385 = f528.m385(returnType.hashCode());
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
            return objNewInstance;
        }
    }
}
