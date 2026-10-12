package top.bienvenido.date_24323;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Parcel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt;
import top.bienvenido.mundo.common.initialize.MNative;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/r5.class */
public final class r5 extends n0 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final r5 f290 = new r5();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final C0031x7011f1e3 f291 = new C0031x7011f1e3(0);

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final C0031x7011f1e3 f292 = new C0031x7011f1e3(0);

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final ConditionVariable f293xaa30c2c7 = new ConditionVariable();

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final n9 f294;

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final boolean mo264(String str) {
        return f291.containsKey(str);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final PackageInfo mo265(String str, int i) {
        try {
            e2 e2Var = (e2) f291.get(str);
            if (e2Var == null) {
                return null;
            }
            PackageInfo packageInfo = e2Var.f69;
            if (packageInfo != null) {
                return n2.f235.m324(packageInfo, i);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final ApplicationInfo mo266(String str, int i) {
        try {
            e2 e2Var = (e2) f291.get(str);
            if (e2Var != null) {
                return e2Var.f70;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final ProviderInfo mo277(String str) {
        try {
            return (ProviderInfo) f294.m385(str.hashCode());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public final String mo278x4f52efc(String str) {
        File file = v4.f361;
        return new File(v4.f361, str).getAbsolutePath();
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 说话不过脑子直接从您屁眼里崩出来 */
    public final int mo280(String str) {
        try {
            e2 e2Var = (e2) f291.get(str);
            if (e2Var != null) {
                return e2Var.f70.uid;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final String[] mo288xb7bf1d91(String str) {
        try {
            e2 e2Var = (e2) f291.get(str);
            k4 k4Var = e2Var;
            if (e2Var == null) {
                k4Var = (k4) f292.get(str);
            }
            if (k4Var != null && !k4Var.f201.isEmpty()) {
                return (String[]) k4Var.f201.toArray(i.f161);
            }
        } catch (Exception unused) {
        }
        return new String[]{"0"};
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final boolean mo292xaa30c2c7(String str) {
        try {
            n9 n9Var = b6.f26;
            return a.m2(n9Var.f253, n9Var.f255, str != null ? str.hashCode() : 0) >= 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 你这种烂货完全是当今社会的毒瘤老子要在你狗脑子上面安一个定时炸弹3次密码不对马上爆炸正好为社会除害, reason: contains not printable characters */
    public static final void m4433(String str) {
        f290.getClass();
        try {
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                NotificationManager notificationManager = (NotificationManager) b3.f17.getSystemService(NotificationManager.class);
                String strM615 = AbstractC0020.m615(str);
                Iterator<NotificationChannel> it = notificationManager.getNotificationChannels().iterator();
                while (it.hasNext()) {
                    String id = it.next().getId();
                    if (StringsKt.startsWith$default(id, strM615, false, 2, (Object) null)) {
                        try {
                            notificationManager.deleteNotificationChannel(id);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        Function1 function1 = k.f192;
        File file = v4.f361;
        k.m232(new File(v4.f361, str));
    }

    /* JADX INFO: renamed from: 我tm扯下你妈的灵堂白布给你献哈达, reason: contains not printable characters */
    public static final void m444tm(String str) {
        try {
            c6.m106(str, null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public static final void m445x541a43c1(String str, String str2) {
        try {
            w3.f375.mo88(str, str2);
            c6.m106(str, str2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final void m446dj(String str, String str2) {
        try {
            f290.getClass();
            e2 e2Var = (e2) f291.get(str);
            k4 k4Var = e2Var;
            if (e2Var == null) {
                k4Var = (k4) f292.get(str);
            }
            if (k4Var != null) {
                k4Var.f201.remove(str2);
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m445x541a43c1(r0, r1);
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final void m4475() {
        try {
            v4.m524();
            f290.getClass();
            m462();
            f293xaa30c2c7.open();
        } catch (Throwable unused) {
            f293xaa30c2c7.open();
        }
    }

    /* JADX INFO: renamed from: 上网看看你妈跟你爹我做爱的视频吧你妈活真鸡巴好, reason: contains not printable characters */
    public static final void m449(String str) {
        if (f290.mo290(str)) {
            return;
        }
        m459(str);
    }

    /* JADX INFO: renamed from: 你妈死了转世还是我的一条废狗还有胆骂主人, reason: contains not printable characters */
    public static final File m451(String str) {
        Class cls;
        File file;
        try {
            cls = (Class) MNative.m687(62431, "f221ad5694a99ff2cfd2518512661c60");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null || (file = (File) cls.getConstructor(str.getClass()).newInstance(str)) == null) {
            throw new UnsupportedOperationException();
        }
        return file;
    }

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final void m454() {
        try {
            ConditionVariable conditionVariable = f293xaa30c2c7;
            conditionVariable.close();
            f291.clear();
            f292.clear();
            n9 n9Var = f294;
            n9Var.f255 = 0;
            n9Var.f253 = i.f158;
            n9Var.f254 = i.f160;
            f290.getClass();
            m462();
            conditionVariable.open();
        } catch (Throwable unused) {
            f293xaa30c2c7.open();
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m456(e2 e2Var, ComponentName componentName, int i) {
        e2Var.f73xb7bf1d91.m405(componentName.getClassName(), i);
        e2Var.f73xb7bf1d91.m403();
    }

    static {
        new Thread(r5::m4475).start();
        f294 = new n9(0);
    }

    /* JADX INFO: renamed from: 你曾认狗做父也曾失去过亲妈二者让你受益良多, reason: contains not printable characters */
    public static void m458(String str) {
        e2 e2Var = (e2) f291.remove(str);
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m442(r0, r1);
        });
    }

    /* JADX INFO: renamed from: 爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑, reason: contains not printable characters */
    public static void m459(String str) {
        try {
            m458(str);
            ExecutorService executorService = AbstractC0030.f466;
            Runnable runnable = () -> {
                m4433(r0);
            };
            ExecutorService executorService2 = AbstractC0030.f467;
            executorService2.execute(runnable);
            executorService2.execute(() -> {
                m444tm(r1);
            });
            m3.f224.getClass();
            m3.m3095();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static void m460(String str, String str2) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m446dj(r0, r1);
        });
    }

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static ComponentInfo m463(ComponentName componentName) {
        try {
            e2 e2Var = (e2) f291.get(componentName.getPackageName());
            if (e2Var == null) {
                return null;
            }
            return (ComponentInfo) e2Var.f72.f258.m385(componentName.getClassName().hashCode());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final ActivityInfo mo268(ComponentName componentName) {
        return (ActivityInfo) m463(componentName);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final void mo286(String str, String str2) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m453x4f52efc(r0, r1);
        });
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final ActivityInfo mo267(ComponentName componentName) {
        return (ActivityInfo) m463(componentName);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final ServiceInfo mo269xaa30c2c7(ComponentName componentName) {
        return (ServiceInfo) m463(componentName);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final ResolveInfo mo273(Intent intent, String str, int i) {
        return (ResolveInfo) CollectionsKt.firstOrNull(q1.m429(mo275(intent, str, i)));
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static void m462() throws ExecutionException, InterruptedException {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        boolean z = c2.f33;
        ArrayList arrayList = new ArrayList();
        try {
            File[] fileArrListFiles = c2.f34.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        File file2 = new File(file, "installation.bin");
                        if (file2.exists()) {
                            arrayList.add(file2);
                        } else {
                            Function1 function1 = k.f192;
                            k.m232(file);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bytes = FilesKt.readBytes((File) it.next());
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                PackageInfo packageInfo2 = (PackageInfo) parcelObtain.readParcelable(PackageInfo.class.getClassLoader());
                PackageInfo packageInfo3 = packageInfo2;
                if (packageInfo2 == null) {
                    packageInfo3 = packageInfo;
                    packageInfo = new PackageInfo();
                }
                ApplicationInfo applicationInfo2 = packageInfo3.applicationInfo;
                ApplicationInfo applicationInfo3 = applicationInfo2;
                if (applicationInfo2 == null) {
                    applicationInfo3 = applicationInfo;
                    applicationInfo = new ApplicationInfo();
                }
                e2 e2Var = new e2(packageInfo3, applicationInfo3);
                ExecutorService executorService = AbstractC0030.f466;
                arrayList2.add(AbstractC0030.f467.submit(() -> {
                    m450(r1);
                }));
                f291.put(e2Var.f200, e2Var);
            } catch (Throwable unused2) {
            }
            parcelObtain.recycle();
        }
        m461dj();
        if (u5.f354 == 0) {
            int i = 1;
            while (true) {
                if (i < 25) {
                    try {
                        n9 n9Var = u5.f350.f358;
                        if (a.m2(n9Var.f253, n9Var.f255, i) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    } catch (Exception unused3) {
                        i = 0;
                        break;
                    }
                }
                i = 0;
                break;
            }
            int i2 = i;
            u5.m506(i2);
            u5.f354 = i2;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((Future) it2.next()).get();
        }
        m3.f224.getClass();
        m3.m3095();
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final ProviderInfo mo270(ComponentName componentName) {
        return (ProviderInfo) m463(componentName);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final ResolveInfo mo274xaa30c2c7(Intent intent, String str, int i) {
        return (ResolveInfo) CollectionsKt.firstOrNull(q1.m429(mo271(intent, str, i)));
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final List mo275(Intent intent, String str, int i) {
        return m464(intent, str, i, new o5(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.p5
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).serviceInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
            }
        }), q5.f282);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final List mo271(Intent intent, String str, int i) {
        return m464(intent, str, i, new f5(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.g5
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).activityInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
            }
        }), h5.f129);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final boolean mo263x541a43c1(String str) {
        return f291.containsKey(str) || f292.containsKey(str);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m442(String str, e2 e2Var) {
        try {
            boolean z = c2.f33;
            Function1 function1 = k.f192;
            k.m232(new File(c2.f34, str));
            if (e2Var != null) {
                r5 r5Var = f290;
                PackageInfo packageInfo = e2Var.f69;
                r5Var.getClass();
                m466(packageInfo);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public static final void m453x4f52efc(String str, String str2) {
        try {
            f290.getClass();
            e2 e2Var = (e2) f291.get(str);
            k4 k4Var = e2Var;
            if (e2Var == null) {
                k4Var = (k4) f292.get(str);
            }
            if (k4Var != null) {
                k4Var.f201.add(str2);
            } else {
                f292.put(str, new k4(str, new o9(str2)));
                m3.f224.getClass();
                m3.m3095();
            }
            File fileM428 = q1.m428(c6.f40, str, str2);
            if (fileM428.mkdirs()) {
                k.m230(fileM428);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable, top.bienvenido.date_24323.n9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m466(PackageInfo packageInfo) {
        try {
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    String str = providerInfo.authority;
                    if (str != null) {
                        char[] cArr = new char[1];
                        cArr[0] = ';';
                        List<String> listSplit$default = StringsKt.split$default(str, cArr, false, 0, 6, (Object) null);
                        if (listSplit$default == null) {
                            continue;
                        } else {
                            for (String str2 : listSplit$default) {
                                ?? r0 = f294;
                                synchronized (r0) {
                                    try {
                                        r0.m388(str2.hashCode());
                                    } catch (Throwable th) {
                                        throw r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final ArrayList mo296(int i) {
        C0031x7011f1e3 c0031x7011f1e3 = f291;
        ArrayList arrayList = new ArrayList(c0031x7011f1e3.f470);
        try {
            Iterator it = c0031x7011f1e3.values().iterator();
            while (it.hasNext()) {
                arrayList.add(n2.f235.m324(((e2) it.next()).f69, i));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final ArrayList mo297xaa30c2c7(int i) {
        C0031x7011f1e3 c0031x7011f1e3 = f291;
        ArrayList arrayList = new ArrayList(c0031x7011f1e3.f470);
        try {
            Iterator it = c0031x7011f1e3.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((e2) it.next()).f70);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static void m461dj() {
        o9 o9Var;
        o9 o9Var2;
        o9 o9Var3;
        try {
            File file = c6.f40;
            ArrayList<File> arrayList = new ArrayList();
            File[] fileArrListFiles = c6.f40.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2);
                    }
                }
            }
            for (File file3 : arrayList) {
                String name = file3.getName();
                e2 e2Var = (e2) f291.get(name);
                if (e2Var == null) {
                    Context context = b3.f17;
                    if (b3.m57((v1) -> {
                        return m448(r0, v1);
                    }) == null) {
                        ExecutorService executorService = AbstractC0030.f466;
                        AbstractC0030.f467.execute(() -> {
                            m449(r0);
                        });
                    } else {
                        C0031x7011f1e3 c0031x7011f1e3 = f292;
                        File[] fileArrListFiles2 = file3.listFiles();
                        if (fileArrListFiles2 != null) {
                            o9Var2 = o9Var3;
                            o9Var3 = new o9(fileArrListFiles2.length);
                            for (File file4 : fileArrListFiles2) {
                                o9Var2.add(file4.getName());
                            }
                        } else {
                            o9Var2 = o9Var;
                            o9Var = new o9("0");
                        }
                        c0031x7011f1e3.put(name, new k4(name, o9Var2));
                    }
                } else {
                    File[] fileArrListFiles3 = file3.listFiles();
                    if (fileArrListFiles3 != null) {
                        o9 o9Var4 = e2Var.f201;
                        for (File file5 : fileArrListFiles3) {
                            o9Var4.add(file5.getName());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final List mo276(Intent intent, String str, int i) {
        return m464(intent, str, i, new i5(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.j5
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).providerInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).providerInfo = (ProviderInfo) obj2;
            }
        }), k5.f202);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e A[Catch: Exception -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0065, blocks: (B:2:0x0000, B:4:0x0005, B:5:0x0014, B:7:0x001d, B:12:0x003a, B:15:0x0044, B:17:0x004c, B:21:0x0056, B:27:0x006d, B:30:0x0077, B:34:0x0085, B:36:0x008e), top: B:42:0x0000 }] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼 */
    public final ArrayList mo2985(String str, String str2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f291.values().iterator();
            while (it.hasNext()) {
                ProviderInfo[] providerInfoArr = ((e2) it.next()).f69.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (providerInfo.authority != null && (str == null || Intrinsics.areEqual(str, providerInfo.processName))) {
                            if (str2 != null && str2.length() != 0) {
                                Bundle bundle = providerInfo.metaData;
                                if (bundle != null && bundle.containsKey(str2)) {
                                    arrayList.add(providerInfo);
                                }
                            } else {
                                arrayList.add(providerInfo);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final int mo284(String str) {
        if (str == null) {
            return -1;
        }
        try {
            for (e2 e2Var : f291.values()) {
                if (Intrinsics.areEqual(str, e2Var.f69.sharedUserId)) {
                    return e2Var.f70.uid;
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final int mo285(String str, int i) {
        Pair pairM248;
        Object objM687;
        try {
            objM687 = MNative.m687(62427, null);
        } catch (Throwable unused) {
        }
        if (!(objM687 == null ? false : Boolean.parseBoolean(objM687.toString()))) {
            return -11;
        }
        try {
            Function0 function0 = () -> {
                return m451(r1);
            };
            switch (i) {
                case 0:
                    pairM248 = l1.m248((File) function0.invoke(), false);
                    break;
                case 1:
                    pairM248 = l1.m247((File) function0.invoke(), false);
                    break;
                case 2:
                    m458(str);
                    return 1;
                case 3:
                    pairM248 = l1.m248((File) function0.invoke(), true);
                    break;
                case 4:
                    pairM248 = l1.m247((File) function0.invoke(), true);
                    break;
                default:
                    return -10;
            }
            Pair pair = pairM248;
            e2 e2Var = (e2) pair.getSecond();
            if (e2Var != null) {
                e2 e2Var2 = (e2) f291.put(e2Var.f200, e2Var);
                ExecutorService executorService = AbstractC0030.f466;
                AbstractC0030.f467.execute(() -> {
                    m452(r0, r1);
                });
            }
            return ((Number) pair.getFirst()).intValue();
        } catch (Exception unused2) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final String[] mo281xb7bf1d91(int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = f291.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((e2) entry.getValue()).f70.uid == i) {
                    arrayList.add(entry.getKey());
                }
            }
        } catch (Exception unused) {
        }
        return (String[]) arrayList.toArray(i.f161);
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final void mo289xb7bf1d91() {
        f293xaa30c2c7.block(10000L);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m450(e2 e2Var) {
        try {
            n2.m318(e2Var, 0);
            r5 r5Var = f290;
            PackageInfo packageInfo = e2Var.f69;
            r5Var.getClass();
            m465(packageInfo);
            e2Var.f73xb7bf1d91.m402();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下 */
    public final void mo279(String str) {
        File file = v4.f361;
        if (str == null) {
            return;
        }
        try {
            File file2 = new File(str);
            file2.mkdirs();
            v4.f361 = file2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m448(String str, PackageManager packageManager) {
        return packageManager.getPackageInfo(str, 512);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static List m464(Intent intent, String str, int i, Function2 function2, Function4 function4) {
        ArrayList arrayList = new ArrayList();
        try {
            ComponentName component = intent.getComponent();
            ComponentName component2 = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                component2 = selector != null ? selector.getComponent() : null;
            }
            if (component2 != null) {
                ComponentName componentName = component2;
                f290.getClass();
                ComponentInfo componentInfoM463 = m463(componentName);
                if (componentInfoM463 != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    function2.invoke(resolveInfo, componentInfoM463);
                    arrayList.add(resolveInfo);
                    return arrayList;
                }
            } else {
                String str2 = intent.getPackage();
                if (str2 != null) {
                    e2 e2Var = (e2) f291.get(str2);
                    if (e2Var != null) {
                        return (List) function4.invoke(e2Var.f71xaa30c2c7, intent, str, Integer.valueOf(i));
                    }
                } else {
                    Iterator it = f291.values().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll((Collection) function4.invoke(((e2) it.next()).f71xaa30c2c7, intent, str, Integer.valueOf(i)));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final List mo272(Intent intent, String str, int i) {
        return m464(intent, str, i, new l5(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.m5
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).activityInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
            }
        }), n5.f240);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable, top.bienvenido.date_24323.n9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m465(PackageInfo packageInfo) {
        try {
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    String str = providerInfo.authority;
                    if (str != null) {
                        char[] cArr = new char[1];
                        cArr[0] = ';';
                        List<String> listSplit$default = StringsKt.split$default(str, cArr, false, 0, 6, (Object) null);
                        if (listSplit$default == null) {
                            continue;
                        } else {
                            for (String str2 : listSplit$default) {
                                ?? r0 = f294;
                                synchronized (r0) {
                                    try {
                                        r0.m386(str2.hashCode(), providerInfo);
                                        Unit unit = Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        throw r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final boolean mo290(String str) {
        try {
            if (str == null) {
                new Thread(r5::m454).start();
                return true;
            }
            boolean z = c2.f33;
            if (!new File(c2.f34, str).exists()) {
                return false;
            }
            File fileM98 = c2.m98(str);
            if (mo285(fileM98.getAbsolutePath(), 4) < 0) {
                return false;
            }
            Function1 function1 = k.f192;
            k.m232(fileM98);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final ArrayList mo299() {
        C0031x7011f1e3 c0031x7011f1e3 = f291;
        int i = c0031x7011f1e3.f470;
        C0031x7011f1e3 c0031x7011f1e4 = f292;
        ArrayList arrayList = new ArrayList(i + c0031x7011f1e4.f470);
        try {
            arrayList.addAll(c0031x7011f1e3.keySet());
            arrayList.addAll(c0031x7011f1e4.keySet());
            return arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo291(int i) {
        if (i == 0) {
            b6.m62();
        } else {
            n9 n9Var = b6.f26;
            b6.f26 = new n9(0);
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m455(List list) {
        e2 e2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageManager.ComponentEnabledSetting componentEnabledSetting = (PackageManager.ComponentEnabledSetting) it.next();
            ComponentName componentName = componentEnabledSetting.getComponentName();
            if (componentName != null && (e2Var = (e2) f291.get(componentName.getPackageName())) != null) {
                e2Var.f73xb7bf1d91.m405(componentName.getClassName(), componentEnabledSetting.getEnabledState());
                e2Var.f73xb7bf1d91.m403();
            }
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final String mo282(int i) {
        try {
            Iterator it = f291.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((e2) entry.getValue()).f70.uid == i) {
                    return (String) entry.getKey();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final String[] mo283(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        boolean z = false;
        String[] strArr = new String[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            try {
                String strMo282 = mo282(iArr[i]);
                if (strMo282 != null) {
                    strArr[i] = strMo282;
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        if (z) {
            return strArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m452(e2 e2Var, e2 e2Var2) {
        try {
            n2.m318(e2Var, e2Var2 != null ? 2 : 1);
            r5 r5Var = f290;
            PackageInfo packageInfo = e2Var.f69;
            r5Var.getClass();
            m465(packageInfo);
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo293(List list) {
        try {
            if (list.isEmpty()) {
                return;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m455(r0);
            });
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo294(ComponentName componentName, int i) {
        try {
            e2 e2Var = (e2) f291.get(componentName.getPackageName());
            if (e2Var == null) {
                return;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m456(r0, r1, r2);
            });
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final int mo295(ComponentName componentName) {
        try {
            e2 e2Var = (e2) f291.get(componentName.getPackageName());
            if (e2Var == null) {
                return -1;
            }
            return e2Var.f73xb7bf1d91.m404(componentName.getClassName());
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final void mo287(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            m460(str, str2);
        } else {
            m459(str);
        }
    }
}
