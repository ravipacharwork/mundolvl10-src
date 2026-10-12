package top.bienvenido.date_24323;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: top.bienvenido.date_24323.用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/用搅拌机把你妈的阴扩一下.class */
public final class C0069 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        return o3.f261xaa30c2c7.m222((v1) -> {
            return m674(r1, v1);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m674(Object[] objArr, b0 b0Var) {
        IInterface iInterface = (IInterface) objArr[0];
        IBinder iBinderAsBinder = iInterface != null ? iInterface.asBinder() : null;
        Account account = (Account) objArr[1];
        Object obj = objArr[2];
        String string = obj != null ? obj.toString() : null;
        Object obj2 = objArr[3];
        Boolean bool = Boolean.TRUE;
        b0Var.mo39(iBinderAsBinder, account, string, Intrinsics.areEqual(obj2, bool), Intrinsics.areEqual(objArr[4], bool), (Bundle) objArr[5]);
        return Unit.INSTANCE;
    }
}
