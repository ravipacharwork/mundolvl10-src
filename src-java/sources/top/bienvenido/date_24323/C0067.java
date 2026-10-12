package top.bienvenido.date_24323;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: renamed from: top.bienvenido.date_24323.爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑.class */
public final class C0067 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        return o3.f261xaa30c2c7.m222((v1) -> {
            return m673(r1, v1);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m673(Object[] objArr, b0 b0Var) {
        IInterface iInterface = (IInterface) objArr[0];
        IBinder iBinderAsBinder = iInterface != null ? iInterface.asBinder() : null;
        Account account = (Account) objArr[1];
        Object obj = objArr[2];
        b0Var.mo46(iBinderAsBinder, account, obj != null ? obj.toString() : null);
        return Unit.INSTANCE;
    }
}
