package top.bienvenido.date_24323;

import android.app.ActivityThread;
import android.app.Application;
import android.app.IActivityManager;
import android.app.Instrumentation;
import android.app.LoadedApk;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.ddm.DdmHandleAppName;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.security.net.config.NetworkSecurityConfigProvider;
import android.system.Os;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net_62v.external.C0000;
import top.bienvenido.mundo.common.initialize.MNative;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/h6.class */
public final class h6 extends t {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final h6 f130 = new h6();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ActivityThread f131;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final Handler f132;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final u2 f133xaa30c2c7;

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final Object f134;

    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public static final u2 f135xb7bf1d91;

    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public static final u2 f136;

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final u2 f1375;

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final u2 f138;

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static final u2 f139;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final u2 f140dj;

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public static final u2 f141x541a43c1;

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public static final ConditionVariable f142x4f52efc;

    /* JADX INFO: renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public static Function0 f143;

    /* JADX INFO: renamed from: 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你, reason: contains not printable characters */
    public static final u2 f144;

    /* JADX INFO: renamed from: 爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑, reason: contains not printable characters */
    public static Function0 f145;

    /* JADX INFO: renamed from: 你这种烂货完全是当今社会的毒瘤老子要在你狗脑子上面安一个定时炸弹3次密码不对马上爆炸正好为社会除害, reason: contains not printable characters */
    public static final Map f1463;

    /* JADX INFO: renamed from: 我tm扯下你妈的灵堂白布给你献哈达, reason: contains not printable characters */
    public static final u2 f147tm;

    /* JADX INFO: renamed from: 你曾认狗做父也曾失去过亲妈二者让你受益良多, reason: contains not printable characters */
    public static final Class f148;

    /* JADX INFO: renamed from: 你妈死了转世还是我的一条废狗还有胆骂主人, reason: contains not printable characters */
    public static final u2 f149;

    /* JADX INFO: renamed from: 上网看看你妈跟你爹我做爱的视频吧你妈活真鸡巴好, reason: contains not printable characters */
    public static final u2 f150;

    /* JADX INFO: renamed from: 你傻屄东西吃你妈奶屄水去吧滚你妈的畜生你肏妈的臭屄老子把你妈吊起来吊打她的阴道老子把她妈毛毛虫放到她的阴道里面生出了你这个杂种给老子滚, reason: contains not printable characters */
    public static final u2 f151x46926078;

    /* JADX INFO: renamed from: 你妈的死亡通知书由文学家标爷也就是你野爹我来谱写, reason: contains not printable characters */
    public static final u2 f152;

    /* JADX INFO: renamed from: 我一拳把你个造谣智障砸进你婊子妈屁眼子里幻化成屎你妈这吃屎的废物还以为你爹我学会了复制神功复制出一坨屎给她吃呢, reason: contains not printable characters */
    public static final Constructor f153;

    /* JADX INFO: renamed from: 要是有癫痫可以不用讲话也最好少玩游戏病那么重了还熬夜打排位是准备早点去见阎王爷和您亲妈野妈欢聚一堂您这操作技术我也实在感佩我着实担心你爸外遇不够多几场排位下来您不计其数的野妈也死得够呛, reason: contains not printable characters */
    public static final Map f154x4b3a412e;

    /* JADX INFO: renamed from: 小孤儿看你亲生的小麻麻被我压在床下日的嗷嗷叫唤最后再来一发俄国进口沙皇炸弹瞄准你那天的年夜饭现场霎时间你一家亲戚灰飞烟灭, reason: contains not printable characters */
    public static final p2 f155;

