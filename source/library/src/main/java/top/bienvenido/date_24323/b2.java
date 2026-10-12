package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b2.class */
public final class b2 implements l0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final u1 f13;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final u1 f14;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final a2 f15;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final x1 f16;

    public b2(PackageParser.Package r9) {
        this.f13 = new u1(this, r9.activities);
        this.f14 = new u1(this, r9.receivers);
        this.f15 = new a2(this, r9.services);
        this.f16 = new x1(this, r9.providers);
    }

    @Override // top.bienvenido.date_24323.l0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final List mo52(Intent intent, String str, int i) {
        u1 u1Var = this.f13;
        u1Var.getClass();
        return u1Var.m571(intent, str, (i & 65536) != 0, i);
    }

    @Override // top.bienvenido.date_24323.l0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final List mo53(Intent intent, String str, int i) {
        u1 u1Var = this.f14;
        u1Var.getClass();
        return u1Var.m571(intent, str, (i & 65536) != 0, i);
    }

    @Override // top.bienvenido.date_24323.l0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final List mo54(Intent intent, String str, int i) {
        a2 a2Var = this.f15;
        a2Var.getClass();
        return a2Var.m571(intent, str, (i & 65536) != 0, i);
    }

    @Override // top.bienvenido.date_24323.l0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final List mo55(Intent intent, String str, int i) {
        x1 x1Var = this.f16;
        x1Var.getClass();
        return x1Var.m571(intent, str, (i & 65536) != 0, i);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m51(b2 b2Var, ComponentInfo componentInfo, Function2 function2, PackageParser.IntentInfo intentInfo, int i, int i2) {
        if (!componentInfo.enabled && (i & 512) == 0) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        if ((i & 64) != 0) {
            resolveInfo.filter = intentInfo;
        }
        resolveInfo.match = i2;
        resolveInfo.nonLocalizedLabel = intentInfo.nonLocalizedLabel;
        resolveInfo.priority = intentInfo.getPriority();
        resolveInfo.icon = intentInfo.icon;
        resolveInfo.labelRes = intentInfo.labelRes;
        resolveInfo.isDefault = intentInfo.hasDefault;
        function2.invoke(resolveInfo, componentInfo);
        return resolveInfo;
    }
}
