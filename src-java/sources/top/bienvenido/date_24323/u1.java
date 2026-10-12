package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/u1.class */
public final class u1 extends y0 {

    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public final /* synthetic */ b2 f336xb7bf1d91;

    public u1(b2 b2Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f336xb7bf1d91 = b2Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PackageParser.Activity activity = (PackageParser.Activity) it.next();
            if (activity.info != null && (arrayList2 = activity.intents) != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo520((IntentFilter) it2.next());
                }
            }
        }
    }

    @Override // top.bienvenido.date_24323.y0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo6(IntentFilter intentFilter, int i, int i2) {
        PackageParser.ActivityIntentInfo activityIntentInfo = (PackageParser.ActivityIntentInfo) intentFilter;
        return b2.m51(this.f336xb7bf1d91, activityIntentInfo.activity.info, new s1(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.t1
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).activityInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
            }
        }), activityIntentInfo, i2, i);
    }

    @Override // top.bienvenido.date_24323.y0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final int mo7(IntentFilter intentFilter) {
        ActivityInfo activityInfo = ((PackageParser.ActivityIntentInfo) intentFilter).activity.info;
        String str = activityInfo.targetActivity;
        String str2 = str;
        if (str == null) {
            str2 = activityInfo.name;
        }
        return str2.hashCode();
    }
}
