package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Ref;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z3.class */
public final class z3 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        if (f4.f91) {
            try {
                int iIndexOf = ArraysKt.indexOf(method.getParameterTypes(), IBinder.class);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (iIndexOf >= 0) {
                    objectRef.element = (IBinder) objArr[iIndexOf];
                }
                int i = 0;
                int length = objArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Intent[].class.isInstance(objArr[i])) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    Intent[] intentArr = (Intent[]) objArr[i];
                    IBinder[] iBinderArr = new IBinder[1];
                    Intent[] intentArr2 = (Intent[]) l6.f212xaa30c2c7.m222((v2) -> {
                        return m581(r1, r2, v2);
                    });
                    if (intentArr2 != null) {
                        if (intentArr2.length == 0) {
                            return 0;
                        }
                        IBinder iBinder = iBinderArr[0];
                        if (iBinder != null && iIndexOf >= 0) {
                            objArr[iIndexOf] = iBinder;
                        }
                        objArr[i] = intentArr2;
                        if (intentArr2.length != intentArr.length) {
                            int i2 = i + 1;
                            if (String[].class.isInstance(objArr[i2])) {
                                objArr[i2] = new String[intentArr2.length];
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Intent[] m581(Ref.ObjectRef objectRef, Intent[] intentArr, s0 s0Var) {
        return s0Var.mo329((IBinder) objectRef.element, intentArr, f4.f97xb7bf1d91);
    }
}
