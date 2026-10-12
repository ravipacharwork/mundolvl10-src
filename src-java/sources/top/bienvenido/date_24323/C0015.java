package top.bienvenido.date_24323;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你妈的蛆脸已经在我的鞋底呻吟几个小时了你爹就喜欢我用鞋底按摩出的你妈的肿大溃烂流脓的蛆脸, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你妈的蛆脸已经在我的鞋底呻吟几个小时了你爹就喜欢我用鞋底按摩出的你妈的肿大溃烂流脓的蛆脸.class */
public final class C0015 extends C0082 {
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0015, B:10:0x0020, B:14:0x0032, B:16:0x003d, B:19:0x004c, B:22:0x0064, B:27:0x0076, B:31:0x0081, B:32:0x0088, B:34:0x008e, B:40:0x00a7, B:43:0x00b2, B:50:0x00cb, B:13:0x002b), top: B:54:0x0000 }] */
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        String str;
        try {
            if (f4.f91) {
                Intent intent = (Intent) d2.m119(objArr, Intent.class);
                if (intent != null) {
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        String packageName = component.getPackageName();
                        str = packageName;
                        if (packageName == null) {
                            str = intent.getPackage();
                        }
                    } else {
                        str = intent.getPackage();
                    }
                    if (!Intrinsics.areEqual(str, b3.f18)) {
                        IServiceConnection iServiceConnection = (IServiceConnection) d2.m119(objArr, IServiceConnection.class);
                        if (iServiceConnection != null) {
                            Integer num = (Integer) e4.f76xaa30c2c7.m222((v2) -> {
                                return m606(r1, r2, v2);
                            });
                            int iIntValue = num != null ? num.intValue() : -1;
                            if (iIntValue >= 0) {
                                return Integer.valueOf(iIntValue);
                            }
                        }
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            if ((!n.f232 && ArraysKt.contains(n.f233, iHashCode)) || iHashCode == -1115994113) {
                                String action = intent.getAction();
                                return Integer.valueOf((action != null ? action.hashCode() : 0) == 1035177747 ? 1 : 0);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m606(Intent intent, IServiceConnection iServiceConnection, f0 f0Var) {
        return f0Var.mo79(intent, iServiceConnection.asBinder(), f4.f94);
    }
}
