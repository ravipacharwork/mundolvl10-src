package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.前段时间你家发大水因为你爹出轨你妈过于空虚导致淫水泛滥后来老王闻其此事立马赶到你家脱下了裤子把他的那根硕大鸡巴塞进了你妈屄堵住了洞口至此洪水停止了, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/前段时间你家发大水因为你爹出轨你妈过于空虚导致淫水泛滥后来老王闻其此事立马赶到你家脱下了裤子把他的那根硕大鸡巴塞进了你妈屄堵住了洞口至此洪水停止了.class */
public final class C0037x55ac7193 extends C0082 {
    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: Exception -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0015, B:10:0x0020, B:16:0x0039, B:18:0x0044, B:15:0x0032), top: B:25:0x0000 }] */
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        String str;
        ComponentName componentName;
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
                    if (!Intrinsics.areEqual(str, b3.f18) && (componentName = (ComponentName) e4.f76xaa30c2c7.m222((v1) -> {
                        return m638(r1, v1);
                    })) != null) {
                        return componentName;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ComponentName m638(Intent intent, f0 f0Var) {
        return f0Var.mo76xaa30c2c7(intent, f4.f94);
    }
}
