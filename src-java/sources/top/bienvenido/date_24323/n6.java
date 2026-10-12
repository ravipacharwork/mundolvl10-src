package top.bienvenido.date_24323;

import android.app.ActivityClient;
import android.app.ActivityManager;
import android.app.ActivityTaskManager;
import android.app.IActivityManager;
import android.app.TaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Singleton;
import android.widget.Toast;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.common.initialize.MNative;
import top.bienvenido.mundo.manifest.MundoIntermediary;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n6.class */
public final class n6 extends r0 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final n6 f241 = new n6();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ConcurrentHashMap f242 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final u8 f243 = new u8();

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final ActivityManager f244xaa30c2c7 = (ActivityManager) b3.f17.getSystemService("activity");

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final Function1 f245;

    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public static Function0 f246xb7bf1d91;

    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public static Function0 f247;

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static Function0 f2485;

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final Function1 f249;

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Intent mo331(long j, Intent intent) {
        Object objM385;
        int i = (int) ((j & (-4294967296L)) >>> 32);
        int i2 = (int) (j & 4294967295L);
        try {
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i2);
            }
            s5 s5Var = (s5) objM385;
            String str = s5Var != null ? s5Var.f310 : null;
            if (i == 1) {
                return xxx.m569(intent, str);
            }
            if (i == 2) {
                String str2 = str;
                Intent intent2 = new Intent(b3.f17, (Class<?>) MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", intent);
                if (str2 != null) {
                    bundle.putString(String.class.getName(), str);
                }
                return intent2.putExtras(bundle);
            }
            if (i != 4 && i != 5) {
                return null;
            }
            String str3 = str;
            Intent intentPutExtra = new Intent().setComponent(new ComponentName(b3.f18, MundoService$Companion$STUB.class.getName())).putExtra("android.intent.extra.INTENT", intent);
            if (str3 == null) {
                return intentPutExtra;
            }
            intentPutExtra.putExtra("user", str);
            return intentPutExtra;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public final void mo334xb7bf1d91(String str, String str2) {
        m383((ActivityInfo) null, str, str2);
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public final String mo340(IBinder iBinder) {
        try {
            x3 x3Var = (x3) f242.get(iBinder);
            if (x3Var == null) {
                return null;
            }
            Reference reference = x3Var.f403;
            if (reference == null) {
                return null;
            }
            x3 x3Var2 = (x3) reference.get();
            if (x3Var2 != null) {
                return x3Var2.f404.f308;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final void mo342xaa30c2c7(String str, String str2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = CollectionsKt.iterator(f242.elements());
            while (it.hasNext()) {
                x3 x3Var = (x3) it.next();
                if (str == null || Intrinsics.areEqual(x3Var.f404.f308, str)) {
                    if (str2 == null || str2.length() == 0 || Intrinsics.areEqual(str2, x3Var.f402.name)) {
                        arrayList.add(x3Var);
                    }
                }
            }
            m375(arrayList);
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final boolean mo343(IBinder iBinder) {
        if (iBinder == null) {
            return false;
        }
        try {
            x3 x3Var = (x3) f242.get(iBinder);
            if (x3Var == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            Deque deque = x3Var.f409;
            if (deque == null) {
                return false;
            }
            Iterator itDescendingIterator = deque.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                x3 x3Var2 = (x3) itDescendingIterator.next();
                if (!arrayList.isEmpty()) {
                    if (!Intrinsics.areEqual(m373(x3Var2.f402), m373(x3Var.f402))) {
                        break;
                    }
                } else if (!Intrinsics.areEqual(x3Var2, x3Var)) {
                }
                arrayList.add(x3Var2);
            }
            m375(arrayList);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final boolean mo346() {
        try {
            Object objM687 = MNative.m687(62427, null);
            if (objM687 == null) {
                return false;
            }
            return Boolean.parseBoolean(objM687.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m350(s5 s5Var) {
        try {
            for (x3 x3Var : s5Var.f321x4f52efc) {
                IBinder iBinder = x3Var.f407;
                if (iBinder != null) {
                }
                f241.getClass();
                m372(x3Var);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public static final Unit m351x541a43c1(IBinder iBinder) {
        ActivityClient.getInstance().finishActivity(iBinder, 0, (Intent) null, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final Unit m352(IBinder iBinder) {
        ActivityTaskManager.getService().finishActivity(iBinder, 0, (Intent) null, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static final Unit m353(IBinder iBinder) {
        Singleton singleton = u3.f338;
        ((IActivityManager) u3.f338.get()).finishActivity(iBinder, 0, (Intent) null, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final Unit m354dj(IBinder iBinder) {
        Singleton singleton = u3.f338;
        ((IActivityManager) u3.f338.get()).finishActivity(iBinder, 0, (Intent) null, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final Object m3565() {
        Object objM687;
        try {
            objM687 = MNative.m687(62434, "b80f5549d3fb49cbb5ced644e77f218f6d0b5f1c2ea9534923e4d3dff02aad443131aea202790a307b4cc4f26563a722");
        } catch (Throwable unused) {
            objM687 = null;
        }
        Serializable serializable = (Serializable) objM687;
        if (serializable == null) {
            return new WeakReference(null);
        }
        f246xb7bf1d91 = () -> {
            return m355(r1);
        };
        return serializable;
    }

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public static final int m361x4f52efc(IBinder iBinder) {
        return ActivityClient.getInstance().getTaskForActivity(iBinder, false);
    }

    /* JADX INFO: renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public static final int m362(IBinder iBinder) {
        return ActivityTaskManager.getService().getTaskForActivity(iBinder, false);
    }

    /* JADX INFO: renamed from: 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你, reason: contains not printable characters */
    public static final int m363(IBinder iBinder) {
        Singleton singleton = u3.f338;
        return ((IActivityManager) u3.f338.get()).getTaskForActivity(iBinder, false);
    }

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final void m364(Intent intent, String str) {
        Intent intentPutExtras;
        Object objM687;
        try {
            f241.getClass();
            Pair pairM371 = m371(intent);
            if (pairM371 == null) {
                return;
            }
            Context context = b3.f17;
            if (((Boolean) pairM371.getSecond()).booleanValue()) {
                Intent intent2 = (Intent) ((Class) f2485.invoke()).getConstructor((Class) f2485.invoke()).newInstance(intent);
                Intent intent3 = new Intent(context, (Class<?>) MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", intent2);
                if (str != null) {
                    bundle.putString(String.class.getName(), str);
                }
                intentPutExtras = intent3.putExtras(bundle);
            } else {
                Intent intentM382 = m382(intent, str, (IBinder) null, (ActivityInfo) pairM371.getFirst());
                intentPutExtras = intentM382;
                if (intentM382 == null) {
                    return;
                }
            }
            try {
                objM687 = MNative.m687(62434, "b80f5549d3fb49cbb5ced644e77f218fdb73df2526105f90deb5295bc9da52c4e0d82a382c4cbcc393c400008638ea7786be7d9dd0e4383cec1329bf07188c005b9514b07755c8993b66363890079bd567835806c3441d66322e947d1d77b60b");
            } catch (Throwable unused) {
                objM687 = null;
            }
            Serializable serializable = (Serializable) objM687;
            context.startActivity(intentPutExtras.addFlags(serializable instanceof Number ? ((Number) serializable).intValue() : 0));
        } catch (Exception unused2) {
        }
    }

    static {
        Function1 function1;
        Function1 function2;
        boolean z = AbstractC0065x6082d607.f5065;
        if (z) {
            function1 = n6::m351x541a43c1;
        } else if (AbstractC0065x6082d607.f504xb7bf1d91) {
            function1 = n6::m352;
        } else {
            function1 = AbstractC0065x6082d607.f500 ? n6::m353 : n6::m354dj;
        }
        f245 = function1;
        f246xb7bf1d91 = n6::m3565;
        f247 = n6::m358dj;
        f2485 = n6::m360;
        if (z) {
            function2 = n6::m361x4f52efc;
        } else {
            function2 = AbstractC0065x6082d607.f504xb7bf1d91 ? n6::m362 : n6::m363;
        }
        f249 = function2;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final void mo344(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        p3.m412(str);
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m367(ActivityInfo activityInfo, String str, String str2) {
        try {
            if (!p3.m416()) {
                if (AbstractC0065x6082d607.f503) {
                    b3.f17.getMainExecutor().execute(n6::m366);
                    return;
                }
                return;
            }
            f241.getClass();
            Class<?> cls = (Class) f2485.invoke();
            if (activityInfo == null) {
                ActivityInfo activityInfoM559 = x4.m559(str);
                activityInfo = activityInfoM559;
                if (activityInfoM559 == null) {
                    return;
                }
            }
            ActivityInfo activityInfo2 = activityInfo;
            Triple triple = u5.f349;
            s5 s5VarM510 = u5.m510(str, activityInfo2.processName, str2);
            if (s5VarM510 == null) {
                return;
            }
            Constructor<?> constructor = cls.getConstructor(cls);
            Intent intentAddCategory = ((Intent) cls.getConstructor(String.class).newInstance((Serializable) p3.m418("0276a1615185e03ac1af12b79a0d34ed572f5ae2f997205e08683daf2dc45b54570d4b0a8c17ebd26fd2ea20b9819401"))).addCategory(String.valueOf(p3.m413("86042823c6197eb33d7d6a65a627469dbc3e90f2e24632ce62e945fd50b021f349739fa7459ed5d10d2846c028afe34d")));
            Serializable serializable = (Serializable) p3.m418("b80f5549d3fb49cbb5ced644e77f218fdb73df2526105f90deb5295bc9da52c4e0d82a382c4cbcc393c400008638ea7786be7d9dd0e4383cec1329bf07188c009d4ed1f8ad2b0d8541431e54471f051367835806c3441d66322e947d1d77b60b");
            Intent intentM376 = m376((IBinder) null, (Intent) constructor.newInstance(intentAddCategory.addFlags(serializable instanceof Number ? ((Number) serializable).intValue() : 0)), s5VarM510, activityInfo, false);
            if (intentM376 == null || !s5VarM510.f314xb7bf1d91) {
                return;
            }
            Context context = b3.f17;
            Serializable serializable2 = (Serializable) p3.m418("b80f5549d3fb49cbb5ced644e77f218fdb73df2526105f90deb5295bc9da52c4e0d82a382c4cbcc393c400008638ea7786be7d9dd0e4383cec1329bf07188c005b9514b07755c8993b66363890079bd567835806c3441d66322e947d1d77b60b");
            context.startActivity(intentM376.addFlags(serializable2 instanceof Number ? ((Number) serializable2).intValue() : 0));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final void m3685(IBinder iBinder) {
        try {
            x3 x3Var = (x3) f242.remove(iBinder);
            if (x3Var != null) {
                x3Var.f404.f321x4f52efc.remove(x3Var);
                f241.getClass();
                m372(x3Var);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final Class m360() {
        Object objM687;
        try {
            objM687 = MNative.m687(62434, "5cc986ddbe0bc13f88e24c504b96d1110c503676f005773c2651c932582ec87d757531a0a2b970616faf54e0c9d95991");
        } catch (Throwable unused) {
            objM687 = null;
        }
        Class cls = (Class) objM687;
        if (cls != null) {
            f2485 = () -> {
                return m359(r1);
            };
            return cls;
        }
        return IBinder.class;
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final Object m358dj() {
        Object objM687;
        try {
            objM687 = MNative.m687(62434, "b80f5549d3fb49cbb5ced644e77f218fdb73df2526105f90deb5295bc9da52c4e0d82a382c4cbcc393c400008638ea7786be7d9dd0e4383cec1329bf07188c0080fc583c9b9606d90003e7f97ef971e767835806c3441d66322e947d1d77b60b");
        } catch (Throwable unused) {
            objM687 = null;
        }
        Serializable serializable = (Serializable) objM687;
        if (serializable != null) {
            f247 = () -> {
                return m357(r1);
            };
            return serializable;
        }
        return new WeakReference(null);
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static final void m366() {
        try {
            Context context = b3.f17;
            Toast.makeText(b3.f17, "SDK aún no está bien preparado, por favor espere hasta que esté bien preparado. Puede ponerse en contacto con nuestro servicio de atención al cliente para obtener más información. Correo electrónico: help@62v.net", 1).show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final boolean m333(String str, String str2) {
        try {
            ActivityInfo activityInfoM559 = x4.m559(str);
            if (activityInfoM559 == null) {
                return false;
            }
            Triple triple = u5.f349;
            String str3 = activityInfoM559.processName;
            try {
                u8 u8Var = u5.f352;
                int iHashCode = str2.hashCode() + str3.hashCode();
                n9 n9Var = u8Var.f358;
                return a.m2(n9Var.f253, n9Var.f255, iHashCode) >= 0;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Intent[] mo329(IBinder iBinder, Intent[] intentArr, int i) {
        Object objM385;
        if (intentArr == null) {
            return null;
        }
        try {
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            s5 s5Var = (s5) objM385;
            if (s5Var == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(intentArr.length);
            for (Intent intent : intentArr) {
                Intent intentM377 = m377(iBinder, intent, s5Var, false);
                if (intentM377 != null) {
                    arrayList.add(intentM377);
                }
            }
            return (Intent[]) arrayList.toArray(new Intent[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final void mo335(IBinder iBinder) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m3685(r0);
        });
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static String m373(ActivityInfo activityInfo) {
        int i = activityInfo.launchMode;
        if (i != 3 && i != 4) {
            String str = activityInfo.taskAffinity;
            if (str != null) {
                return str;
            }
            String str2 = activityInfo.applicationInfo.taskAffinity;
            return str2 == null ? activityInfo.packageName : str2;
        }
        return activityInfo.name;
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Serializable m357(Serializable serializable) {
        return serializable;
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m365(IBinder iBinder, IBinder iBinder2) {
        Object objInvoke;
        Object obj;
        Object obj2;
        try {
            ((x3) iBinder).f404.f321x4f52efc.add(iBinder);
            if (Intrinsics.areEqual(Boolean.valueOf(iBinder2 != null), f246xb7bf1d91.invoke())) {
                ((x3) iBinder).f407 = iBinder2;
                ConcurrentHashMap concurrentHashMap = f242;
                if (iBinder2 == null) {
                    return;
                }
                concurrentHashMap.put(iBinder2, iBinder);
                int i = ((x3) iBinder).f408xb7bf1d91;
                int i2 = i;
                if (i == -1) {
                    x3 x3Var = (x3) iBinder;
                    Object objInvoke2 = f249.invoke(iBinder2);
                    int iIntValue = ((Number) objInvoke2).intValue();
                    x3Var.f408xb7bf1d91 = ((Number) objInvoke2).intValue();
                    if (iIntValue == -1) {
                        return;
                    } else {
                        i2 = iIntValue;
                    }
                }
                u8 u8Var = f243;
                m6 m6Var = m6.f229;
                synchronized (u8Var) {
                    n9 n9Var = u8Var.f358;
                    int[] iArr = n9Var.f253;
                    int i3 = n9Var.f255;
                    int iM2 = a.m2(iArr, i3, i2);
                    if (iM2 >= 0) {
                        objInvoke = n9Var.f254[iM2];
                    } else {
                        int i4 = iM2 ^ (-1);
                        n9Var.f253 = m9.m315(iArr, i3, i4, i2);
                        int i5 = i3 + 1;
                        n9Var.f255 = i5;
                        objInvoke = m6Var.invoke();
                        Object[] objArr = n9Var.f254;
                        Object[] objArr2 = objArr;
                        if (i5 <= objArr.length) {
                            System.arraycopy(objArr2, i4, objArr2, i4 + 1, i3 - i4);
                            objArr2[i4] = objInvoke;
                        } else {
                            Object[] objArr3 = new Object[(i3 | 1) << 1];
                            System.arraycopy(objArr2, 0, objArr3, 0, i4);
                            objArr3[i4] = objInvoke;
                            System.arraycopy(objArr2, i4, objArr3, i4 + 1, objArr2.length - i4);
                            objArr2 = objArr3;
                        }
                        n9Var.f254 = objArr2;
                    }
                    obj = objInvoke;
                    obj2 = objInvoke;
                }
                ((x3) iBinder).f409 = (Deque) obj2;
                ((Deque) obj).addLast(iBinder);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static ActivityManager.RunningTaskInfo m379(Deque deque) {
        ActivityManager.RunningTaskInfo runningTaskInfo = new ActivityManager.RunningTaskInfo();
        x3 x3Var = (x3) deque.peekFirst();
        runningTaskInfo.id = x3Var.f408xb7bf1d91;
        ActivityInfo activityInfo = x3Var.f402;
        runningTaskInfo.baseActivity = new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name);
        ActivityInfo activityInfo2 = ((x3) deque.peekLast()).f402;
        runningTaskInfo.topActivity = new ComponentName(((ComponentInfo) activityInfo2).packageName, ((ComponentInfo) activityInfo2).name);
        runningTaskInfo.numActivities = 1;
        if (AbstractC0065x6082d607.f504xb7bf1d91) {
            runningTaskInfo.taskId = x3Var.f408xb7bf1d91;
            runningTaskInfo.baseIntent = x3Var.f405;
            Function0 function0 = v9.f367;
            ((TaskInfo) runningTaskInfo).isRunning = true;
            if (AbstractC0065x6082d607.f505) {
                v9.f368.mo394(runningTaskInfo, v9.f367.invoke());
                if (AbstractC0065x6082d607.f5065) {
                    v9.f369.mo394(runningTaskInfo, Boolean.TRUE);
                    return runningTaskInfo;
                }
            }
        }
        return runningTaskInfo;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean mo341(String str, String str2) {
        boolean z;
        try {
            ActivityInfo activityInfoM559 = x4.m559(str);
            if (activityInfoM559 == null) {
                return false;
            }
            Triple triple = u5.f349;
            String str3 = activityInfoM559.processName;
            try {
                u8 u8Var = u5.f352;
                int iHashCode = str2.hashCode() + str3.hashCode();
                n9 n9Var = u8Var.f358;
                z = a.m2(n9Var.f253, n9Var.f255, iHashCode) >= 0;
            } catch (Exception unused) {
            }
            if (z) {
                m383(activityInfoM559, str, str2);
                return true;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f466.execute(() -> {
                m369(r0, r1, r2);
            });
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Intent mo328(IBinder iBinder, Intent intent, int i, boolean z) {
        Object objM385;
        u8 u8Var = u5.f350;
        synchronized (u8Var) {
            objM385 = u8Var.f358.m385(i);
        }
        s5 s5Var = (s5) objM385;
        if (s5Var == null) {
            return null;
        }
        return m377(iBinder, intent, s5Var, z);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m372(x3 x3Var) {
        Deque deque = x3Var.f409;
        if (deque != null && deque.removeLastOccurrence(x3Var) && deque.isEmpty()) {
            u8 u8Var = f243;
            int i = x3Var.f408xb7bf1d91;
            synchronized (u8Var) {
                u8Var.f358.m388(i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177  */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Pair m371(Intent intent) {
        boolean z;
        boolean z2;
        try {
            ComponentName component = intent.getComponent();
            ComponentName component2 = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                component2 = selector != null ? selector.getComponent() : null;
            }
            if (component2 != null) {
                ComponentName componentName = component2;
                r5.f290.getClass();
                ActivityInfo activityInfo = (ActivityInfo) r5.m463(componentName);
                ActivityInfo activityInfo2 = activityInfo;
                if (activityInfo == null) {
                    if (r5.f292.containsKey(component2.getPackageName())) {
                        ComponentName componentName2 = component2;
                        Context context = b3.f17;
                        activityInfo2 = (ActivityInfo) b3.m57((v1) -> {
                            return m348(r0, v1);
                        });
                    } else {
                        activityInfo2 = null;
                    }
                }
                if (activityInfo2 != null) {
                    return TuplesKt.to(activityInfo2, Boolean.FALSE);
                }
                return null;
            }
            List listMo271 = r5.f290.mo271(intent, null, 65536);
            if (!listMo271.isEmpty()) {
                n6 n6Var = f241;
                List listM429 = q1.m429(listMo271);
                n6Var.getClass();
                ResolveInfo resolveInfo = (ResolveInfo) listM429.get(0);
                ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                if (listM429.size() != 1) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) listM429.get(1);
                    if (resolveInfo.priority == resolveInfo2.priority && resolveInfo.isDefault == resolveInfo2.isDefault) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                return TuplesKt.to(activityInfo3, Boolean.valueOf(z2));
            }
            Context context2 = b3.f17;
            List list = (List) b3.m57((v1) -> {
                return m349(r0, v1);
            });
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo3 = (ResolveInfo) it.next();
                r5 r5Var = r5.f290;
                String str = resolveInfo3.activityInfo.packageName;
                r5Var.getClass();
                if (!r5.f292.containsKey(str)) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                return null;
            }
            f241.getClass();
            ResolveInfo resolveInfo4 = (ResolveInfo) list.get(0);
            ActivityInfo activityInfo4 = resolveInfo4.activityInfo;
            if (list.size() != 1) {
                ResolveInfo resolveInfo5 = (ResolveInfo) list.get(1);
                if (resolveInfo4.priority == resolveInfo5.priority && resolveInfo4.isDefault == resolveInfo5.isDefault) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            return TuplesKt.to(activityInfo4, Boolean.valueOf(z));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ActivityInfo m348(ComponentName componentName, PackageManager packageManager) {
        return packageManager.getActivityInfo(componentName, 512);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m349(Intent intent, PackageManager packageManager) {
        return packageManager.queryIntentActivities(intent, 65536);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m382(Intent intent, String str, IBinder iBinder, ActivityInfo activityInfo) {
        Object objM687;
        Object objM688;
        try {
            objM688 = MNative.m687(62427, null);
        } catch (Throwable unused) {
        }
        if (!(objM688 == null ? false : Boolean.parseBoolean(objM688.toString()))) {
            return null;
        }
        try {
            objM687 = MNative.m687(62434, "9250221494edbb8ddfe1dbf7cfaadd434a4998ebe11d84b8fcf5af24b0b335eb4f9c545fa077c370ded70f3ff9b6d60681a71ac9e4c8be08955f57aaa83f011e");
        } catch (Throwable unused2) {
            objM687 = null;
        }
        try {
            Class<?> cls = (Class) objM687;
            if (cls == null) {
                return null;
            }
            ActivityInfo activityInfo2 = (ActivityInfo) cls.getConstructor(cls).newInstance(activityInfo);
            if (activityInfo2 == null) {
                return null;
            }
            Triple triple = u5.f349;
            s5 s5VarM510 = u5.m510(activityInfo2.packageName, activityInfo2.processName, str);
            if (s5VarM510 == null) {
                return null;
            }
            Class<?> cls2 = (Class) f2485.invoke();
            return (Intent) cls2.getConstructor(cls2).newInstance(m376(iBinder, intent, s5VarM510, activityInfo2, false));
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m381(s5 s5Var) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m350(r0);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m374(ActivityInfo activityInfo) {
        int i = activityInfo.launchMode;
        return Intrinsics.areEqual(Boolean.valueOf(2 <= i && i < 5), f246xb7bf1d91.invoke());
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m375(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f245.invoke(((x3) it.next()).f407);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String mo345() {
        try {
            return String.valueOf(MNative.m687(62432, null));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x03c9 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:225:0x03f8 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0422 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0455  */
    /* JADX WARN: Code duplicated, block: B:243:0x0460 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x0471 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x047e  */
    /* JADX WARN: Code duplicated, block: B:252:0x048d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0491  */
    /* JADX WARN: Code duplicated, block: B:255:0x0495 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b0 A[Catch: Exception -> 0x0012, LOOP:1: B:228:0x040a->B:259:0x04b0, LOOP_END, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x04bb A[EDGE_INSN: B:261:0x04bb->B:262:0x04bf BREAK  A[LOOP:1: B:228:0x040a->B:259:0x04b0]] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: Exception -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0012, blocks: (B:4:0x0004, B:13:0x002b, B:16:0x0036, B:19:0x0044, B:22:0x0057, B:23:0x005f, B:24:0x0065, B:27:0x0081, B:28:0x0089, B:30:0x008f, B:32:0x0098, B:53:0x00f3, B:58:0x010b, B:65:0x012b, B:68:0x013b, B:74:0x014f, B:76:0x0156, B:83:0x0175, B:85:0x0180, B:87:0x0187, B:88:0x018d, B:90:0x0198, B:92:0x01a2, B:94:0x01ae, B:96:0x01b5, B:100:0x01c6, B:102:0x01d8, B:104:0x01e5, B:106:0x01f0, B:108:0x01f9, B:109:0x0200, B:110:0x0201, B:113:0x020b, B:117:0x0217, B:118:0x0218, B:121:0x021d, B:125:0x0231, B:127:0x023d, B:128:0x0247, B:138:0x0273, B:141:0x0281, B:142:0x0285, B:143:0x028f, B:148:0x029e, B:149:0x02a3, B:151:0x02aa, B:152:0x02b0, B:163:0x02db, B:165:0x02ee, B:131:0x0258, B:133:0x0266, B:173:0x02fd, B:178:0x0316, B:180:0x0328, B:181:0x0334, B:184:0x033f, B:191:0x035b, B:194:0x036f, B:204:0x0396, B:206:0x039e, B:208:0x03a9, B:210:0x03af, B:213:0x03bf, B:264:0x04c4, B:265:0x04cd, B:278:0x04f3, B:281:0x0500, B:283:0x0511, B:285:0x051b, B:287:0x0521, B:291:0x0534, B:293:0x053b, B:215:0x03c9, B:217:0x03d1, B:219:0x03de, B:225:0x03f8, B:227:0x0400, B:228:0x040a, B:230:0x0422, B:232:0x042f, B:234:0x0435, B:236:0x0442, B:241:0x0459, B:243:0x0460, B:245:0x046b, B:247:0x0471, B:255:0x0495, B:258:0x04a8, B:259:0x04b0, B:296:0x0545, B:308:0x0578, B:309:0x057c, B:310:0x0586, B:315:0x0595, B:317:0x059f, B:319:0x05aa, B:322:0x05b4, B:328:0x05cf, B:330:0x05d5, B:333:0x05e0, B:334:0x05e7, B:336:0x05ed, B:337:0x0605, B:350:0x062b, B:353:0x063a, B:354:0x0648, B:356:0x0651, B:357:0x0658, B:361:0x0663, B:364:0x066c, B:370:0x0688, B:372:0x068f, B:299:0x0557, B:301:0x0565, B:62:0x011b, B:38:0x00b4, B:46:0x00ce, B:48:0x00d6, B:111:0x0204, B:112:0x020a), top: B:381:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:390:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m376(IBinder iBinder, Intent intent, s5 s5Var, ActivityInfo activityInfo, boolean z) {
        x3 x3Var;
        Object objM687;
        ComponentName componentName;
        int i;
        int i2;
        x3 x3Var2;
        WeakReference weakReference;
        int i3;
        WeakReference weakReference2;
        ArrayList arrayList;
        Iterator itDescendingIterator;
        x3 x3Var3;
        ActivityInfo activityInfo2;
        boolean z2;
        Object objInvoke;
        int iIntValue;
        boolean z3;
        ActivityInfo activityInfo3;
        boolean z4;
        if (iBinder != null) {
            try {
                x3Var = (x3) f242.get(iBinder);
            } catch (Exception unused) {
                return null;
            }
        } else {
            x3Var = null;
        }
        try {
            objM687 = MNative.m687(62434, "b53ff26c044972b8ff5b7032ae6f80694107dfbb66ec2cd118275facb4b7ed3452c67a428279f5e22c444f896581e06bef45977394fbe18ecde2a4ea255c6ae8");
        } catch (Throwable unused2) {
            objM687 = null;
        }
        Class cls = (Class) objM687;
        if (cls != null) {
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = String.class;
            clsArr[1] = String.class;
            Constructor constructor = cls.getConstructor(clsArr);
            if (constructor != null) {
                componentName = (ComponentName) constructor.newInstance(activityInfo.packageName, activityInfo.name);
            } else {
                componentName = null;
            }
        } else {
            componentName = null;
        }
        intent.setComponent(componentName);
        int flags = intent.getFlags();
        if (q1.m427(flags, 524288)) {
            int i4 = activityInfo.launchMode;
            if (i4 == 3 || i4 == 2) {
                i2 = flags & (-134742017);
            } else {
                i = activityInfo.documentLaunchMode;
                if (i != 1 || i == 2) {
                    i2 = flags | 524288;
                } else if (i == 3 && (activityInfo.launchMode != 4 || q1.m427(flags, 524288))) {
                    i2 = flags & (-134742017);
                } else {
                    i2 = flags;
                }
            }
        } else {
            i = activityInfo.documentLaunchMode;
            if (i != 1) {
                i2 = flags | 524288;
            } else {
                i2 = flags | 524288;
            }
        }
        if (q1.m427(i2, 524288) && !z) {
            i2 |= 268435456;
        }
        if ((q1.m427(i2, 268435456) || !z) && activityInfo.documentLaunchMode == 2) {
            i2 |= 402653184;
        }
        if (activityInfo.launchMode == 4) {
            i2 |= 268435456;
        }
        x3 x3Var4 = (q1.m427(i2, 268435456) || !(x3Var == null || z || !m374(activityInfo) || Intrinsics.areEqual(m373(activityInfo), x3Var.f406xaa30c2c7))) ? null : x3Var;
        if (x3Var4 == null && (!q1.m427(i2, 402653184) || m374(activityInfo))) {
            String strM373 = m373(activityInfo);
            n9 n9Var = f243.f358;
            int i5 = 0;
            while (i5 < n9Var.f255) {
                int i6 = i5;
                i5 = i6 + 1;
                Deque deque = (Deque) n9Var.f254[i6];
                x3 x3Var5 = (x3) deque.peekFirst();
                if (x3Var5 != null && Intrinsics.areEqual(x3Var5.f404.f310, s5Var.f310) && Intrinsics.areEqual(x3Var5.f406xaa30c2c7, strM373)) {
                    if (q1.m427(i2, 268468224)) {
                        u8 u8Var = f243;
                        int i7 = x3Var5.f408xb7bf1d91;
                        synchronized (u8Var) {
                            u8Var.f358.m388(i7);
                        }
                        deque.clear();
                    }
                    x3Var4 = x3Var5;
                    break;
                }
            }
        }
        if (Intrinsics.areEqual(f246xb7bf1d91.invoke(), Boolean.valueOf(x3Var4 == null))) {
            if (!Intrinsics.areEqual(f246xb7bf1d91.invoke(), Boolean.valueOf(Intrinsics.areEqual(s5Var.f308, activityInfo.packageName) && (Intrinsics.areEqual(s5Var.f309, activityInfo.processName) || (activityInfo.flags & 1) != 0)))) {
                Triple triple = u5.f349;
                s5 s5VarM510 = u5.m510(activityInfo.packageName, activityInfo.processName, s5Var.f310);
                s5Var = s5VarM510;
                if (s5VarM510 == null) {
                    return null;
                }
            }
            int i8 = s5Var.f312xaa30c2c7;
            x3 x3Var6 = new x3(activityInfo, null, s5Var, intent, m373(activityInfo));
            int i9 = activityInfo.screenOrientation;
            return xxx.m568(intent, i8, x3Var6, i9 == 0 || i9 == 6 || i9 == 8 || i9 == 11, null).addFlags((flags & 1386586112) | 404750336);
        }
        if (x3Var4 == null) {
            return null;
        }
        boolean z5 = x3Var != null && x3Var.f408xb7bf1d91 == x3Var4.f408xb7bf1d91;
        if (Intrinsics.areEqual(f246xb7bf1d91.invoke(), Boolean.valueOf(!z5))) {
            f244xaa30c2c7.moveTaskToFront(x3Var4.f408xb7bf1d91, 0);
        }
        Deque deque2 = x3Var4.f409;
        x3 x3Var7 = deque2 != null ? (x3) deque2.peekLast() : null;
        if (Intrinsics.areEqual(Boolean.valueOf(x3Var7 != null), f246xb7bf1d91.invoke())) {
            if (!m374(activityInfo)) {
                if (!((i2 & 67239936) != 0) && (i2 & 134742016) != 524288) {
                    if (activityInfo.launchMode != 1) {
                        Object objInvoke2 = f247.invoke();
                        if (!q1.m427(i2, objInvoke2 instanceof Number ? ((Number) objInvoke2).intValue() : 0)) {
                            x3Var7 = null;
                            break;
                        }
                        activityInfo3 = x3Var7.f402;
                        if (Intrinsics.areEqual(activityInfo3.packageName, activityInfo.packageName) || !Intrinsics.areEqual(activityInfo3.name, activityInfo.name)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (!z4) {
                            x3Var7 = null;
                            break;
                        }
                    } else {
                        activityInfo3 = x3Var7.f402;
                        if (Intrinsics.areEqual(activityInfo3.packageName, activityInfo.packageName)) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            x3Var7 = null;
                            break;
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                    itDescendingIterator = deque2.descendingIterator();
                    while (true) {
                        if (Intrinsics.areEqual(Boolean.valueOf(itDescendingIterator.hasNext()), f246xb7bf1d91.invoke())) {
                            x3Var7 = null;
                            break;
                        }
                        x3Var3 = (x3) itDescendingIterator.next();
                        activityInfo2 = x3Var3.f402;
                        if (Intrinsics.areEqual(activityInfo2.packageName, activityInfo.packageName)) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (activityInfo.launchMode == 0) {
                                objInvoke = f247.invoke();
                                if (objInvoke instanceof Number) {
                                    iIntValue = ((Number) objInvoke).intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if ((i2 & (iIntValue | 655360)) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    x3Var7 = x3Var3;
                                } else {
                                    arrayList.add(x3Var3);
                                    x3Var7 = null;
                                }
                            } else {
                                x3Var7 = x3Var3;
                            }
                            m375(arrayList);
                            break;
                        }
                        arrayList.add(x3Var3);
                    }
                }
            } else {
                arrayList = new ArrayList();
                itDescendingIterator = deque2.descendingIterator();
                while (true) {
                    if (Intrinsics.areEqual(Boolean.valueOf(itDescendingIterator.hasNext()), f246xb7bf1d91.invoke())) {
                        x3Var7 = null;
                        break;
                    }
                    x3Var3 = (x3) itDescendingIterator.next();
                    activityInfo2 = x3Var3.f402;
                    if (Intrinsics.areEqual(activityInfo2.packageName, activityInfo.packageName) || !Intrinsics.areEqual(activityInfo2.name, activityInfo.name)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (activityInfo.launchMode == 0) {
                            objInvoke = f247.invoke();
                            if (objInvoke instanceof Number) {
                                iIntValue = ((Number) objInvoke).intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if ((i2 & (iIntValue | 655360)) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList.add(x3Var3);
                                x3Var7 = null;
                            } else {
                                x3Var7 = x3Var3;
                            }
                        } else {
                            x3Var7 = x3Var3;
                        }
                        m375(arrayList);
                        break;
                    }
                    arrayList.add(x3Var3);
                }
            }
            if (x3Var7 != null) {
                int i10 = x3Var7.f404.f312xaa30c2c7;
                int i11 = activityInfo.screenOrientation;
                Intent intentM568 = xxx.m568(intent, i10, x3Var7, i11 == 0 || i11 == 6 || i11 == 8 || i11 == 11, x3Var != null ? x3Var.f404.f308 : null);
                int i12 = flags & 1386586112;
                Object objInvoke3 = f247.invoke();
                int iIntValue2 = objInvoke3 instanceof Number ? ((Number) objInvoke3).intValue() : 0;
                boolean z6 = z5;
                intentM568.setFlags(i12 | iIntValue2);
                if (!z6) {
                    intentM568.addFlags(268435456);
                }
                return intentM568;
            }
        }
        if (!(Intrinsics.areEqual(s5Var.f308, activityInfo.packageName) && (Intrinsics.areEqual(s5Var.f309, activityInfo.processName) || (activityInfo.flags & 1) != 0))) {
            Triple triple2 = u5.f349;
            s5 s5VarM511 = u5.m510(activityInfo.packageName, activityInfo.processName, s5Var.f310);
            s5Var = s5VarM511;
            if (s5VarM511 == null) {
                return null;
            }
        }
        x3 x3Var8 = x3Var;
        int i13 = s5Var.f312xaa30c2c7;
        if (x3Var8 == null || !q1.m427(i2, 33554432)) {
            x3Var2 = x3Var;
        } else {
            Reference reference = x3Var.f403;
            x3Var2 = reference != null ? (x3) reference.get() : null;
        }
        if (x3Var2 != null) {
            weakReference = weakReference2;
            weakReference2 = new WeakReference(x3Var2);
        } else {
            weakReference = null;
        }
        x3 x3Var9 = new x3(activityInfo, weakReference, s5Var, intent, x3Var4.f406xaa30c2c7);
        x3Var9.f408xb7bf1d91 = x3Var4.f408xb7bf1d91;
        Unit unit = Unit.INSTANCE;
        int i14 = activityInfo.screenOrientation;
        boolean z7 = i14 == 0 || i14 == 6 || i14 == 8 || i14 == 11;
        int i15 = i2;
        Intent intentM569 = xxx.m568(intent, i13, x3Var9, z7, x3Var != null ? x3Var.f404.f308 : null);
        if (q1.m427(i15, 268468224)) {
            i3 = 1386586112;
        } else {
            f241.getClass();
            if (activityInfo.launchMode == 0) {
                if (x3Var != null) {
                    ActivityInfo activityInfo4 = x3Var.f402;
                    if (activityInfo4 == null || activityInfo4.launchMode == 0) {
                    }
                }
                i3 = 1386586112;
            }
            i3 = 1118117888;
        }
        boolean z8 = z5;
        intentM569.setFlags(flags & i3);
        if (!z8) {
            intentM569.addFlags(268435456);
        }
        return intentM569;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo338(IBinder iBinder, String str, String str2, String str3, int i) {
        Object objM385;
        s sVar;
        u uVar;
        try {
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            if (objM385 == null) {
                int callingPid = Binder.getCallingPid();
                r5.f290.getClass();
                boolean zContainsKey = r5.f291.containsKey(str);
                s5 s5Var = new s5(str, str2, str3, zContainsKey, i, x4.m560(str, zContainsKey));
                iBinder.linkToDeath(new t5(iBinder, s5Var), 0);
                u8Var.m517(i, s5Var);
                s5Var.f3165 = callingPid;
                u5.f351.m517(callingPid, s5Var);
                u5.f352.m517(str3.hashCode() + str2.hashCode(), s5Var);
                s5Var.f317.open();
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoAppThread");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof u)) {
                    uVar = (u) iInterfaceQueryLocalInterface;
                } else {
                    uVar = sVar;
                    sVar = new s(iBinder);
                }
                s5Var.f315 = uVar;
                if (u5.f354 == i) {
                    u5.f354 = 0;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m377(IBinder iBinder, Intent intent, s5 s5Var, boolean z) {
        try {
            Pair pairM371 = m371(intent);
            if (pairM371 == null) {
                return null;
            }
            if (((Boolean) pairM371.getSecond()).booleanValue()) {
                String str = s5Var.f310;
                Intent intent2 = new Intent(b3.f17, (Class<?>) MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", intent);
                if (str != null) {
                    bundle.putString(String.class.getName(), str);
                }
                return intent2.putExtras(bundle);
            }
            return m376(iBinder, intent, s5Var, (ActivityInfo) pairM371.getFirst(), z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Serializable m355(Serializable serializable) {
        return serializable;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Class m359(Class cls) {
        return cls;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo330(Intent intent, String str) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m364(r0, r1);
        });
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo332(IBinder iBinder, IBinder iBinder2) {
        if (iBinder2 instanceof x3) {
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f466.execute(() -> {
                m365(r0, r1);
            });
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m383(ActivityInfo activityInfo, String str, String str2) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m367(r0, r1, r2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ArrayList m378(int i, boolean z, int i2) {
        Object objM385;
        ArrayList arrayList = new ArrayList();
        try {
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            s5 s5Var = (s5) objM385;
            if (s5Var != null) {
                n9 n9Var = f243.f358;
                int i3 = 0;
                while (i3 < n9Var.f255) {
                    int i4 = i3;
                    i3 = i4 + 1;
                    Deque deque = (Deque) n9Var.f254[i4];
                    x3 x3Var = (x3) deque.peekFirst();
                    if (x3Var != null && Intrinsics.areEqual(s5Var.f310, x3Var.f404.f310) && Intrinsics.areEqual(s5Var.f308, x3Var.f404.f308) && (z || !q1.m427(x3Var.f405.getFlags(), 8388608))) {
                        arrayList.add(deque);
                        if (arrayList.size() >= i2) {
                        }
                    }
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final List mo336(long j) {
        try {
            ArrayList arrayListM378 = m378((int) (j & 4294967295L), true, (int) ((j & (-4294967296L)) >>> 32));
            ArrayList arrayList = new ArrayList(arrayListM378.size());
            Iterator it = arrayListM378.iterator();
            while (it.hasNext()) {
                arrayList.add(m379((Deque) it.next()));
            }
            return arrayList;
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityManager.RecentTaskInfo m380(Deque deque) {
        ActivityManager.RecentTaskInfo recentTaskInfo = new ActivityManager.RecentTaskInfo();
        x3 x3Var = (x3) deque.peekFirst();
        int i = x3Var.f408xb7bf1d91;
        recentTaskInfo.id = i;
        recentTaskInfo.persistentId = i;
        recentTaskInfo.affiliatedTaskId = i;
        recentTaskInfo.baseIntent = x3Var.f405;
        if (AbstractC0065x6082d607.f499) {
            recentTaskInfo.numActivities = 1;
            ActivityInfo activityInfo = x3Var.f402;
            recentTaskInfo.baseActivity = new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name);
            ActivityInfo activityInfo2 = ((x3) deque.peekLast()).f402;
            recentTaskInfo.topActivity = new ComponentName(((ComponentInfo) activityInfo2).packageName, ((ComponentInfo) activityInfo2).name);
            if (AbstractC0065x6082d607.f504xb7bf1d91) {
                Function0 function0 = v9.f367;
                ((TaskInfo) recentTaskInfo).isRunning = true;
                if (AbstractC0065x6082d607.f505) {
                    v9.f368.mo394(recentTaskInfo, v9.f367.invoke());
                    if (AbstractC0065x6082d607.f5065) {
                        v9.f369.mo394(recentTaskInfo, Boolean.TRUE);
                        return recentTaskInfo;
                    }
                }
            }
        }
        return recentTaskInfo;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final List mo337(long j, int i) {
        try {
            ArrayList arrayListM378 = m378(i, (((int) (j & 4294967295L)) & 8388608) != 0, (int) ((j & (-4294967296L)) >>> 32));
            ArrayList arrayList = new ArrayList(arrayListM378.size());
            Iterator it = arrayListM378.iterator();
            while (it.hasNext()) {
                arrayList.add(m380((Deque) it.next()));
            }
            return arrayList;
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final ComponentName mo339(IBinder iBinder) {
        try {
            x3 x3Var = (x3) f242.get(iBinder);
            if (x3Var == null) {
                return null;
            }
            Reference reference = x3Var.f403;
            if (reference == null) {
                return null;
            }
            x3 x3Var2 = (x3) reference.get();
            if (x3Var2 == null) {
                return null;
            }
            ActivityInfo activityInfo = x3Var2.f402;
            return new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m369(String str, ActivityInfo activityInfo, String str2) {
        try {
            Triple triple = u5.f349;
            u5.m512(str, activityInfo.processName, str2);
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo347(String str) {
    }
}
