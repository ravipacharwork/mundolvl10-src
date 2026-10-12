package top.bienvenido.date_24323;

import android.content.Intent;
import java.lang.reflect.Method;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z0.class */
public final class z0 extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final z0 f431 = new z0();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Intent m578(int i, Intent intent, s0 s0Var) {
        return s0Var.mo331((((long) f4.f97xb7bf1d91) & 4294967295L) | ((((long) i) << 32) & (-4294967296L)), intent);
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Intent[] intentArr = (Intent[]) d2.m119(objArr, Intent[].class);
            if (f4.f91 && intentArr != null) {
                int iIntValue = ((Integer) objArr[0]).intValue();
                int length = intentArr.length;
                for (int i = 0; i < length; i++) {
                    Intent intent = intentArr[i];
                    Intent intent2 = (iIntValue == 1 || iIntValue == 2 || iIntValue == 4 || iIntValue == 5) ? (Intent) l6.f212xaa30c2c7.m222((v2) -> {
                        return m578(r1, r2, v2);
                    }) : null;
                    Intent intent3 = intent2;
                    int length2 = objArr.length - 3;
                    Object obj2 = objArr[length2];
                    if (intent3 != null) {
                        intentArr[i] = intent2;
                        if (obj2 instanceof Integer) {
                            objArr[length2] = Integer.valueOf((((Number) obj2).intValue() & (-67108865)) | 50331648);
                        }
                    } else if (AbstractC0065x6082d607.f508 && (obj2 instanceof Integer)) {
                        int iIntValue2 = ((Number) obj2).intValue();
                        if (!q1.m427(iIntValue2, 536870912) && q1.m427(iIntValue2, 33554432) && intent.getComponent() == null && intent.getPackage() == null) {
                            objArr[length2] = Integer.valueOf((((Number) obj2).intValue() & (-33554433)) | 83886080);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
