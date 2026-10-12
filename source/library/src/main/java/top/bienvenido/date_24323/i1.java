package top.bienvenido.date_24323;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.PersistableBundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;
import top.bienvenido.mundo.common.ext.MundoServiceConnection;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/i1.class */
public final class i1 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final i1 f162 = new i1();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final p2 f163 = new p2("service");

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final p2 f164 = new p2("extras");

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final p9 f165xaa30c2c7 = new p9(8);

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        d1 d1VarM71 = b9.m71("jobscheduler", c0082, null);
        if (d1VarM71 == null) {
            return;
        }
        d1VarM71.m118(new int[]{2027195101, -697920873, -1594257912}, new h1());
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m208(JobInfo jobInfo) {
        ComponentName service = jobInfo.getService();
        String packageName = service.getPackageName();
        String str = b3.f18;
        if (Intrinsics.areEqual(packageName, str)) {
            return;
        }
        p9 p9Var = f165xaa30c2c7;
        if (p9Var.m423(service.getClassName().hashCode())) {
            e4.f76xaa30c2c7.m222((v1) -> {
                return m206(r2, v1);
            });
            if (p9Var.f277 > 128) {
                p9Var.f277 = 0;
            }
        }
        p2 p2Var = f164;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putPersistableBundle("mundo_base_bundle", jobInfo.getExtras());
        persistableBundle.putString("mundo_base_string", service.flattenToString());
        Unit unit = Unit.INSTANCE;
        p2Var.f270.mo394(jobInfo, persistableBundle);
        p2 p2Var2 = f163;
        p2Var2.f270.mo394(jobInfo, new ComponentName(str, MundoService$Companion$STUB.class.getName() + f4.f97xb7bf1d91));
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m206(ComponentName componentName, f0 f0Var) {
        return f0Var.mo79(new Intent().setComponent(componentName), new MundoServiceConnection(null), f4.f94);
    }
}
