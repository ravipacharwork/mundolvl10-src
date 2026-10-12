package top.bienvenido.date_24323;

import android.content.AttributionSourceState;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/x.class */
public final class x extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final x f391 = new x();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final int f392;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final String f393;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final u2 f394xaa30c2c7;

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final p2 f395;

    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public static final p2 f396xb7bf1d91;

    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public static final p2 f397;

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final d2 f3985;

    static {
        u2 u2Var;
        q2 q2Var;
        f392 = AbstractC0065x6082d607.f504xb7bf1d91 ? 2 : 1;
        f393 = b3.f18 + ".service.provider";
        try {
            try {
                Method declaredMethod = Class.forName("android.content.ContentProviderNative").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod.setAccessible(true);
                u2Var = q2Var;
                q2Var = new q2(declaredMethod);
            } catch (Exception unused) {
                u2Var = u2.f337;
            }
        } catch (Exception unused2) {
            u2Var = u2.f337;
        }
        f394xaa30c2c7 = u2Var;
        try {
            if (AbstractC0065x6082d607.f5065) {
                l4.m255(AttributionSourceState.class, x::m552);
            }
        } catch (Throwable unused3) {
        }
        f395 = new p2("provider");
        f396xb7bf1d91 = new p2("info");
        f397 = new p2("mLocal");
        f3985 = u4.m497(new v());
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (!f4.f91) {
                return super.mo1(obj, method, objArr);
            }
            int i = f392;
            Object obj2 = objArr[i];
            if (obj2 != null) {
                String string = obj2.toString();
                if (string != null) {
                    if (Intrinsics.areEqual(string, f393)) {
                        return super.mo1(obj, method, objArr);
                    }
                    Triple tripleM635 = SM.m635(string);
                    IBinder iBinder = (IBinder) tripleM635.getFirst();
                    if (iBinder != null) {
                        String str = (String) tripleM635.getSecond();
                        if (str != null) {
                            Object objMo432 = f394xaa30c2c7.mo432((Object) null, iBinder);
                            if (objMo432 != null) {
                                x xVar = f391;
                                objArr[i] = str;
                                Unit unit = Unit.INSTANCE;
                                Object objMo1 = super.mo1(obj, method, objArr);
                                f395.f270.mo394(objMo1, objMo432);
                                ProviderInfo providerInfo = (ProviderInfo) f396xb7bf1d91.f270.mo393(objMo1);
                                if (providerInfo == null) {
                                    return objMo1;
                                }
                                providerInfo.authority = string;
                                return objMo1;
                            }
                        }
                    } else {
                        ProviderInfo providerInfo2 = (ProviderInfo) tripleM635.getThird();
                        if (providerInfo2 != null) {
                            Object objAllocateInstance = ca.f51.allocateInstance(method.getReturnType());
                            p2 p2Var = f396xb7bf1d91;
                            C0051.m649(((ComponentInfo) providerInfo2).applicationInfo);
                            Unit unit2 = Unit.INSTANCE;
                            p2Var.f270.mo394(objAllocateInstance, providerInfo2);
                            if (!AbstractC0065x6082d607.f5065) {
                                return objAllocateInstance;
                            }
                            f397.f270.mo394(objAllocateInstance, Boolean.TRUE);
                            return objAllocateInstance;
                        }
                    }
                    Object objMo2 = super.mo1(obj, method, objArr);
                    Object obj3 = objMo2;
                    if (objMo2 != null) {
                        try {
                            p2 p2Var2 = f395;
                            Object objMo393 = p2Var2.f270.mo393(obj3);
                            if (objMo393 != null) {
                                p2Var2.f270.mo394(obj3, m554(objMo393));
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        obj3 = null;
                    }
                    return obj3;
                }
            }
            return super.mo1(obj, method, objArr);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m552(AttributionSourceState attributionSourceState) {
        try {
            attributionSourceState.uid = Binder.getCallingUid();
            boolean z = AbstractC0065x6082d607.f498;
            if (AbstractC0065x6082d607.f507) {
                attributionSourceState.pid = -1;
            }
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m554(Object obj) {
        d1 d1Var = new d1(obj, f3985);
        try {
            if (AbstractC0065x6082d607.f505) {
                d1Var.f54.m386(107944136, new w());
            }
        } catch (Exception unused) {
        }
        return d1Var.f57;
    }
}
