package top.bienvenido.date_24323;

import android.bluetooth.IBluetoothManagerCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: renamed from: top.bienvenido.date_24323.在我今晚就把你妈墓碑掰弯, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯.class */
public final class C0040 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ C0031x7011f1e3 f476;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ d2 f477;

    public C0040(C0031x7011f1e3 c0031x7011f1e3, d2 d2Var) {
        this.f476 = c0031x7011f1e3;
        this.f477 = d2Var;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        C0062 c0062;
        try {
            Object obj2 = objArr[0];
            if (obj2 instanceof IBluetoothManagerCallback) {
                Object obj3 = this.f476.get(obj2);
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = c0062;
                    c0062 = new C0062((IBluetoothManagerCallback) obj2, this.f477);
                    this.f476.put(obj2, obj4);
                    Unit unit = Unit.INSTANCE;
                }
                objArr[0] = obj4;
            }
        } catch (Throwable unused) {
        }
        Object objInvoke = method.invoke(obj, objArr);
        if (objInvoke == null) {
            return null;
        }
        return c1.m95(objInvoke, this.f477);
    }
}