    /* JADX INFO: renamed from: 我tm扯下你妈的灵堂白布给你献哈达, reason: contains not printable characters */
    public final void m166tm() {
        PackageInfo packageInfo;
        u2 u2Var;
        q2 q2Var;
        try {
            ExecutorService executorService = AbstractC0030.f466;
            k1 k1Var = k1.f194;
            AbstractC0030.f467.execute(k1Var::m237);
            String str = f4.f93;
            String str2 = "Creating process for " + str;
            String str3 = f4.f92;
            ArrayList arrayList = new ArrayList();
            if (f4.f96) {
                packageInfo = (PackageInfo) e5.f77xaa30c2c7.m222((v1) -> {
                    return m184(r1, v1);
                });
            } else {
                Context context = b3.f17;
                packageInfo = (PackageInfo) b3.m57((v1) -> {
                    return m185(r0, v1);
                });
            }
            PackageInfo packageInfo2 = packageInfo;
            if (packageInfo2 != null) {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                ea.f84.mo432(ea.f82, Integer.valueOf(applicationInfo.targetSdkVersion));
                ProviderInfo[] providerInfoArr = packageInfo2.providers;
                if (providerInfoArr != null) {
                    C0051.m649(applicationInfo);
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (providerInfo.authority != null && Intrinsics.areEqual(providerInfo.processName, str) && providerInfo.enabled) {
                            providerInfo.applicationInfo = applicationInfo;
                            arrayList.add(providerInfo);
                        }
                    }
                    if (arrayList.size() > 1) {
                        CollectionsKt.sortWith(arrayList, new f6());
                    }
                }
            }
            u2 u2Var2 = f135xb7bf1d91;
            Object obj = f134;
            u2Var2.mo394(obj, arrayList);
            f139.mo394(obj, str);
            f144.mo432((Object) null, str);
            if (AbstractC0065x6082d607.f505) {
                DdmHandleAppName.setAppName(str, str3, b3.f20);
            } else {
                DdmHandleAppName.setAppName(str, b3.f20);
            }
            f141x541a43c1.mo394(f131, (Object) null);
            if (AbstractC0065x6082d607.f503) {
                ea.f83.mo432((Object) null, str3);
                if (AbstractC0065x6082d607.f504xb7bf1d91) {
                    ea.f85.mo432((Object) null, f4.f95xaa30c2c7);
                }
            } else if (!AbstractC0065x6082d607.f499) {
                String str4 = (String) e5.f77xaa30c2c7.m222((v1) -> {
                    return m186(r1, v1);
                });
                if (str4 != null && str4.length() != 0) {
                    Os.setenv("EXTERNAL_STORAGE", str4, true);
                    Os.unsetenv("EMULATED_STORAGE_TARGET");
                    Os.unsetenv("SECONDARY_STORAGE");
                    try {
                        Method declaredMethod = Environment.class.getDeclaredMethod("initForCurrentUser", i.f159);
                        declaredMethod.setAccessible(true);
                        u2Var = q2Var;
                        q2Var = new q2(declaredMethod);
                    } catch (Exception unused) {
                        u2Var = u2.f337;
                    }
                    u2Var.mo432((Object) null, new Object[0]);
                }
            }
            String str5 = f4.f98;
            if (str5.length() > 0) {
                m200(str5);
            }
        } catch (Throwable unused2) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x009f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final void m1675() {
        /*
            r7 = this;
            r0 = r7
            java.util.concurrent.ExecutorService r1 = top.bienvenido.date_24323.AbstractC0030.f466     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            void r0 = r0::m166tm     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            java.util.concurrent.ExecutorService r1 = top.bienvenido.date_24323.AbstractC0030.f467     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r2 = r0; r0 = r1; r1 = r2;      // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            kotlin.jvm.functions.Function0 r1 = top.bienvenido.date_24323.h6.f145     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            android.app.LoadedApk r1 = (android.app.LoadedApk) r1     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r7 = r1
            top.bienvenido.date_24323.u2 r1 = top.bienvenido.date_24323.h6.f1375     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r2 = r7
            java.lang.Object r3 = top.bienvenido.date_24323.h6.f134     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r8 = r3
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r3 = r8
            r4 = r2; r2 = r3; r3 = r4;      // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r1.mo394(r2, r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            top.bienvenido.date_24323.u2 r1 = top.bienvenido.date_24323.h6.f138     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r2 = r8
            r3 = r7
            r1.mo394(r2, r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            top.bienvenido.date_24323.u2 r0 = top.bienvenido.date_24323.h6.f140dj     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r1 = r7
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r3 = r2
            r4 = r3
            r7 = r4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r5 = 0
            r6 = r4; r4 = r5; r5 = r6;      // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r3[r4] = r5     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r3 = 1
            r4 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r2 = r7
            java.lang.Object r0 = r0.mo432(r1, r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r7 = r0
            top.bienvenido.date_24323.u2 r0 = top.bienvenido.date_24323.h6.f141x541a43c1     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r8 = r0
            android.app.ActivityThread r0 = top.bienvenido.date_24323.h6.f131     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r1 = r0
            r9 = r1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r7
            r2.mo394(r3, r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            m198(r1)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            android.app.Instrumentation r0 = r0.getInstrumentation()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r1 = r0
            r8 = r1
            r1 = r7
            r0.callApplicationOnCreate(r1)     // Catch: java.lang.Throwable -> L78
            goto L80
        L78:
            r9 = move-exception
            r0 = r8
            r1 = r7
            r2 = r9
            boolean r0 = r0.onException(r1, r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
        L80:
            java.util.concurrent.ExecutorService r0 = top.bienvenido.date_24323.AbstractC0030.f466     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            void r0 = top.bienvenido.date_24323.h6::m187     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            java.util.concurrent.ExecutorService r1 = top.bienvenido.date_24323.AbstractC0030.f467     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r2 = r0; r0 = r1; r1 = r2;      // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r0.execute(r1)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
        L92:
            android.os.ConditionVariable r0 = top.bienvenido.date_24323.h6.f142x4f52efc     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r0.open()
            goto Lab
        L9b:
            r7 = move-exception
            goto La3
        L9f:
            goto L92
        La3:
            r0 = r7
            android.os.ConditionVariable r1 = top.bienvenido.date_24323.h6.f142x4f52efc
            r1.open()
            throw r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.bienvenido.date_24323.h6.m1675():void");
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public final void mo171xb7bf1d91(IBinder iBinder) {
        f132.post(() -> {
            m1955(r1);
        });
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final void mo172() {
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final Unit m175dj() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public static final void m176x541a43c1() {
        try {
            C0009.f449.mo10();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public static final void m177x4f52efc() {
        try {
            C0056.f484.mo10();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public static final void m178() {
        AbstractC0057[] abstractC0057Arr = {C0061x65bc39fd.f488, o8.f266, s9.f325, e9.f81, t6.f332, la.f216, i1.f162, C0032.f472, C0035.f473, C0054.f483, C0070.f521, e.f67, h.f124, w0.f370, a3.f3, o6.f263, q8.f284, p8.f275, da.f66, ia.f177};
        for (int i = 0; i < 20; i++) {
            try {
                abstractC0057Arr[i].mo10();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你, reason: contains not printable characters */
    public static final void m179() {
        if (AbstractC0065x6082d607.f501) {
            try {
                j9.f191.mo10();
            } catch (Throwable unused) {
            }
            if (AbstractC0065x6082d607.f503) {
                try {
                    C0007.f448.mo10();
                } catch (Throwable unused2) {
                }
                if (AbstractC0065x6082d607.f504xb7bf1d91) {
                    try {
                        C0018.f455.mo10();
                    } catch (Throwable unused3) {
                    }
                    if (AbstractC0065x6082d607.f512 && AbstractC0065x6082d607.f5065) {
                        try {
                            r.f285.mo10();
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
        }
        t9.m492();
        u2 u2Var = a5.f4;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: 爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑, reason: contains not printable characters */
    public static final void m181() {
        Object attributionSource;
        b5 b5Var;
        try {
            int i = MNative.f531;
            if (AbstractC0065x6082d607.f5065) {
                attributionSource = b3.f17.getAttributionSource();
            } else if (AbstractC0065x6082d607.f503) {
                attributionSource = null;
            } else {
                attributionSource = b5Var;
                b5Var = new b5();
            }
            MNative.m687(1003, new Object[]{b3.f18, attributionSource, new c5()});
            if (AbstractC0065x6082d607.f514) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler((v1, v2) -> {
                    m180(r0, v1, v2);
                });
            }
            Object obj = ea.f82;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static final Unit m183() {
        f143 = h6::m175dj;
        try {
            ExecutorService executorService = AbstractC0030.f466;
            Runnable runnable = h6::m176x541a43c1;
            ExecutorService executorService2 = AbstractC0030.f467;
            Future<?> futureSubmit = executorService2.submit(runnable);
            Future<?> futureSubmit2 = executorService2.submit(h6::m177x4f52efc);
            Future<?> futureSubmit3 = executorService2.submit(h6::m178);
            Future<?> futureSubmit4 = executorService2.submit(h6::m179);
            Future<?> futureSubmit5 = executorService2.submit(h6::m181);
            Future[] futureArr = new Future[5];
            futureArr[0] = futureSubmit;
            futureArr[1] = futureSubmit2;
            futureArr[2] = futureSubmit3;
            futureArr[3] = futureSubmit4;
            futureArr[4] = futureSubmit5;
            f132.post(() -> {
                m182(r1);
            });
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final String m186(String str, p0 p0Var) {
        return p0Var.mo278x4f52efc(str);
    }

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final void m187() {
        try {
            C0000 c0000 = t0.f327;
            if ((c0000 != null ? c0000.f0.shouldInterpretFacebookBrowser() : false) && ArraysKt.contains(l.f207, f4.f92)) {
                Application applicationCurrentApplication = ActivityThread.currentApplication();
                if (applicationCurrentApplication != null) {
                    ClassLoader classLoader = applicationCurrentApplication.getClassLoader();
                    if (classLoader != null) {
                        Class<?> clsLoadClass = classLoader.loadClass("com.facebook.login.LoginBehavior");
                        Field declaredField = clsLoadClass.getDeclaredField("NATIVE_WITH_FALLBACK");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Field declaredField2 = clsLoadClass.getDeclaredField("allowsGetTokenAuth");
                        declaredField2.setAccessible(true);
                        Boolean bool = Boolean.FALSE;
                        declaredField2.set(obj, bool);
                        Field declaredField3 = clsLoadClass.getDeclaredField("allowsKatanaAuth");
                        declaredField3.setAccessible(true);
                        declaredField3.set(obj, bool);
                        Field declaredField4 = clsLoadClass.getDeclaredField("allowsFacebookLiteAuth");
                        declaredField4.setAccessible(true);
                        declaredField4.set(obj, bool);
                        Field declaredField5 = clsLoadClass.getDeclaredField("allowsInstagramAppAuth");
                        declaredField5.setAccessible(true);
                        declaredField5.set(obj, bool);
                    }
                }
            }
            C0000 c0001 = t0.f327;
            if (c0001 != null) {
                c0001.f0.onCreate(f4.f92, f4.f93, f4.f94);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 你这种烂货完全是当今社会的毒瘤老子要在你狗脑子上面安一个定时炸弹3次密码不对马上爆炸正好为社会除害, reason: contains not printable characters */
    public static final LoadedApk m1893() throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext = b3.f17.createPackageContext(f4.f92, 3);
        LoadedApk loadedApk = (LoadedApk) new p2("mPackageInfo").f270.mo393(contextCreatePackageContext);
        f145 = () -> {
            return m188(r0);
        };
        if (!AbstractC0065x6082d607.f503) {
            return loadedApk;
        }
        try {
            NetworkSecurityConfigProvider.install(contextCreatePackageContext);
            return loadedApk;
        } catch (Throwable unused) {
            return loadedApk;
        }
    }

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m191(IBinder iBinder, Intent intent) {
        try {
            Service service = (Service) f1463.get(iBinder);
            if (service == null) {
                return;
            }
            intent.setExtrasClassLoader(service.getClassLoader());
            IBinder iBinderOnBind = service.onBind(intent);
            e4.f76xaa30c2c7.m222((v3) -> {
                return m190(r1, r2, r3, v3);
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final void m192(IBinder iBinder, Intent intent) {
        try {
            Service service = (Service) f1463.get(iBinder);
            if (service == null) {
                return;
            }
            if (intent != null) {
                intent.setExtrasClassLoader(service.getClassLoader());
            } else {
                intent = null;
            }
            service.onUnbind(intent);
        } catch (Exception unused) {
        }
    }

    static {
        Handler handler;
        Class<?> cls;
        Constructor<?> constructor;
        u2 s2Var;
        r2 r2Var;
        u2 s2Var2;
        Handler handler2;
        r2 r2Var2;
        ActivityThread activityThreadCurrentActivityThread = ActivityThread.currentActivityThread();
        f131 = activityThreadCurrentActivityThread;
        try {
            if (AbstractC0065x6082d607.f5065) {
                handler2 = activityThreadCurrentActivityThread.getHandler();
            } else {
                try {
                    Field declaredField = ActivityThread.class.getDeclaredField("mH");
                    declaredField.setAccessible(true);
                    if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                        s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField));
                    } else {
                        s2Var2 = r2Var2;
                        r2Var2 = new r2(declaredField);
                    }
                } catch (Exception unused) {
                    s2Var2 = u2.f337;
                }
                handler2 = (Handler) s2Var2.mo393(activityThreadCurrentActivityThread);
            }
            handler = handler2;
        } catch (Throwable unused2) {
            handler = handler;
            Handler handler3 = new Handler(Looper.getMainLooper());
        }
        f132 = handler;
        f133xaa30c2c7 = t2.m484(ActivityThread.class, "installContentProviders", new Class[]{Context.class, List.class});
        ActivityThread activityThread = f131;
        Object objMo393 = new p2("mBoundApplication").f270.mo393(activityThread);
        f134 = objMo393;
        Class<?> cls2 = objMo393.getClass();
        f135xb7bf1d91 = t2.m483(cls2, "providers");
        f136 = t2.m483(cls2, "restrictedBackupMode");
        f1375 = t2.m483(cls2, "appInfo");
        f138 = t2.m483(cls2, "info");
        f139 = t2.m483(cls2, "processName");
        f140dj = t2.m484(LoadedApk.class, AbstractC0065x6082d607.f507 ? "makeApplicationInner" : "makeApplication", new Class[]{Boolean.TYPE, Instrumentation.class});
        f141x541a43c1 = t2.m483(ActivityThread.class, "mInitialApplication");
        f142x4f52efc = new ConditionVariable();
        f143 = h6::m183;
        f144 = t2.m484(Process.class, "setArgV0", new Class[]{String.class});
        f145 = h6::m1893;
        f1463 = (Map) t2.m483(ActivityThread.class, "mServices").mo393(activityThread);
        f147tm = t2.m484(Service.class, "attach", new Class[]{Context.class, ActivityThread.class, String.class, IBinder.class, Application.class, Object.class});
        try {
            cls = Class.forName("android.app.ContextImpl");
        } catch (Exception unused3) {
            cls = Context.class;
        }
        Class<?> cls3 = cls;
        f148 = cls3;
        f149 = t2.m484(cls3, "createAppContext", new Class[]{ActivityThread.class, LoadedApk.class});
        f150 = t2.m484(cls3, "setOuterContext", new Class[]{Context.class});
        f151x46926078 = t2.m484(cls3, "scheduleFinalCleanup", new Class[]{String.class, String.class});
        f152 = t2.m483(Service.class, "mToken");
        try {
            Constructor<?> declaredConstructor = Class.forName(ActivityThread.class.getName() + "$ProviderKey").getDeclaredConstructor(String.class, Integer.TYPE);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (Exception unused4) {
            constructor = null;
        }
        f153 = constructor;
        try {
            Field declaredField2 = ActivityThread.class.getDeclaredField("mProviderMap");
            declaredField2.setAccessible(true);
            if ((declaredField2.getModifiers() & 8) == 0 && !declaredField2.getType().isPrimitive()) {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField2));
            } else {
                s2Var = r2Var;
                r2Var = new r2(declaredField2);
            }
        } catch (Exception unused5) {
            s2Var = u2.f337;
        }
        f154x4b3a412e = (Map) s2Var.mo393(f131);
        f155 = new p2("mProvider");
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo201(String str, Intent intent, IBinder iBinder, int i) {
        try {
            if (!f4.f91) {
                return;
            }
            if (f1463.containsKey(iBinder)) {
                if (i <= 0 || intent == null) {
                    return;
                }
                m199(iBinder, intent, i);
                return;
            }
        } catch (Exception unused) {
        }
        f132.post(() -> {
            m194(r1, r2, r3, r4);
        });
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo170(IBinder iBinder, Intent intent) {
        f132.post(() -> {
            m192(r1, r2);
        });
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final IBinder mo173dj(String str) {
        try {
            f142x4f52efc.block(10000L);
            p2 p2Var = f155;
            Object obj = f154x4b3a412e.get(f153.newInstance(str, Integer.valueOf(b3.f20)));
            if (obj == null) {
                return null;
            }
            IInterface iInterface = (IInterface) p2Var.f270.mo393(obj);
            if (iInterface == null) {
                return null;
            }
            return iInterface.asBinder();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m193(IBinder iBinder, Intent intent, int i) {
        try {
            Service service = (Service) f1463.get(iBinder);
            if (service != null) {
                intent.setExtrasClassLoader(service.getClassLoader());
                service.onStartCommand(intent, 0, i);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m194(String str, Intent intent, IBinder iBinder, int i) {
        Service serviceInstantiateService;
        try {
            LoadedApk loadedApk = (LoadedApk) f145.invoke();
            u2 u2Var = f140dj;
            ActivityThread activityThread = f131;
            Instrumentation instrumentation = activityThread.getInstrumentation();
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.FALSE;
            objArr[1] = instrumentation;
            Object objMo432 = u2Var.mo432((Object) loadedApk, objArr);
            ClassLoader classLoader = loadedApk.getClassLoader();
            if (AbstractC0065x6082d607.f503) {
                serviceInstantiateService = loadedApk.getAppFactory().instantiateService(classLoader, str, intent);
            } else {
                Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(i.f159);
                declaredConstructor.setAccessible(true);
                serviceInstantiateService = (Service) declaredConstructor.newInstance(i.f160);
            }
            Service service = serviceInstantiateService;
            Object objMo433 = f149.mo432((Object) null, activityThread, loadedApk);
            f150.mo432(objMo433, service);
            f147tm.mo432((Object) service, objMo433, activityThread, str, iBinder, objMo432, (IActivityManager) u3.f338.get());
            service.onCreate();
            f1463.put(iBinder, service);
            if (i <= 0 || intent == null) {
                return;
            }
            f130.getClass();
            m199(iBinder, intent, i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 你这种烂货完全是当今社会的毒瘤老子要在你狗脑子上面安一个定时炸弹3次密码不对马上爆炸正好为社会除害, reason: contains not printable characters */
    public static final void m1963(String str) {
        f130.getClass();
        m200(str);
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo168(String str, String str2, String str3, boolean z, String str4) {
        try {
            f4.f92 = str;
            f4.f93 = str2;
            f4.f94 = str3;
            f4.f96 = z;
            File fileM428 = q1.m428(c6.f40, str, str3);
            if (fileM428.mkdirs()) {
                k.m230(fileM428);
            }
            f4.f95xaa30c2c7 = fileM428.getAbsolutePath();
            f4.f91 = true;
            f4.f98 = str4;
            f132.post(this::m1675);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e2 A[Catch: Exception -> 0x0032, TRY_ENTER, TryCatch #1 {Exception -> 0x0032, blocks: (B:2:0x0000, B:12:0x0024, B:14:0x0029, B:16:0x0036, B:17:0x0042, B:19:0x0048, B:23:0x0053, B:24:0x0057, B:26:0x008b, B:44:0x00d3, B:45:0x00d9, B:48:0x00e2, B:51:0x00ec, B:52:0x00f7, B:53:0x0103, B:54:0x010f, B:56:0x0115, B:63:0x012e, B:64:0x0136, B:66:0x013b, B:29:0x0098, B:35:0x00b2, B:32:0x00a5, B:38:0x00b9, B:41:0x00c6), top: B:71:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑, reason: contains not printable characters */
    public static void m200(String str) {
        ProxySelector proxySelector;
        s8 s8Var;
        Proxy.Type type;
        Proxy.Type type2;
        String userInfo;
        String host;
        int port;
        int i;
        try {
            if (str.length() == 0) {
                try {
                    proxySelector = AbstractC0065x6082d607.f500 ? (ProxySelector) Class.forName("sun.net.spi.DefaultProxySelector").newInstance() : null;
                } catch (Exception unused) {
                }
                if (proxySelector == null) {
                    proxySelector = s8Var;
                    s8Var = new s8(Proxy.NO_PROXY);
                }
                ProxySelector.setDefault(proxySelector);
                s8.m478(null, null);
                return;
            }
            URI uriCreate = URI.create(str);
            String scheme = uriCreate.getScheme();
            if (scheme == null) {
                return;
            }
            switch (scheme.hashCode()) {
                case -2038694846:
                    if (!scheme.equals("socks5h")) {
                    }
                    type = Proxy.Type.SOCKS;
                    type2 = type;
                    userInfo = uriCreate.getUserInfo();
                    if (userInfo != null && userInfo.length() != 0) {
                        Authenticator.setDefault(new g6(StringsKt.substringBefore$default(userInfo, ':', (String) null, 2, (Object) null), StringsKt.substringAfter$default(userInfo, ':', (String) null, 2, (Object) null).toCharArray()));
                    }
                    host = uriCreate.getHost();
                    port = uriCreate.getPort();
                    if (host != null) {
                        if (port == -1) {
                            i = 443;
                        } else {
                            i = port;
                        }
                        Proxy proxy = new Proxy(type2, InetSocketAddress.createUnresolved(host, i));
                        s8.m478(host, String.valueOf(port));
                        ProxySelector.setDefault(new s8(proxy));
                        break;
                    }
                    break;
                case -897048346:
                    if (!scheme.equals("socks5")) {
                    }
                    type = Proxy.Type.SOCKS;
                    type2 = type;
                    userInfo = uriCreate.getUserInfo();
                    if (userInfo != null) {
                        Authenticator.setDefault(new g6(StringsKt.substringBefore$default(userInfo, ':', (String) null, 2, (Object) null), StringsKt.substringAfter$default(userInfo, ':', (String) null, 2, (Object) null).toCharArray()));
                    }
                    host = uriCreate.getHost();
                    port = uriCreate.getPort();
                    if (host != null) {
                        if (port == -1) {
                            i = 443;
                        } else {
                            i = port;
                        }
                        Proxy proxy2 = new Proxy(type2, InetSocketAddress.createUnresolved(host, i));
                        s8.m478(host, String.valueOf(port));
                        ProxySelector.setDefault(new s8(proxy2));
                        break;
                    }
                    break;
                case 3213448:
                    if (!scheme.equals("http")) {
                    }
                    type = Proxy.Type.HTTP;
                    type2 = type;
                    userInfo = uriCreate.getUserInfo();
                    if (userInfo != null) {
                        Authenticator.setDefault(new g6(StringsKt.substringBefore$default(userInfo, ':', (String) null, 2, (Object) null), StringsKt.substringAfter$default(userInfo, ':', (String) null, 2, (Object) null).toCharArray()));
                    }
                    host = uriCreate.getHost();
                    port = uriCreate.getPort();
                    if (host != null) {
                        if (port == -1) {
                            i = 443;
                        } else {
                            i = port;
                        }
                        Proxy proxy3 = new Proxy(type2, InetSocketAddress.createUnresolved(host, i));
                        s8.m478(host, String.valueOf(port));
                        ProxySelector.setDefault(new s8(proxy3));
                        break;
                    }
                    break;
                case 99617003:
                    if (!scheme.equals("https")) {
                    }
                    type = Proxy.Type.HTTP;
                    type2 = type;
                    userInfo = uriCreate.getUserInfo();
                    if (userInfo != null) {
                        Authenticator.setDefault(new g6(StringsKt.substringBefore$default(userInfo, ':', (String) null, 2, (Object) null), StringsKt.substringAfter$default(userInfo, ':', (String) null, 2, (Object) null).toCharArray()));
                    }
                    host = uriCreate.getHost();
                    port = uriCreate.getPort();
                    if (host != null) {
                        if (port == -1) {
                            i = 443;
                        } else {
                            i = port;
                        }
                        Proxy proxy4 = new Proxy(type2, InetSocketAddress.createUnresolved(host, i));
                        s8.m478(host, String.valueOf(port));
                        ProxySelector.setDefault(new s8(proxy4));
                        break;
                    }
                    break;
                case 109610287:
                    if (!scheme.equals("socks")) {
                    }
                    type = Proxy.Type.SOCKS;
                    type2 = type;
                    userInfo = uriCreate.getUserInfo();
                    if (userInfo != null) {
                        Authenticator.setDefault(new g6(StringsKt.substringBefore$default(userInfo, ':', (String) null, 2, (Object) null), StringsKt.substringAfter$default(userInfo, ':', (String) null, 2, (Object) null).toCharArray()));
                    }
                    host = uriCreate.getHost();
                    port = uriCreate.getPort();
                    if (host != null) {
                        if (port == -1) {
                            i = 443;
                        } else {
                            i = port;
                        }
                        Proxy proxy5 = new Proxy(type2, InetSocketAddress.createUnresolved(host, i));
                        s8.m478(host, String.valueOf(port));
                        ProxySelector.setDefault(new s8(proxy5));
                        break;
                    }
                    break;
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final void m1955(IBinder iBinder) {
        try {
            Service service = (Service) f1463.remove(iBinder);
            if (service != null) {
                service.onDestroy();
                f152.mo394(service, (Object) null);
                Context baseContext = service.getBaseContext();
                if (f148.isInstance(baseContext)) {
                    u2 u2Var = f151x46926078;
                    Object[] objArr = new Object[2];
                    objArr[0] = service.getClass().getName();
                    objArr[1] = "Service";
                    u2Var.mo432((Object) baseContext, objArr);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m180(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) throws Throwable {
        if (Intrinsics.areEqual(thread.getName(), "application-accelerate-Thread") && (thread instanceof HandlerThread)) {
            ((HandlerThread) thread).getLooper().quit();
        } else {
            if (uncaughtExceptionHandler == null) {
                throw th;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m182(Future[] futureArr) {
        try {
            for (Future future : futureArr) {
                future.get();
            }
            C0000 c0000 = t0.f327;
            if (c0000 != null) {
                c0000.f0.onInitialized();
            }
            n9 n9Var = b9.f29;
            b9.m70();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m184(String str, p0 p0Var) {
        return p0Var.mo265(str, 8);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m185(String str, PackageManager packageManager) {
        return packageManager.getPackageInfo(str, 520);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m198(Application application) {
        List list;
        u2 u2Var = f136;
        Object obj = f134;
        if (Intrinsics.areEqual(u2Var.mo393(obj), Boolean.TRUE) || (list = (List) f135xb7bf1d91.mo393(obj)) == null || list.isEmpty()) {
            return;
        }
        f133xaa30c2c7.mo432((Object) f131, application, list);
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public final void mo174(String str) {
        f4.f98 = str;
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m1963(r0);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final LoadedApk m188(LoadedApk loadedApk) {
        return loadedApk;
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo169(IBinder iBinder, Intent intent) {
        f132.post(() -> {
            m191(r1, r2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m190(IBinder iBinder, Intent intent, IBinder iBinder2, f0 f0Var) {
        return f0Var.mo81(iBinder, intent, iBinder2);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m199(IBinder iBinder, Intent intent, int i) {
        f132.post(() -> {
            m193(r1, r2, r3);
        });
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo202(Intent intent, IBinder iBinder, String str) {
        if (str != null) {
            a5.m17(intent, str);
        } else {
            a5.m16(iBinder, intent);
        }
    }
}
