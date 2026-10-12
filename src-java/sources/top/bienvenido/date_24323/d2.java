package top.bienvenido.date_24323;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d2.class */
public class d2 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo1(Object obj, Method method, Object[] objArr) {
        return method.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m119(Object[] objArr, Class cls) {
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m120(Object[] objArr, int i) {
        try {
            Object obj = objArr[i];
            if (obj instanceof Integer) {
                objArr[i] = Integer.valueOf(((Number) obj).intValue() | 512);
            } else if (obj instanceof Long) {
                objArr[i] = Long.valueOf(((Number) obj).longValue() | 512);
            }
        } catch (Exception unused) {
        }
    }
}
