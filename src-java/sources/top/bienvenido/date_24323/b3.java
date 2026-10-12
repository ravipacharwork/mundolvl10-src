package top.bienvenido.date_24323;

import android.app.ActivityThread;
import android.content.Context;
import android.os.Process;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b3.class */
public abstract class b3 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Context f17;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final String f18;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final int f19;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final int f20;

    static {
        Context context = r1.f287;
        Context baseContext = context;
        if (context == null) {
            x5.m561();
            baseContext = ActivityThread.currentApplication().getBaseContext();
        }
        Context context2 = baseContext;
        f17 = context2;
        f18 = context2.getPackageName();
        int iMyUid = Process.myUid();
        f19 = iMyUid;
        f20 = iMyUid / 100000;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m57(Function1 function1) {
        try {
            return function1.invoke(f17.getPackageManager());
        } catch (Exception unused) {
            return null;
        }
    }
}
