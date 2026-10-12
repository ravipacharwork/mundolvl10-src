package top.bienvenido.date_24323;

import android.accounts.Account;
import android.os.IInterface;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你爹我明天去领你妈的死亡通知书, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你爹我明天去领你妈的死亡通知书.class */
public final class C0027 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function1 f464;

    public C0027(Function1 function1) {
        this.f464 = function1;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        return o3.f261xaa30c2c7.m222((v2) -> {
            return m621(r1, r2, v2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m621(Object[] objArr, C0027 c0027, b0 b0Var) {
        IInterface iInterface = (IInterface) objArr[0];
        b0Var.mo32(iInterface != null ? iInterface.asBinder() : null, (Account) objArr[1], ((Boolean) c0027.f464.invoke(objArr)).booleanValue());
        return Unit.INSTANCE;
    }
}
